package com.deltaqin.bilibili.dao;

import com.deltaqin.bilibili.dataobject.TopVideoInfo;
import com.deltaqin.bilibili.dataobject.TopVideoInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TopVideoInfoMapper {
    long countByExample(TopVideoInfoExample example);

    int deleteByExample(TopVideoInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TopVideoInfo record);

    int insertSelective(TopVideoInfo record);

    List<TopVideoInfo> selectByExample(TopVideoInfoExample example);

    TopVideoInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TopVideoInfo record, @Param("example") TopVideoInfoExample example);

    int updateByExample(@Param("record") TopVideoInfo record, @Param("example") TopVideoInfoExample example);

    int updateByPrimaryKeySelective(TopVideoInfo record);

    int updateByPrimaryKey(TopVideoInfo record);
}