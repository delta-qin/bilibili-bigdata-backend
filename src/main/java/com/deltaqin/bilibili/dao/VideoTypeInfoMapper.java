package com.deltaqin.bilibili.dao;

import com.deltaqin.bilibili.dataobject.VideoTypeInfo;
import com.deltaqin.bilibili.dataobject.VideoTypeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VideoTypeInfoMapper {
    long countByExample(VideoTypeInfoExample example);

    int deleteByExample(VideoTypeInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VideoTypeInfo record);

    int insertSelective(VideoTypeInfo record);

    List<VideoTypeInfo> selectByExample(VideoTypeInfoExample example);

    VideoTypeInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VideoTypeInfo record, @Param("example") VideoTypeInfoExample example);

    int updateByExample(@Param("record") VideoTypeInfo record, @Param("example") VideoTypeInfoExample example);

    int updateByPrimaryKeySelective(VideoTypeInfo record);

    int updateByPrimaryKey(VideoTypeInfo record);
}