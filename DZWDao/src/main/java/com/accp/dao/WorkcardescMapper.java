package com.accp.dao;

import com.accp.entity.Workcardesc;

public interface WorkcardescMapper {
    int deleteByPrimaryKey(Integer workcarjlid);

    int insert(Workcardesc record);

    int insertSelective(Workcardesc record);

    Workcardesc selectByPrimaryKey(Integer workcarjlid);

    int updateByPrimaryKeySelective(Workcardesc record);

    int updateByPrimaryKey(Workcardesc record);
}