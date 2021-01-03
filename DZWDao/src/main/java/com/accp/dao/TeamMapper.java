package com.accp.dao;

import com.accp.entity.Team;

public interface TeamMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(Team record);

    int insertSelective(Team record);

    Team selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(Team record);

    int updateByPrimaryKey(Team record);
}