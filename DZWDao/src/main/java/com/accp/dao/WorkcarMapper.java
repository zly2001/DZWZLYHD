package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.accp.entity.Workcar;

public interface WorkcarMapper {
    int deleteByPrimaryKey(Integer wid);

    int insert(Workcar record);

    int insertSelective(Workcar record);

    Workcar selectByPrimaryKey(Integer wid);
    
    //张来遇写查询出所有空闲状态中的救援车辆
    @Select("SELECT * FROM `workcar` WHERE `statusid`=13")
    List<Workcar> selectAllByWorkcar();

    int updateByPrimaryKeySelective(Workcar record);

    int updateByPrimaryKey(Workcar record);
}