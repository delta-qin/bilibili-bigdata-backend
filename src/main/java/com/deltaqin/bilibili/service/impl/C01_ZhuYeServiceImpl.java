package com.deltaqin.bilibili.service.impl;

import com.deltaqin.bilibili.common.utils.DoubleUtil;
import com.deltaqin.bilibili.dao.ColumnsInfoMapper;
import com.deltaqin.bilibili.dao.ColumnsTopnInfoMapper;
import com.deltaqin.bilibili.dao.VideosInfoMapper;
import com.deltaqin.bilibili.dao.VideosTopnInfoMapper;
import com.deltaqin.bilibili.dataobject.ColumnsTopnInfo;
import com.deltaqin.bilibili.dataobject.VideosTopnInfo;
import com.deltaqin.bilibili.model.Top5ThreeModel;
import com.deltaqin.bilibili.model.VideosTopnInfoModel;
import com.deltaqin.bilibili.redis.prefix.VideoKeyPrefix;
import com.deltaqin.bilibili.service.C01_ZhuYeService;
import com.deltaqin.bilibili.vo.VideosTopnInfoVo;
import io.swagger.models.auth.In;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author deltaqin
 * @date 2021/6/17 下午1:34
 */
@Service
public class C01_ZhuYeServiceImpl implements C01_ZhuYeService {

    @Autowired
    private VideosTopnInfoMapper videosTopnInfoMapper;

    @Autowired
    private VideosInfoMapper videosInfoMapper;

    @Autowired
    private ColumnsInfoMapper columnsInfoMapper;

    @Autowired
    private ColumnsTopnInfoMapper columnsTopnInfoMapper;

    @Override
    public List<Top5ThreeModel> getTop5Three() {
        List<VideosTopnInfo> list = videosInfoMapper.selectTop5Three();
        HashMap<String, Double> res = new HashMap<>();

        list.forEach(item -> {
            Double count = item.getLike() * 0.2 + item.getCoin() * 0.3 + item.getFavorite() * 0.5;
            Double tmp = res.get(item.getName());
            if (tmp == null) {
                res.put(item.getName(), count);
            } else {
                res.put(item.getName(), count + tmp );
            }
        });



        List<HashMap<String,Object>> hashMaps = videosTopnInfoMapper.selectTypeCount();
        HashMap<String, Long> hashMap = new HashMap<>();
        for(HashMap<String,Object> map:hashMaps){
            hashMap.put((String) map.get("name"),(Long)map.get("count"));
        }

        List<Top5ThreeModel> res1 = new ArrayList();
        res.forEach((k, v) -> {
            Top5ThreeModel top5ThreeModel = new Top5ThreeModel();
            top5ThreeModel.setName(k);
            Long count = hashMap.get(k);
            top5ThreeModel.setScore(DoubleUtil.userBigDecimal(v/count));
            res1.add(top5ThreeModel);
        });

        List<Top5ThreeModel> list1 = res1.stream().sorted().collect(Collectors.toList());

        //res1.sort((o1, o2)->{
        //    return new Double(o2.getScore() - o1.getScore()).intValue();
        //});
        return list1;
    }

    @Override
    public Long getVideoTotal() {
        return videosInfoMapper.getVideoTotal();
    }

    @Override
    public Long getZhuanLanTotal() {

        return columnsInfoMapper.getZhuanLanTotal();
    }

    @Override
    public Long getNewIn14Day() {
        return columnsInfoMapper.getNewIn14Day();
    }

    @Override
    public HashMap<String, Long> getAllsum() {
        return videosInfoMapper.getAllsum();
    }

    @Override
    public List<HashMap<String, Double>>  getAllHot() {
        return videosInfoMapper.getAllHot();
    }

    @Override
    public List<HashMap<String, Object>> getVideoTop20() {
        return  videosTopnInfoMapper.getVideoTop20();
    }

    @Override
    public List<HashMap<String, Object>> getZhuanlanTop20() {

        return columnsTopnInfoMapper.getZhuanlanTop20();
    }

    public Long getVideoNewIn14Day() {
        return videosInfoMapper.getVideoNewIn14Day();
    }

    private VideosTopnInfoModel convertModelFromDo(VideosTopnInfo item) {
        if (item == null) {
            return null;
        }
        VideosTopnInfoModel videosTopnInfoModel = new VideosTopnInfoModel();
        BeanUtils.copyProperties(item, videosTopnInfoModel);
        return videosTopnInfoModel;
    }
}
