package com.deltaqin.bilibili.dao;

import com.deltaqin.bilibili.dataobject.VideosTopnInfo;
import com.deltaqin.bilibili.dataobject.VideosTopnInfoExample;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VideosTopnInfoMapper {
    long countByExample(VideosTopnInfoExample example);

    int deleteByExample(VideosTopnInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VideosTopnInfo record);

    int insertSelective(VideosTopnInfo record);

    List<VideosTopnInfo> selectByExample(VideosTopnInfoExample example);

    VideosTopnInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VideosTopnInfo record, @Param("example") VideosTopnInfoExample example);

    int updateByExample(@Param("record") VideosTopnInfo record, @Param("example") VideosTopnInfoExample example);

    int updateByPrimaryKeySelective(VideosTopnInfo record);

    int updateByPrimaryKey(VideosTopnInfo record);



    List<HashMap<String, Object>> selectTypeCount();

    List<HashMap<String, Object>> getVideoTop20();

    List<HashMap<String, Object>> getFenquTopN(@Param("tid") Integer tid, @Param("n") int n);

    Long getFenquTotal(@Param("tid") Integer tid);
}
