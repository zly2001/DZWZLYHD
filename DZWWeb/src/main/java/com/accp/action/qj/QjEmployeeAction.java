package com.accp.action.qj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

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
import com.accp.entity.Function;


@RestController
@RequestMapping("/qj/api/QjEmployeeAction")
public class QjEmployeeAction {

	@Resource
	private QjEmployeeBiz biz;
	
	/**
	 * 获取树节点对象
	 * @param session
	 * @return
	 */
	@GetMapping("getFunTree")
	public List getUserFunTree(HttpSession session) {
		// 从session获得用户，以便得到权限
		Employee employee = (Employee) session.getAttribute("employee");		
		List tree = new ArrayList();		
		Set<String> menuNames = new TreeSet<String>();// 剔除重复值，保存一级菜单名称
		for (Function fun : employee.getPosition().getFunctions()) {			
			if (fun.getFpida() != null) {					
				menuNames.add(fun.getFpida().getFname());
			}
		}
		// 遍历一级菜单名称，生成二级菜单项
		for (String name : menuNames) {
			// 节点【初始化】
			Map<String, Object> node = new HashMap<String, Object>();
			node.put("id", 0);// 0:根级菜单
			node.put("text", name);
			List nodeChild = new ArrayList();
			for (Function fun : employee.getPosition().getFunctions()) {
				if (fun.getFpida() != null) {
					// 匹配是否是当前菜单的子项
					if (name.equals(fun.getFpida().getFname())) {
						Map<String, Object> n = new HashMap<String, Object>();
						n.put("id", fun.getFcode());
						n.put("text", fun.getFname());
						nodeChild.add(n);
					}
				}
			}
			node.put("children", nodeChild);
			tree.add(node);
		}
		return tree;
	}
	
	@PostMapping
	/**
	 * 登录
	 * @param session
	 * @param employee
	 * @return
	 */
	public Employee selectByLogin(HttpSession session, @RequestBody Employee employee){
		Employee employees = biz.selectByLogin(employee.getEmployeeid(), employee.getEpwd());	
		session.setAttribute("employee",employees);
		return employees;		
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
