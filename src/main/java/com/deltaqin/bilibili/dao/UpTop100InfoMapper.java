package com.deltaqin.bilibili.dao;

import com.deltaqin.bilibili.dataobject.UpTop100Info;
import com.deltaqin.bilibili.dataobject.UpTop100InfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpTop100InfoMapper {
    long countByExample(UpTop100InfoExample example);

    int deleteByExample(UpTop100InfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UpTop100Info record);

    int insertSelective(UpTop100Info record);

    List<UpTop100Info> selectByExample(UpTop100InfoExample example);

    UpTop100Info selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UpTop100Info record, @Param("example") UpTop100InfoExample example);

    int updateByExample(@Param("record") UpTop100Info record, @Param("example") UpTop100InfoExample example);

    int updateByPrimaryKeySelective(UpTop100Info record);

    int updateByPrimaryKey(UpTop100Info record);
}