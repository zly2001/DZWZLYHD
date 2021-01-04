package com.accp.biz.qj;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.qj.QjEmployeeMapper;
import com.accp.entity.Employee;

@Service
/**
 * 事务管理元注解
 * @author Administrator
 *
 */
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true, rollbackFor = {Exception.class })
public class QjEmployeeBiz {
	@Resource
	private QjEmployeeMapper ema;
	
	/**
	 * 登录
	 * @param employeeid
	 * @param epwd
	 * @return
	 */
	public Employee selectByLogin(String employeeid, String epwd) {
		return ema.selectByLogin(employeeid, epwd);
	}
	
	/**
	 * 查询所有员工信息(在职)
	 * @return
	 */
	public Employee selectAll() {
		return ema.selectAll();
	}
	
	/**
	 * 模糊查询
	 * @param ename
	 * @return
	 */
	public Employee selectByename(String ename) {
		return ema.selectByename(ename);
	}
	
	/**
	 * 增加员工信息
	 * @param record
	 * @return
	 */
	public int insertEmployee(Employee record) {
		return ema.insertSelective(record);
	}
	
	/**
	 * 修改员工信息
	 * @param record
	 * @return
	 */
	public int updateEmployee(Employee record) {
		return ema.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 删除员工信息
	 * @param employeeid
	 * @return
	 */
	public int deleteEmployee(String employeeid) {
		return ema.deleteByPrimaryKey(employeeid);
	}
	
	/**
	 * 查询所有离职员工
	 * @return
	 */
	public Employee selectBystatusid() {
		return ema.selectBystatusid();
	}
	
	/**
	 * 员工离职
	 * @return
	 */
	public int updateStatusid(Employee record) {
		return ema.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 删除离职员工信息
	 * @return
	 */
	public int deleteStatusid(String employeeid) {
		return ema.deleteByPrimaryKey(employeeid);
	}
	
	
}
