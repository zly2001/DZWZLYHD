package com.accp.action.ljy;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.ljy.jgbanzuBiz;
import com.accp.entity.Artisan;
import com.accp.entity.Workcar;

@RestController
@RequestMapping("/ljy/api/jgbanzuAction")
public class jgbanzuAction {
	@Resource
	private jgbanzuBiz biz;
	
	@GetMapping("jgbzselect/{tid}")
	public List<Artisan> jgbzselect(@PathVariable String  tid){
		return biz.jgbzselect(tid);
	}
	@GetMapping("deleteArtisan/{tid}")
	public int deleteArtisan(String tid) {			
		return biz.deleteArtisan(tid);
		}
	@PostMapping("insertSelective")
	public Map<String,String> insert(HttpSession session,@RequestBody Artisan artisan){
		Map<String,String> map=new HashMap<String,String>();
		try {
			biz.insertSelective(artisan);
			map.put("code", "200");
			map.put("msg","成功");
		} catch (Exception e) {
			// TODO: handle exception
			map.put("code","500");
			map.put("msg","失败");
		}
		return map;
	}
	@GetMapping("updateByPrimaryKeySelective")
	public Map<String,String> update(HttpSession session,@RequestBody Artisan artisan){
		Map<String,String> map=new HashMap<String,String>();
		try {
			biz.updateByPrimaryKeySelective(artisan);
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
