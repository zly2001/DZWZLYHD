package com.accp.action.zly;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zly.InststionMapperBiz;
import com.accp.entity.Inststion;

@RestController
@RequestMapping("/zly/api/InststionAction")
public class InststionAction {

	@Resource
	private InststionMapperBiz biz;
	
	@GetMapping("{inid}")
	/**
	 * 根据维修单号查询维修
	 * @param inid
	 * @return
	 */
	public Inststion selectByPrimaryKey(@PathVariable String inid) {
		return biz.selectByPrimaryKey(inid);
	}
	
	@PostMapping
	/**
	 * 新增维修单
	 * @param inststion
	 * @return
	 */
	public Map<String,String> insertSelective(@RequestBody Inststion inststion) {		
		Map<String, String> map = new HashMap<String, String>();
		if (biz.insertSelective(inststion) > 0) {
			map.put("code", "200");
			map.put("msg", "成功!");			
		} else {
			map.put("code", "500");
			map.put("msg", "失败!");
		}
		return map;	
	}
	
	@PutMapping
	/**
	 * 修改维修单
	 * @param inststion
	 * @return
	 */
	public Map<String, String> updateByPrimaryKeySelective(@RequestBody Inststion inststion) {
		Map<String, String> map = new HashMap<String, String>();
		if (biz.updateByPrimaryKeySelective(inststion) > 0) {
			map.put("code", "200");
			map.put("msg", "成功!");			
		} else {
			map.put("code", "500");
			map.put("msg", "失败!");
		}
		return map;
	}
	
	@DeleteMapping
	/**
	 * 删除维修单
	 * @param inid
	 * @return
	 */
	public Map<String, String> deleteByPrimaryKey(String inid) {
		Map<String, String> map = new HashMap<String, String>();
		if (biz.deleteByPrimaryKey(inid) > 0) {
			map.put("code", "200");
			map.put("msg", "成功!");			
		} else {
			map.put("code", "500");
			map.put("msg", "失败!");
		}
		return map;		
	}
}
