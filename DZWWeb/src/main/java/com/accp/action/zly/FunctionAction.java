package com.accp.action.zly;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zly.FunctionBiz;
import com.accp.entity.Authority;
import com.accp.entity.Function;

@RestController
@RequestMapping("/zly/api/FunctionAction")
public class FunctionAction {

	@Resource
	private FunctionBiz biz;
	
	@GetMapping()	
	public List<Function> selectAllByFunction() {
		return biz.selectAllByFunction();
	}
	
	@PostMapping	
	public Map<String,String> insertSelective(@RequestBody Authority[] authority) {		
		Map<String, String> map = new HashMap<String, String>();
		biz.deleteByPositionid(authority[0].getPositionid());
		for (Authority a : authority) {
			biz.insertSelective(a);			
		}		
		map.put("code", "200");
		map.put("msg", "成功!");	
		return map;	
	}
}
