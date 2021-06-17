package com.deltaqin.bilibili.service.impl;

import com.deltaqin.bilibili.dao.VideosInfoMapper;
import com.deltaqin.bilibili.service.C03_ShiPinChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * @author deltaqin
 * @date 2021/6/17 下午1:38
 */
@Service
public class C03_ShiPinChartServiceImpl implements C03_ShiPinChartService {

    @Autowired
    private VideosInfoMapper videosInfoMapper;
    @Override
    public HashMap<String, Long> getFenqu7Day(Integer tid) {
        HashMap<String, Long> fenqu7Day = videosInfoMapper.getFenqu7Day(tid);
        return fenqu7Day;

    }
}
