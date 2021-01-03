package com.accp.dao;

import com.accp.entity.Cashiers;

public interface CashiersMapper {
    int deleteByPrimaryKey(String casid);

    int insert(Cashiers record);

    int insertSelective(Cashiers record);

    Cashiers selectByPrimaryKey(String casid);

    int updateByPrimaryKeySelective(Cashiers record);

    int updateByPrimaryKey(Cashiers record);
}