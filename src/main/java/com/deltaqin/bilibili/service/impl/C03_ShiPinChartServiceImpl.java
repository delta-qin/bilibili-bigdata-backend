package com.deltaqin.bilibili.service.impl;

import com.deltaqin.bilibili.dao.VideosInfoMapper;
import com.deltaqin.bilibili.service.C03_ShiPinChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author deltaqin
 * @date 2021/6/17 下午1:38
 */
@Service
public class C03_ShiPinChartServiceImpl implements C03_ShiPinChartService {

    @Autowired
    private VideosInfoMapper videosInfoMapper;
    @Override
    public List<HashMap<String, Long>> getFenqu7Day(Integer tid) {
        return  videosInfoMapper.getFenqu7Day(tid);


    }
}
