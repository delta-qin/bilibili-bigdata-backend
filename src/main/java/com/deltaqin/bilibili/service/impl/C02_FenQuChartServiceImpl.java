package com.deltaqin.bilibili.service.impl;

import com.deltaqin.bilibili.dao.VideosInfoMapper;
import com.deltaqin.bilibili.dao.VideosTopnInfoMapper;
import com.deltaqin.bilibili.service.C02_FenQuChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author deltaqin
 * @date 2021/6/17 下午1:37
 */
@Service
public class C02_FenQuChartServiceImpl implements C02_FenQuChartService {

    @Autowired
    private VideosTopnInfoMapper videosTopnInfoMapper;

    @Autowired
    private VideosInfoMapper videosInfoMapper;

    @Override
    public List<HashMap<String, Object>> getFenquTopN(Integer tid, int n) {
        return videosTopnInfoMapper.getFenquTopN(tid, n);
    }

    @Override
    public Long getFenquTotal(Integer tid) {
        return videosTopnInfoMapper.getFenquTotal(tid);
    }

    @Override
    public HashMap<String, Long> getFenquLeiDa(Integer tid) {

        return videosInfoMapper.getFenquLeiDa(tid);
    }
}
