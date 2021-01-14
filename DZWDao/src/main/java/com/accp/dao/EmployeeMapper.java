package com.accp.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.entity.Employee;

public interface EmployeeMapper {
    int deleteByPrimaryKey(@Param("employeeid")String employeeid);

    int insert(Employee record);

    int insertSelective(@Param("record")Employee record);
    
    Employee selectByPrimaryKey(String employeeid);
    
    @Select("SELECT * FROM `employee` WHERE `employeeid`='1001' AND `epwd`='1001'")
    Employee selectByLogin(@Param("employeeid") String employeeid,@Param("epwd") String epwd);

    int updateByPrimaryKeySelective(@Param("record")Employee record);

    int updateByPrimaryKeyWithBLOBs(Employee record);

    int updateByPrimaryKey(Employee record);
    
    
    
}