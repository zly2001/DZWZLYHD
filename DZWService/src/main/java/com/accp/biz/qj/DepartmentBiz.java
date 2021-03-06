package com.accp.biz.qj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.DepartmentMapper;
import com.accp.entity.Department;

@Service
/**
 * 事务管理元注解
 * @author Administrator
 *
 */
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true, rollbackFor = {Exception.class })
public class DepartmentBiz {
	
	@Autowired
	private DepartmentMapper dma;
	
	/**
	 * 查询所有部门
	 * @return
	 */
	public List<Department> queryDepartment() {
		return dma.selectAll();
	}
}
