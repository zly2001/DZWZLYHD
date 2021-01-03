package com.accp.dao;

import com.accp.entity.Goodstype;

public interface GoodstypeMapper {
    int deleteByPrimaryKey(Integer goodid);

    int insert(Goodstype record);

    int insertSelective(Goodstype record);

    Goodstype selectByPrimaryKey(Integer goodid);

    int updateByPrimaryKeySelective(Goodstype record);

    int updateByPrimaryKey(Goodstype record);
}