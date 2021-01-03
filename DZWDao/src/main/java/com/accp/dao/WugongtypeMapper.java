package com.accp.dao;

import com.accp.entity.Wugongtype;

public interface WugongtypeMapper {
    int deleteByPrimaryKey(Integer wugongtypeid);

    int insert(Wugongtype record);

    int insertSelective(Wugongtype record);

    Wugongtype selectByPrimaryKey(Integer wugongtypeid);

    int updateByPrimaryKeySelective(Wugongtype record);

    int updateByPrimaryKey(Wugongtype record);
}