package com.accp.biz.nj;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.accp.dao.nj.NJemployeeMapper;
import com.accp.entity.Employee;
@Service
public class EmployeeBiz {
/**
 * 
 */
	@Resource
	private NJemployeeMapper employee;
	/***
	 * 查询所有员工的信息
	 */
	public List<Employee> queryAllEmployee(){
		return employee.queryAllEmployee();
	}
	/**
	 * 根据员工id查询特定的员工信息
	 */
	
	public Employee selectEmployee(String employeeid) {
		return employee.selectByPrimaryKey(employeeid);
	}
	/**
	 * 新增
	 * @param record
	 * @return
	 */
	public int insert(Employee record) {
		return employee.insert(record);
	}
	/**
	 * 删除员工
	 * @param employeeid
	 * @return
	 */
	public int deleteByPrimaryKey(String employeeid) {
		return employee.deleteByPrimaryKey(employeeid);
	}
	/**
	 * 修改员工
	 * @param record
	 * @return
	 */
	public int updateEmployee(Employee record) {
		return employee.updateByPrimaryKey(record);
	}
	
	
}
