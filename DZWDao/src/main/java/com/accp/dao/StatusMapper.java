package com.accp.dao;

import java.util.List;

import com.accp.entity.Status;

public interface StatusMapper {
    int deleteByPrimaryKey(Integer statusid);

    int insert(Status record);

    int insertSelective(Status record);

    Status selectByPrimaryKey(Integer statusid);
    
    //张来遇写的根据状态类型查询不同的状态集合改了StatusMapper.xml文件
    List<Status> selectAllByType(Integer statusid);

    int updateByPrimaryKeySelective(Status record);

    int updateByPrimaryKey(Status record);
}