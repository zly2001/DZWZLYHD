package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.accp.entity.Wugongtype;

public interface WugongtypeMapper {
    int deleteByPrimaryKey(Integer wugongtypeid);

    int insert(Wugongtype record);

    int insertSelective(Wugongtype record);

    Wugongtype selectByPrimaryKey(Integer wugongtypeid);
    
    //张来遇写的查询所有返工类型
    @Select("SELECT * FROM `wugongtype`")
    List<Wugongtype> selectAllByWugongtype();

    int updateByPrimaryKeySelective(Wugongtype record);

    int updateByPrimaryKey(Wugongtype record);
}