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

import com.accp.biz.ljy.waiqinBiz;
import com.accp.entity.Workcar;

@RestController
@RequestMapping("/ljy/api/waiqinAction")
public class waiqinAction {
	@Resource
	private waiqinBiz biz;
	
	@GetMapping("select")
	public List<Workcar> select(){
		return biz.select();
	}
	
	@GetMapping("delect/{wid}")
	public int delete(@PathVariable String wid) {
		return biz.delete(wid);
	}
	
	@PostMapping("insertSelective")
	public Map<String,String> insert(HttpSession session,@RequestBody Workcar workcar){
		Map<String,String> map=new HashMap<String,String>();
		try {
			biz.insertSelective(workcar);
			map.put("code", "200");
			map.put("msg","成功");
		} catch (Exception e) {
			// TODO: handle exception
			map.put("code","500");
			map.put("msg","失败");
		}
		return map;
	}
		
	@PutMapping("update")
	public Map<String,String> update(HttpSession session,@RequestBody Workcar workcar){
		Map<String,String> map=new HashMap<String,String>();
		try {
			biz.update(workcar);
			map.put("code", "200");
			map.put("msg","成功");
		} catch (Exception e) {
			// TODO: handle exception
			map.put("code","500");
			map.put("msg","失败");
		}
		return map;
	}
	
}
