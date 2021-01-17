package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.entity.Position;

public interface PositionMapper {
    int deleteByPrimaryKey(Integer positionid);

    int insert(Position record);

    int insertSelective(Position record);
    
    Position selectByPrimaryKey(Integer positionid);
    
    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);
        
    List<Position> selectAll();
}