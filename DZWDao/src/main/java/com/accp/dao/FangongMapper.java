package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.accp.entity.Fangong;

public interface FangongMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(Fangong record);

    int insertSelective(Fangong record);

    Fangong selectByPrimaryKey(Integer fid);
    
    //张来遇写的查询所有返工记录表
    @Select("SELECT * FROM `fangong`")
    List<Fangong> selectByAllByFangong();

    int updateByPrimaryKeySelective(Fangong record);

    int updateByPrimaryKey(Fangong record);
}