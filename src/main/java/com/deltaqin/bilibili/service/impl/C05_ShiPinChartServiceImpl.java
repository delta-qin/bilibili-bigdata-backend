package com.deltaqin.bilibili.service.impl;

import com.deltaqin.bilibili.dao.ColumnsInfoMapper;
import com.deltaqin.bilibili.service.C05_ShiPinChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author deltaqin
 * @date 2021/6/17 下午1:39
 */
@Service
public class C05_ShiPinChartServiceImpl implements C05_ShiPinChartService {
    @Autowired
    private ColumnsInfoMapper columnsInfoMapper;



    @Override
    public List<HashMap<String, Object>> getFenquAllToday() {

        return columnsInfoMapper.getFenquAllToday();

    }
}
