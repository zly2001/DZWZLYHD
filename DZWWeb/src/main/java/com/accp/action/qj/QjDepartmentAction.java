package com.accp.action.qj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.qj.DepartmentBiz;
import com.accp.entity.Department;

@RestController
@RequestMapping("/qj/api/QjDepartmentAction")
public class QjDepartmentAction {
	
	@Autowired
	private DepartmentBiz dbiz;
	
	/**
	 * 查所有部门
	 * @return
	 */
	@GetMapping
	public List<Department> queryDepartment() {
		return dbiz.queryDepartment();
	}
}
