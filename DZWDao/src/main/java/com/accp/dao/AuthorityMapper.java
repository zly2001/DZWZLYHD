package com.accp.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

import com.accp.entity.Authority;

public interface AuthorityMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(Authority record);

    int insertSelective(Authority record);

    Authority selectByPrimaryKey(Integer aid);
    
    @Delete("DELETE FROM `authority` WHERE `positionid`=#{positionid}")
    int deleteByPositionid(@Param("positionid") Integer positionid);
    

    int updateByPrimaryKeySelective(Authority record);

    int updateByPrimaryKey(Authority record);
}