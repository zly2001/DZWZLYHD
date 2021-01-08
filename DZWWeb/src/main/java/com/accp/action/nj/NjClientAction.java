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
import com.accp.biz.nj.ClientBiz;
import com.accp.entity.Client;


@RestController
@RequestMapping("/nj/api/NjClientAction")
public class NjClientAction {
	@Resource
	private ClientBiz biz;
	
	@PostMapping("queryAll")
	/***
	 * 查询所有用户信息
	 */
	public List<Client> queryAllClient(HttpSession session){
		
		List<Client> client1=biz.queryAllClientMessage();
		
		return client1;		
	}
	@PostMapping("/queryUser/{clientno}")
	/**
	 * 查询单个用户信息
	 */
	public Map<String,String> queryClient(HttpSession session, @PathVariable String clientno){
		Map<String, String> map = new HashMap<String, String>();
		Client client1=biz.selectClient(clientno);
		if (client1 != null) {
			map.put("code", "200");
			map.put("msg", "成功!");
			session.setAttribute("client1", client1);
		} else {
			map.put("code", "500");
			map.put("msg", "失败!");
		}
		return map;		
	}
	/**
	 * 新增用户信息
	 */
	@PostMapping("insert")
	public Map<String, String> insert(@RequestBody Client client) {
		Map<String, String> map = new HashMap<String, String>();
		try {
			biz.insert(client);
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
	@PutMapping("update")
	public Map<String, String> updateClient(@RequestBody Client client) {
		Map<String, String> map = new HashMap<String, String>();
		try {
			biz.updateClient(client);
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
	@DeleteMapping("/delete/{clientno}")
	public Map<String, String> deleteClient(@PathVariable String clientno) {
		Map<String, String> map = new HashMap<String, String>();
		try {
			biz.deleteClient(clientno);
			map.put("code", "200");
			map.put("msg", "成功!");
		} catch (Exception e) {
			map.put("code", "500");
			map.put("msg", "失败!");
		}
		return map;
	}
	

}
