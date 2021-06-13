package com.deltaqin.bilibili.dao;

import com.deltaqin.bilibili.dataobject.PartitionInfo;
import com.deltaqin.bilibili.dataobject.PartitionInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartitionInfoMapper {
    long countByExample(PartitionInfoExample example);

    int deleteByExample(PartitionInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PartitionInfo record);

    int insertSelective(PartitionInfo record);

    List<PartitionInfo> selectByExample(PartitionInfoExample example);

    PartitionInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PartitionInfo record, @Param("example") PartitionInfoExample example);

    int updateByExample(@Param("record") PartitionInfo record, @Param("example") PartitionInfoExample example);

    int updateByPrimaryKeySelective(PartitionInfo record);

    int updateByPrimaryKey(PartitionInfo record);
}