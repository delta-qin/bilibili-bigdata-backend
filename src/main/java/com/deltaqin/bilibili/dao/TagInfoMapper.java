package com.deltaqin.bilibili.dao;

import com.deltaqin.bilibili.dataobject.TagInfo;
import com.deltaqin.bilibili.dataobject.TagInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TagInfoMapper {
    long countByExample(TagInfoExample example);

    int deleteByExample(TagInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TagInfo record);

    int insertSelective(TagInfo record);

    List<TagInfo> selectByExample(TagInfoExample example);

    TagInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TagInfo record, @Param("example") TagInfoExample example);

    int updateByExample(@Param("record") TagInfo record, @Param("example") TagInfoExample example);

    int updateByPrimaryKeySelective(TagInfo record);

    int updateByPrimaryKey(TagInfo record);
}