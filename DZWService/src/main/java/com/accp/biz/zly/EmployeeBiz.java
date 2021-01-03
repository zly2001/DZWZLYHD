package com.accp.biz.zly;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.EmployeeMapper;
import com.accp.entity.Employee;

@Service
/**
 * 事务管理元注解
 * @author Administrator
 *
 */
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true, rollbackFor = {Exception.class })
public class EmployeeBiz {

	@Resource
	private EmployeeMapper dao;
	
	public Employee selectByLogin(String employeeid, String epwd) {
		return dao.selectByLogin(employeeid, epwd);
	}
}
