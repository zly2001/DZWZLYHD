package com.accp.dao;

import com.accp.entity.Inststion;

public interface InststionMapper {
    int deleteByPrimaryKey(String inid);

    int insert(Inststion record);

    int insertSelective(Inststion record);

    Inststion selectByPrimaryKey(String inid);

    int updateByPrimaryKeySelective(Inststion record);

    int updateByPrimaryKey(Inststion record);
}