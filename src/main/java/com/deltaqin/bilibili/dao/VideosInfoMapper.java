package com.deltaqin.bilibili.dao;

import com.deltaqin.bilibili.dataobject.VideosInfo;
import com.deltaqin.bilibili.dataobject.VideosInfoExample;

import java.util.HashMap;
import java.util.List;

import com.deltaqin.bilibili.dataobject.VideosTopnInfo;
import org.apache.ibatis.annotations.Param;

public interface VideosInfoMapper {
    long countByExample(VideosInfoExample example);

    int deleteByExample(VideosInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VideosInfo record);

    int insertSelective(VideosInfo record);

    List<VideosInfo> selectByExample(VideosInfoExample example);

    VideosInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VideosInfo record, @Param("example") VideosInfoExample example);

    int updateByExample(@Param("record") VideosInfo record, @Param("example") VideosInfoExample example);

    int updateByPrimaryKeySelective(VideosInfo record);

    int updateByPrimaryKey(VideosInfo record);

    Long getVideoTotal();

    Long getVideoNewIn14Day();

    HashMap<String, Long> getAllsum();

    List<HashMap<String, Object>> selectTop5Three();

    List<HashMap<String, Double>> getAllHot();

    HashMap<String, Long> getFenquLeiDa(Integer tid);

    List<HashMap<String, Long>> getFenqu7Day(@Param("tid") Integer tid);

    List<HashMap<String, Object>> getFenquAllToday();
}
