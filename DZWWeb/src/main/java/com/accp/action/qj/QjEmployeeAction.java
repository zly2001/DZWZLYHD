package com.accp.action.qj;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.qj.QjEmployeeBiz;
import com.accp.entity.Employee;
import com.accp.entity.EmployeeVO;


@RestController
@RequestMapping("/qj/api/QjEmployeeAction")
public class QjEmployeeAction {

	@Resource
	private QjEmployeeBiz biz;
	
	@PostMapping
	/**
	 * 登录
	 * @param session
	 * @param employee
	 * @return
	 */
	public Map<String,String> selectByLogin(HttpSession session, @RequestBody Employee employee){
		Map<String, String> map = new HashMap<String, String>();
		Employee employees = biz.selectByLogin(employee.getEmployeeid(), employee.getEpwd());
		if (employees != null) {
			map.put("code", "200");
			map.put("msg", "成功!");
			session.setAttribute("employees", employees);
		} else {
			map.put("code", "500");
			map.put("msg", "失败!");
		}
		return map;		
	}
	
	@GetMapping
	/**
	 * 获取session中的对象
	 * @param session
	 * @return
	 */
	public Employee getSession(HttpSession session) {
		return (Employee)session.getAttribute("users");
	}
	
	@GetMapping("loginOut")
	/**
	 * 退出
	 * @param session
	 */	
	public void loginOut(HttpSession session) {		
		session.removeAttribute("employees");
	}
	
	@GetMapping("queryOnline")
	/**
	 * 查询在职人员
	 * @return
	 */
//	public List<Employee> queryOnline() {
//		return  biz.selectEmploee();
//	} 
	public List<EmployeeVO> queryOnline(){
		return biz.selectAll();
	}
	
	
	@PostMapping("insertEmployee")
	/**
	 * 新增在职人员
	 * @param employee
	 * @return
	 */
	public Map<String, String> addEmployeeInfo(@RequestBody Employee employee) {
		Map<String, String> message = new HashMap<String, String>();
		biz.insertEmployee(employee);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	@PutMapping("updateEmployee")
	/**
	 * 修改在职人员
	 * @param employee
	 * @return
	 */
	public Map<String, String> updateEmployeeInfo(@RequestBody Employee employee) {
		Map<String, String> message = new HashMap<String, String>();
		biz.updateEmployee(employee);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	@DeleteMapping("deleteEmployee/{employeeid}")
	/**
	 * 删除该员工
	 * @param employeeid
	 * @return
	 */
	public Map<String, String> deleteEmployeeInfo(@PathVariable String employeeid) {
		Map<String, String> message = new HashMap<String, String>();
		biz.deleteEmployee(employeeid);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	@GetMapping("select/{ename}")
	/**
	 * 模糊查询
	 * @param ename
	 * @return
	 */
	public List<EmployeeVO> selectByename(@PathVariable String ename){
		return biz.selectByename(ename);
	}
	
	@GetMapping("selectLizhi")
	/**
	 * 查询离职
	 * @return
	 */
	public List<EmployeeVO> selectBystatusid(){
		return biz.selectBystatusid();
	}
	
	@GetMapping("selectEmployee/{employeeid}")
	/**
	 * 根据id查员工
	 * @param employeeid
	 * @return
	 */
	public Employee selectByEmployeeid(@PathVariable String employeeid) {
		return biz.selectByEmployeeid(employeeid);
	}
}
