package com.deltaqin.bilibili.service.impl;

import com.deltaqin.bilibili.common.utils.DoubleUtil;
import com.deltaqin.bilibili.dao.BaidaUpInfoMapper;
import com.deltaqin.bilibili.dao.BaidaVideoTopnInfoMapper;
import com.deltaqin.bilibili.service.C07_UpVideoChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author deltaqin
 * @date 2021/6/17 下午1:39
 */
@Service
public class C07_UpVideoChartServiceImpl implements C07_UpVideoChartService {

    @Autowired
    private BaidaVideoTopnInfoMapper baidaVideoTopnInfoMapper;

    @Override
    public Long getHundredAllviedo() {
        return baidaVideoTopnInfoMapper.getHundredAllviedo();

    }

    @Override
    public List<HashMap<String, Object>> getHundredPercent() {
        List<HashMap<String, Object>> hundredPercent = baidaVideoTopnInfoMapper.getHundredPercent();
        Long allviedo = getHundredAllviedo();

        for (HashMap<String, Object> map:hundredPercent)  {
            map.put("count", DoubleUtil.userBigDecimal(((Double)map.get("count"))/allviedo));
        }

        return hundredPercent;
    }

    @Override
    public List<HashMap<String, Object>> getHundredTopN(Integer n) {
        return baidaVideoTopnInfoMapper.getHundredTopN(n);

    }
}
