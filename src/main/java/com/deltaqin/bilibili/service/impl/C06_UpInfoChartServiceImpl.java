package com.deltaqin.bilibili.service.impl;

import com.deltaqin.bilibili.dao.BaidaUpInfoMapper;
import com.deltaqin.bilibili.dao.BaidaVideoTopnInfoMapper;
import com.deltaqin.bilibili.dataobject.BaidaUpInfo;
import com.deltaqin.bilibili.service.C06_UpInfoChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author deltaqin
 * @date 2021/6/17 下午1:39
 */
@Service
public class C06_UpInfoChartServiceImpl implements C06_UpInfoChartService {
    @Autowired
    private BaidaUpInfoMapper baidaUpInfoMapper;

    @Autowired
    private BaidaVideoTopnInfoMapper baidaVideoTopnInfoMapper;
    @Override
    public List<HashMap<String, Object>> getUpSexNum() {return baidaUpInfoMapper.getUpSexNum();

    }

    @Override
    public List<HashMap<String, Object>> getUpVideoTopN(int n) {
        return baidaVideoTopnInfoMapper.getUpVideoTopN(n);
    }

    @Override
    public List<HashMap<String, Object>> getAllVideoTopN(int n) {
        return baidaVideoTopnInfoMapper.getAllVideoTopN( n);
    }
}
