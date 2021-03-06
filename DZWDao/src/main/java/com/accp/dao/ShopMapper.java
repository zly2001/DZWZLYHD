package com.accp.dao;

import com.accp.entity.Shop;

public interface ShopMapper {
    int deleteByPrimaryKey(Integer shopid);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(Integer shopid);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKeyWithBLOBs(Shop record);

    int updateByPrimaryKey(Shop record);
}