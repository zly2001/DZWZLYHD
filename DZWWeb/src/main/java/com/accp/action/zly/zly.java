package com.accp.action.zly;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.qj.QjEmployeeBiz;
import com.accp.entity.Employee;

@RestController
@RequestMapping("zly/api/EmployeeAction")
public class zly {

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
		System.out.println("进来了");
		session.removeAttribute("employees");
	}
}
