package com.accp.action.nj;

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

import com.accp.biz.nj.ClientcarBiz;
import com.accp.entity.Clientcar;

@RestController
@RequestMapping("/nj/api/NjClientcarAction")
public class NjClientcarAction {
	@Resource
	private ClientcarBiz biz;
	
	@PostMapping("/selectClientcarByCno/{cno}")
	/**
	 * 张来遇写的根据车牌号查询车辆信息
	 * 
	 * @param cno
	 * @return
	 */
	public Clientcar selectClientcarByCno(@PathVariable String cno) {
		return biz.selectClientcarByCno(cno);
	}

	/**
	 * 查询用户名下的车子
	 */
	@PostMapping("/queryAll/{clientno}")
	public List<Clientcar> queryClientcarByClientno(HttpSession session, @PathVariable String clientno) {
		System.err.println(clientno);
		List<Clientcar> clientcar = biz.selectclientcar(clientno);
		return clientcar;
	}

	/**
	 * 查询用户名下的车子
	 */
	@GetMapping
	public List<Clientcar> queryClientcarByClientno1(HttpSession session, @PathVariable String clientno) {
		System.out.println(111);
		return null;
	}

	/**
	 * 新增用户信息
	 */
	@PostMapping("insert")
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
	@PutMapping("/update")
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
	@DeleteMapping("/delete/{cno}")
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
