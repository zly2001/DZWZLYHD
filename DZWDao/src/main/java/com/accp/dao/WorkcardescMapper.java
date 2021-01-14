package com.accp.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.entity.Workcardesc;

public interface WorkcardescMapper {
    int deleteByPrimaryKey(Integer workcarjlid);

    int insert(Workcardesc record);

    int insertSelective(Workcardesc record);

    Workcardesc selectByPrimaryKey(Integer workcarjlid);
    
    //张来遇写的根据维修编号查询救援记录
    @Select("SELECT * FROM `workcardesc` WHERE `inid`=#{inid}")
    Workcardesc selectByInid(@Param("inid") String inid);

    int updateByPrimaryKeySelective(Workcardesc record);

    int updateByPrimaryKey(Workcardesc record);
}