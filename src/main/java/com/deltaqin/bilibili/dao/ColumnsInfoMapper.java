package com.deltaqin.bilibili.dao;

import com.deltaqin.bilibili.dataobject.ColumnsInfo;
import com.deltaqin.bilibili.dataobject.ColumnsInfoExample;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColumnsInfoMapper {
    long countByExample(ColumnsInfoExample example);

    int deleteByExample(ColumnsInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ColumnsInfo record);

    int insertSelective(ColumnsInfo record);

    List<ColumnsInfo> selectByExample(ColumnsInfoExample example);

    ColumnsInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ColumnsInfo record, @Param("example") ColumnsInfoExample example);

    int updateByExample(@Param("record") ColumnsInfo record, @Param("example") ColumnsInfoExample example);

    int updateByPrimaryKeySelective(ColumnsInfo record);

    int updateByPrimaryKey(ColumnsInfo record);

    Long getZhuanLanTotal();

    Long getNewIn14Day();

    Long getSelectZhuanLanTotal(@Param("tid") Integer tid);

    List<HashMap<String,Object>> getZhuanLanNew7day(@Param("tid") Integer tid);

    List<HashMap<String, Object>> getFenquAllNum();

    List<HashMap<String, Object>> getFenquAllToday();
}
