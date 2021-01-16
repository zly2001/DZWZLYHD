package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.entity.Team;

public interface TeamMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(Team record);

    int insertSelective(Team record);

    Team selectByPrimaryKey(Integer tid);
    
    //张来遇写的用于查询所有班组以及班组下的技工(动了TeamMapper.xml文件)
    List<Team> selectAllByType(@Param("type") String type);

    int updateByPrimaryKeySelective(Team record);

    int updateByPrimaryKey(Team record);
}