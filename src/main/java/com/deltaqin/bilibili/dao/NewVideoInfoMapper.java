package com.deltaqin.bilibili.dao;

import com.deltaqin.bilibili.dataobject.NewVideoInfo;
import com.deltaqin.bilibili.dataobject.NewVideoInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewVideoInfoMapper {
    long countByExample(NewVideoInfoExample example);

    int deleteByExample(NewVideoInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NewVideoInfo record);

    int insertSelective(NewVideoInfo record);

    List<NewVideoInfo> selectByExample(NewVideoInfoExample example);

    NewVideoInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NewVideoInfo record, @Param("example") NewVideoInfoExample example);

    int updateByExample(@Param("record") NewVideoInfo record, @Param("example") NewVideoInfoExample example);

    int updateByPrimaryKeySelective(NewVideoInfo record);

    int updateByPrimaryKey(NewVideoInfo record);
}