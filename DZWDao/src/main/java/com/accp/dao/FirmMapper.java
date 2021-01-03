package com.accp.dao;

import com.accp.entity.Firm;

public interface FirmMapper {
    int deleteByPrimaryKey(Integer firmid);

    int insert(Firm record);

    int insertSelective(Firm record);

    Firm selectByPrimaryKey(Integer firmid);

    int updateByPrimaryKeySelective(Firm record);

    int updateByPrimaryKey(Firm record);
}