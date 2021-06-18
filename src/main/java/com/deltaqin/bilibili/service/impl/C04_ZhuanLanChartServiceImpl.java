package com.deltaqin.bilibili.service.impl;

import com.deltaqin.bilibili.dao.ColumnsInfoMapper;
import com.deltaqin.bilibili.dao.ColumnsTopnInfoMapper;
import com.deltaqin.bilibili.service.C04_ZhuanLanChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author deltaqin
 * @date 2021/6/17 下午1:34
 */
@Service
public class C04_ZhuanLanChartServiceImpl implements C04_ZhuanLanChartService {

    @Autowired
    private ColumnsTopnInfoMapper columnsTopnInfoMapper;

    @Autowired
    private ColumnsInfoMapper columnsInfoMapper;

    @Override
    public List<HashMap<String, Long>> getZhuanLanFenquTop50(Integer tid, Integer N ) {
        return columnsTopnInfoMapper.getZhuanLanFenquTopN(tid, N);

    }

    @Override
    public Long getZhuanLantotal(Integer tid) {
        Long total = columnsInfoMapper.getSelectZhuanLanTotal(tid);
        return total == null ? 0 : total;
    }

    @Override
    public List<HashMap<String,Object>>  getZhuanLanNew7day(Integer tid) {
        return columnsInfoMapper.getZhuanLanNew7day(tid);
    }

    @Override
    public List<HashMap<String, Object>> getFenquAllNum() {

        return columnsInfoMapper.getFenquAllNum();
    }
}
