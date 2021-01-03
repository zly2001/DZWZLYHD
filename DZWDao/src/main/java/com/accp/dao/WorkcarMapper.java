package com.accp.dao;

import com.accp.entity.Workcar;

public interface WorkcarMapper {
    int deleteByPrimaryKey(Integer wid);

    int insert(Workcar record);

    int insertSelective(Workcar record);

    Workcar selectByPrimaryKey(Integer wid);

    int updateByPrimaryKeySelective(Workcar record);

    int updateByPrimaryKey(Workcar record);
}