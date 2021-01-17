package com.accp.action.ljy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.ljy.ljyBiz;
import com.accp.entity.Stars;

@RestController
@RequestMapping("/ljy/api/LjyAction")
public class LjyAction {
	@Resource
	private ljyBiz biz;
	//第四步
	
	//查询
	@GetMapping("SelectAll")
	public List<Stars> SelectAll(){
		return biz.LjySelectAll();
	}
	//删除
	@GetMapping("delect/{sid}")
	public int deleteStars(@PathVariable String sid){
		return biz.deleteStars(sid);
	}
	
	@PostMapping("insert")
	public Map<String,String> insert(HttpSession session, @RequestBody Stars stars){
		Map<String, String> map = new HashMap<String, String>();
		try {
			biz.insertJiGong(stars);
			map.put("code", "200");
			map.put("msg", "成功!");
		} catch (Exception e) {
			map.put("code", "500");
			map.put("msg", "失败!");
		}
		return map;		
	}
	
	@PutMapping("updateJiGong")
	public Map<String,String> updateJiGong(HttpSession session, @RequestBody Stars stars){
		Map<String, String> map = new HashMap<String, String>();
		try {
			biz.updateJiGong(stars);
			map.put("code", "200");
			map.put("msg", "成功!");
		} catch (Exception e) {
			map.put("code", "500");
			map.put("msg", "失败!");
		}
		return map;		
	}
	
	@PutMapping("mhcxselect")
	public List<Stars> mhcxselect(String sid){
		return biz.mhcxselect(sid);
	}
}
