package com.accp.dao;

import com.accp.entity.Itemstype;

public interface ItemstypeMapper {
    int deleteByPrimaryKey(Integer itemstypeid);

    int insert(Itemstype record);

    int insertSelective(Itemstype record);

    Itemstype selectByPrimaryKey(Integer itemstypeid);

    int updateByPrimaryKeySelective(Itemstype record);

    int updateByPrimaryKey(Itemstype record);
}