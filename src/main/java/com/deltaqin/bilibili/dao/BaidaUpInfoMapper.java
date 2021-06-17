package com.deltaqin.bilibili.dao;

import com.deltaqin.bilibili.dataobject.BaidaUpInfo;
import com.deltaqin.bilibili.dataobject.BaidaUpInfoExample;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaidaUpInfoMapper {
    long countByExample(BaidaUpInfoExample example);

    int deleteByExample(BaidaUpInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaidaUpInfo record);

    int insertSelective(BaidaUpInfo record);

    List<BaidaUpInfo> selectByExample(BaidaUpInfoExample example);

    BaidaUpInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaidaUpInfo record, @Param("example") BaidaUpInfoExample example);

    int updateByExample(@Param("record") BaidaUpInfo record, @Param("example") BaidaUpInfoExample example);

    int updateByPrimaryKeySelective(BaidaUpInfo record);

    int updateByPrimaryKey(BaidaUpInfo record);

    List<HashMap<String, Object>> getUpSexNum();
}
