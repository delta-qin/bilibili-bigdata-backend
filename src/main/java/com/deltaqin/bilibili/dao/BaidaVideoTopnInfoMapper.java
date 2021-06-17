package com.deltaqin.bilibili.dao;

import com.deltaqin.bilibili.dataobject.BaidaVideoTopnInfo;
import com.deltaqin.bilibili.dataobject.BaidaVideoTopnInfoExample;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaidaVideoTopnInfoMapper {
    long countByExample(BaidaVideoTopnInfoExample example);

    int deleteByExample(BaidaVideoTopnInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaidaVideoTopnInfo record);

    int insertSelective(BaidaVideoTopnInfo record);

    List<BaidaVideoTopnInfo> selectByExample(BaidaVideoTopnInfoExample example);

    BaidaVideoTopnInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaidaVideoTopnInfo record, @Param("example") BaidaVideoTopnInfoExample example);

    int updateByExample(@Param("record") BaidaVideoTopnInfo record, @Param("example") BaidaVideoTopnInfoExample example);

    int updateByPrimaryKeySelective(BaidaVideoTopnInfo record);

    int updateByPrimaryKey(BaidaVideoTopnInfo record);

    List<HashMap<String, Object>> getUpVideoTopN(@Param("n") int n);

    List<HashMap<String, Object>> getAllVideoTopN(@Param("n")int n);

    Long getHundredAllviedo();

    List<HashMap<String, Object>> getHundredPercent();

    List<HashMap<String, Object>> getHundredTopN(Integer n);
}
