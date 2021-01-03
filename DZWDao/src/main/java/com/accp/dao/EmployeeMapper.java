package com.accp.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.entity.Employee;

public interface EmployeeMapper {
    int deleteByPrimaryKey(String employeeid);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(String employeeid);
    
    @Select("SELECT * FROM `employee` WHERE `employeeid`='1001' AND `epwd`='1001'")
    Employee selectByLogin(@Param("employeeid") String employeeid,@Param("epwd") String epwd);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKeyWithBLOBs(Employee record);

    int updateByPrimaryKey(Employee record);
}