package com.accp.dao.qj;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.entity.Employee;
import com.accp.entity.EmployeeVO;

public interface QjEmployeeMapper {
    int deleteByPrimaryKey(String employeeid);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(String employeeid);
    
    @Select("SELECT * FROM `employee` WHERE `employeeid`=#{employeeid} AND `epwd`=#{epwd}")
    Employee selectByLogin(@Param("employeeid") String employeeid,@Param("epwd") String epwd);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKeyWithBLOBs(Employee record);

    int updateByPrimaryKey(Employee record);
    
    @Select("select * from employee where statusid = 0")
    Employee selectAll();
    
//    @Select("select * from employee where ename like '%${ename}%'")
//    Employee selectByename(@Param("ename") String ename);
    
//    @Select("select * from employee where statusid = 1")
//    Employee selectBystatusid();
    
//    List<Employee> selectAllaa();
    //离职
    List<EmployeeVO> selectLizhi();
    //在职
    List<EmployeeVO> getVo();
    //模糊在职
    List<EmployeeVO> selectByename(@Param("ename")String ename);
    
    
}