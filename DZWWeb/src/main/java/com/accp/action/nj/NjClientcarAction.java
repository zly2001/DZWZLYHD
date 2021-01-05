package com.accp.action.nj;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.nj.ClientcarBiz;
import com.accp.entity.Clientcar;
import com.accp.entity.Goodstype;

@RestController
@RequestMapping("nj/api/NjClientcarAction")
public class NjClientcarAction {
	@Resource
	private ClientcarBiz biz;
	/**
	 * 查询用户名下的车子
	 */
	public Map<String,String> queryClientcarByClientno(HttpSession session, @RequestBody String cno){
		Map<String, String> map = new HashMap<String, String>();
		Clientcar clientcar=biz.selectclientcar(cno);
		if (clientcar != null) {
			map.put("code", "200");
			map.put("msg", "成功!");
			session.setAttribute("client1", clientcar);
		} else {
			map.put("code", "500");
			map.put("msg", "失败!");
		}
		return map;		
	}
	
	/**
	 * 新增用户信息
	 */
	@PostMapping
	public Map<String, String> insertClientcar(@RequestBody Clientcar record) {
		Map<String, String> map = new HashMap<String, String>();
		try {
			biz.insert(record);
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
	@PutMapping
	public Map<String, String> updateClientcar(@RequestBody Clientcar record) {
		Map<String, String> map = new HashMap<String, String>();
		try {
			biz.updateClientcar(record);
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
	public Map<String, String> deleteClientcar(@PathVariable String cno) {
		Map<String, String> map = new HashMap<String, String>();
		try {
			biz.deleteClientcar(cno);
			map.put("code", "200");
			map.put("msg", "成功!");
		} catch (Exception e) {
			map.put("code", "500");
			map.put("msg", "失败!");
		}
		return map;
	}
	

}
