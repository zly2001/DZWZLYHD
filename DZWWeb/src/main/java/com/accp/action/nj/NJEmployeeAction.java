package com.accp.action.nj;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.accp.biz.nj.EmployeeBiz;
import com.accp.entity.Employee;

@RestController
@RequestMapping("/nj/api/NJEmployeeAction")
public class NJEmployeeAction {
@Resource
private EmployeeBiz biz;

@PostMapping("queryAll")
/**
 * 查询所有员工信息
 */
public List<Employee> queryAllEmployee(){
	List<Employee> employee=biz.queryAllEmployee();
	return employee;
}
/**
 * 查询单个员工的信息
 */
@PostMapping("/queryEmployee/{employeeid}")
public Map<String,String> queryEmployee(HttpSession session, @PathVariable String employeeid){
	Map<String, String> map = new HashMap<String, String>();
	Employee employee=biz.selectEmployee(employeeid);
	if (employee != null) {
		map.put("code", "200");
		map.put("msg", "成功!");
		session.setAttribute("employee", employee);
	} else {
		map.put("code", "500");
		map.put("msg", "失败!");
	}
	return map;		
}
/**
 * 新增员工信息
 */
@PostMapping("insertEmployee")
public Map<String, String> insert(@RequestBody Employee employee) {
	Map<String, String> map = new HashMap<String, String>();
	try {
		biz.insert(employee);
		map.put("code", "200");
		map.put("msg", "成功!");
	} catch (Exception e) {
		map.put("code", "500");
		map.put("msg", "失败!");
	}
	return map;
}

/***
 * 修改用户信息
 */
@PutMapping("updateEmployee")
public Map<String, String> updateEmployee(@RequestBody Employee record) {
	Map<String, String> map = new HashMap<String, String>();
	try {
		biz.updateEmployee(record);
		map.put("code", "200");
		map.put("msg", "成功!");
	} catch (Exception e) {
		map.put("code", "500");
		map.put("msg", "失败!");
	}
	return map;
}

/**
 * 删除用户信息
 */
@DeleteMapping("/delete/{employeeid}")
public Map<String, String> deleteClient(@PathVariable String employeeid) {
	Map<String, String> map = new HashMap<String, String>();
	try {
		biz.deleteByPrimaryKey(employeeid);
		map.put("code", "200");
		map.put("msg", "成功!");
	} catch (Exception e) {
		map.put("code", "500");
		map.put("msg", "失败!");
	}
	return map;
}

}
