package com.accp.dao.nj;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.entity.Employee;

public interface NJemployeeMapper {
	/**
	 * 根据员工id删除员工
	 * @param employeeid
	 * @return
	 */
	int deleteByPrimaryKey(@Param("employeeid") String employeeid);
	/**
	 * 新增员工
	 * @param record
	 * @return
	 */
	int insert(Employee record);
	/**
	 * 新增员工
	 * @param record
	 * @return
	 */
	int insertSelective(@Param("record") Employee record);
	/**
	 * 通过员工id查询员工详细信息
	 * @param employeeid
	 * @return
	 */
	Employee selectByPrimaryKey(String employeeid);
	/**
	 *员工使用系统登录
	 * @param employeeid
	 * @param epwd
	 * @return
	 */
	@Select("SELECT * FROM `employee` WHERE `employeeid`='1001' AND `epwd`='1001'")
	Employee selectByLogin(@Param("employeeid") String employeeid, @Param("epwd") String epwd);
	/**
	 * 修改员工信息
	 * @param record
	 * @return
	 */
	int updateByPrimaryKeySelective(@Param("record") Employee record);
	/**
	 * 通过主键修改员工信息
	 * @param record
	 * @return
	 */
	int updateByPrimaryKeyWithBLOBs(Employee record);
	/**
	 * 通过主键修改员工信息
	 * @param record
	 * @return
	 */
	int updateByPrimaryKey(Employee record);
	
	List<Employee> queryAllEmployee();
}
