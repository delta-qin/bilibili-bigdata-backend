package com.deltaqin.bilibili.dao;

import com.deltaqin.bilibili.dataobject.ColumnsTopnInfo;
import com.deltaqin.bilibili.dataobject.ColumnsTopnInfoExample;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColumnsTopnInfoMapper {
    long countByExample(ColumnsTopnInfoExample example);

    int deleteByExample(ColumnsTopnInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ColumnsTopnInfo record);

    int insertSelective(ColumnsTopnInfo record);

    List<ColumnsTopnInfo> selectByExample(ColumnsTopnInfoExample example);

    ColumnsTopnInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ColumnsTopnInfo record, @Param("example") ColumnsTopnInfoExample example);

    int updateByExample(@Param("record") ColumnsTopnInfo record, @Param("example") ColumnsTopnInfoExample example);

    int updateByPrimaryKeySelective(ColumnsTopnInfo record);

    int updateByPrimaryKey(ColumnsTopnInfo record);

    List<HashMap<String, Object>> getZhuanlanTop20();

    List<HashMap<String, Long>> getZhuanLanFenquTopN(@Param("tid") Integer tid, @Param("n") Integer n);
}
