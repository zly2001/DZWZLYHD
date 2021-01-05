package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.entity.Position;

public interface PositionMapper {
    int deleteByPrimaryKey(@Param("positionid")Integer positionid);

    int insert(Position record);

    int insertSelective(@Param("record")Position record);
    
    Position selectByPrimaryKey(Integer positionid);
    
    int updateByPrimaryKeySelective(@Param("record")Position record);

    int updateByPrimaryKey(Position record);
    
    @Select("select * from position")
    List<Position> selectAll();
}