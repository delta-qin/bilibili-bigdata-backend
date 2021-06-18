package com.deltaqin.bilibili.service.impl;

import com.deltaqin.bilibili.dao.ColumnsInfoMapper;
import com.deltaqin.bilibili.dataobject.ColumnsInfo;
import com.deltaqin.bilibili.dataobject.ColumnsInfoExample;
import com.deltaqin.bilibili.service.C08_GuanliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author deltaqin
 * @date 2021/6/18 下午11:14
 */
@Service
public class C08_GuanliServiceImpl implements C08_GuanliService {
    @Autowired
    private ColumnsInfoMapper columnsInfoMapper;


    @Override
    public ColumnsInfo getByID(int id) {
        return columnsInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ColumnsInfo> getByCID(long cid) {
        ColumnsInfoExample columnsInfoExample = new ColumnsInfoExample();
        columnsInfoExample.createCriteria().andCidEqualTo(cid);
        return columnsInfoMapper.selectByExample(columnsInfoExample);
    }

    @Override
    public List<ColumnsInfo> getAll() {
        ColumnsInfoExample columnsInfoExample = new ColumnsInfoExample();
        columnsInfoExample.createCriteria();
        return columnsInfoMapper.selectByExample(columnsInfoExample);
    }

    @Override
    public boolean add(ColumnsInfo columnsInfo) {
        return columnsInfoMapper.insertSelective(columnsInfo) == 1;
    }

    @Override
    public boolean del(int id) {
        return columnsInfoMapper.deleteByPrimaryKey(id) == 1;
    }

    @Override
    public boolean upt(ColumnsInfo columnsInfo) {
        return columnsInfoMapper.updateByPrimaryKeySelective(columnsInfo) ==1;
    }
}
