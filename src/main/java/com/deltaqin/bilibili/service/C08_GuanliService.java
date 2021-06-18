package com.deltaqin.bilibili.service;

import com.deltaqin.bilibili.dataobject.ColumnsInfo;

import java.util.List;

/**
 * @author deltaqin
 * @date 2021/6/18 下午11:14
 */
public interface C08_GuanliService {
    ColumnsInfo getByID(int id);

    List<ColumnsInfo> getByCID(long cid);

    List<ColumnsInfo> getAll();

    boolean add(ColumnsInfo columnsInfo);

    boolean del(int id);

    boolean upt(ColumnsInfo columnsInfo);
}
