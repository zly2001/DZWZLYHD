package com.accp.dao;

import java.util.List;

import com.accp.entity.Function;

public interface FunctionMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(Function record);

    int insertSelective(Function record);

    Function selectByPrimaryKey(Integer fid);
    
    List<Function> selectAllByFunction();

    int updateByPrimaryKeySelective(Function record);

    int updateByPrimaryKey(Function record);
}