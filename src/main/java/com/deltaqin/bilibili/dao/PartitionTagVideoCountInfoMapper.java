package com.deltaqin.bilibili.dao;

import com.deltaqin.bilibili.dataobject.PartitionTagVideoCountInfo;
import com.deltaqin.bilibili.dataobject.PartitionTagVideoCountInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartitionTagVideoCountInfoMapper {
    long countByExample(PartitionTagVideoCountInfoExample example);

    int deleteByExample(PartitionTagVideoCountInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PartitionTagVideoCountInfo record);

    int insertSelective(PartitionTagVideoCountInfo record);

    List<PartitionTagVideoCountInfo> selectByExample(PartitionTagVideoCountInfoExample example);

    PartitionTagVideoCountInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PartitionTagVideoCountInfo record, @Param("example") PartitionTagVideoCountInfoExample example);

    int updateByExample(@Param("record") PartitionTagVideoCountInfo record, @Param("example") PartitionTagVideoCountInfoExample example);

    int updateByPrimaryKeySelective(PartitionTagVideoCountInfo record);

    int updateByPrimaryKey(PartitionTagVideoCountInfo record);
}