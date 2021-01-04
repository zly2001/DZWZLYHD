package com.accp.dao.qj;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.entity.Employee;

public interface QjEmployeeMapper {
    int deleteByPrimaryKey(@Param("employeeid")String employeeid);

    int insert(Employee record);

    int insertSelective(@Param("record")Employee record);

    Employee selectByPrimaryKey(String employeeid);
    
    @Select("SELECT * FROM `employee` WHERE `employeeid`=#{employeeid} AND `epwd`=#{epwd}")
    Employee selectByLogin(@Param("employeeid") String employeeid,@Param("epwd") String epwd);

    int updateByPrimaryKeySelective(@Param("record")Employee record);

    int updateByPrimaryKeyWithBLOBs(Employee record);

    int updateByPrimaryKey(Employee record);
    
    @Select("select * from employee where statusid = 0")
    Employee selectAll();
    
    @Select("select * from employee where ename like '%${ename}%'")
    Employee selectByename(@Param("ename") String ename);
    
    @Select("select * from employee where statusid = 1")
    Employee selectBystatusid();
    
}