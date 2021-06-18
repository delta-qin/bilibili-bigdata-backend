package com.deltaqin.bilibili.service.impl;

import com.deltaqin.bilibili.common.utils.DoubleUtil;
import com.deltaqin.bilibili.dao.ColumnsInfoMapper;
import com.deltaqin.bilibili.dao.ColumnsTopnInfoMapper;
import com.deltaqin.bilibili.dao.VideosInfoMapper;
import com.deltaqin.bilibili.dao.VideosTopnInfoMapper;
import com.deltaqin.bilibili.dataobject.ColumnsTopnInfo;
import com.deltaqin.bilibili.dataobject.VideosInfo;
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

import java.math.BigDecimal;
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
    public List<HashMap<String, Object>> getTop5Three() {
        List<HashMap<String, Object>> list = videosInfoMapper.selectTop5Three();

        List<HashMap<String, Object>> hashMaps = videosTopnInfoMapper.selectTypeCount();
        HashMap<String, Long> hashMap = new HashMap<>();
        for (HashMap<String, Object> map : hashMaps) {
            hashMap.put((String) map.get("name"), (Long) map.get("count"));
        }

        list.forEach(item -> {
            BigDecimal view = (BigDecimal) item.get("view");
            view = view.multiply(new BigDecimal("0.2"));
            BigDecimal like = (BigDecimal) item.get("like");
            like = like.multiply(new BigDecimal("0.3"));
            BigDecimal coin = (BigDecimal) item.get("coin");
            coin = coin.multiply(new BigDecimal("0.5"));
            double score = view.add(like).add(coin).longValue() / (double) hashMap.get(item.get("name"));
            item.put("score", DoubleUtil.userBigDecimal(score));
        });

        list.sort(new Comparator<HashMap<String, Object>>() {
            @Override
            public int compare(HashMap<String, Object> o1, HashMap<String, Object> o2) {
                return (int)((double) o2.get("score") - (double) o1.get("score"));
            }
        });

        return list.subList(0,5);
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
    public List<HashMap<String, Double>> getAllHot() {
        return videosInfoMapper.getAllHot();
    }

    @Override
    public List<HashMap<String, Object>> getVideoTop20() {
        return videosTopnInfoMapper.getVideoTop20();
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
