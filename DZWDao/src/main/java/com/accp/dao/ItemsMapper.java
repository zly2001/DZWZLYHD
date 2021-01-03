package com.accp.dao;

import com.accp.entity.Items;

public interface ItemsMapper {
    int deleteByPrimaryKey(Integer itemsid);

    int insert(Items record);

    int insertSelective(Items record);

    Items selectByPrimaryKey(Integer itemsid);

    int updateByPrimaryKeySelective(Items record);

    int updateByPrimaryKey(Items record);
}