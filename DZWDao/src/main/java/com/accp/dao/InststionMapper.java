package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.entity.Inststion;

public interface InststionMapper {
    int deleteByPrimaryKey(String inid);

    int insert(Inststion record);

    int insertSelective(Inststion record);

    Inststion selectByPrimaryKey(String inid);
    
    //张来遇写的根据维修状态和车牌号查询所有维修单与维修详情和救援记录改了Inststion.java文件和InststionMapper.xml文件
    List<Inststion> selectAllByCnoAndStatusid(@Param("cno") String cno, @Param("statusid") String statusid, @Param("type") String type);

    int updateByPrimaryKeySelective(Inststion record);

    int updateByPrimaryKey(Inststion record);
}