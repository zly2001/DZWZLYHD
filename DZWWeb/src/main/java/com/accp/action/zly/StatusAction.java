package com.accp.action.zly;

import java.util.HashMap;
import java.util.List;
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

import com.accp.biz.zly.StatusBiz;
import com.accp.entity.Status;

@RestController
@RequestMapping("/zly/api/StatusAction")
public class StatusAction {

	@Resource
	private StatusBiz biz;
	
	@GetMapping("{statusid}")
	/**
	 * 根据维修单号查询维修
	 * @param statusid
	 * @return
	 */
	public Status selectByPrimaryKey(@PathVariable Integer statusid) {
		return biz.selectByPrimaryKey(statusid);
	}
	
	@GetMapping("selectAllByType/{type}")
	/**
	 * 张来遇写的根据状态类型查询不同的状态集合改了StatusMapper.xml文件
	 * @param type
	 * @return
	 */
	public List<Status> selectAllByType(@PathVariable String type){
		return biz.selectAllByType(type);
	}
	
	@PostMapping
	/**
	 * 新增维修单
	 * @param Status
	 * @return
	 */
	public Map<String,String> insertSelective(@RequestBody Status Status) {		
		Map<String, String> map = new HashMap<String, String>();
		if (biz.insertSelective(Status) > 0) {
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
	 * @param Status
	 * @return
	 */
	public Map<String, String> updateByPrimaryKeySelective(@RequestBody Status Status) {
		Map<String, String> map = new HashMap<String, String>();
		if (biz.updateByPrimaryKeySelective(Status) > 0) {
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
	 * @param statusid
	 * @return
	 */
	public Map<String, String> deleteByPrimaryKey(Integer statusid) {
		Map<String, String> map = new HashMap<String, String>();
		if (biz.deleteByPrimaryKey(statusid) > 0) {
			map.put("code", "200");
			map.put("msg", "成功!");			
		} else {
			map.put("code", "500");
			map.put("msg", "失败!");
		}
		return map;		
	}
}
