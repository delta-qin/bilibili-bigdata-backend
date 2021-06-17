package com.deltaqin.bilibili.dao;

import com.deltaqin.bilibili.dataobject.ColumnTypeInfo;
import com.deltaqin.bilibili.dataobject.ColumnTypeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColumnTypeInfoMapper {
    long countByExample(ColumnTypeInfoExample example);

    int deleteByExample(ColumnTypeInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ColumnTypeInfo record);

    int insertSelective(ColumnTypeInfo record);

    List<ColumnTypeInfo> selectByExample(ColumnTypeInfoExample example);

    ColumnTypeInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ColumnTypeInfo record, @Param("example") ColumnTypeInfoExample example);

    int updateByExample(@Param("record") ColumnTypeInfo record, @Param("example") ColumnTypeInfoExample example);

    int updateByPrimaryKeySelective(ColumnTypeInfo record);

    int updateByPrimaryKey(ColumnTypeInfo record);
}