package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.accp.entity.Cashiers;

public interface CashiersMapper {
    int deleteByPrimaryKey(String casid);

    int insert(Cashiers record);

    int insertSelective(Cashiers record);

    Cashiers selectByPrimaryKey(String casid);
    
    @Select("SELECT * FROM `cashiers`")
    List<Cashiers> selecAllByCashiers();

    int updateByPrimaryKeySelective(Cashiers record);

    int updateByPrimaryKey(Cashiers record);
}