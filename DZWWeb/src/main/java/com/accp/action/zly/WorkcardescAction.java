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

import com.accp.biz.zly.WorkcardescBiz;
import com.accp.entity.Workcardesc;

@RestController
@RequestMapping("/zly/api/WorkcardescAction")
public class WorkcardescAction {

	@Resource
	private WorkcardescBiz biz;
	
	@GetMapping("{workcarjlid}")
	/**
	 * 根据救援车辆id查询救援车辆
	 * @param workcarjlid
	 * @return
	 */
	public Workcardesc selectByPrimaryKey(@PathVariable Integer workcarjlid) {
		return biz.selectByPrimaryKey(workcarjlid);
	}
	
	@GetMapping("selectByInid/{inid}")
	/**
	 * 张来遇写的根据维修编号查询救援记录
	 * 
	 * @param inid
	 * @return
	 */
	public Workcardesc selectByInid(@PathVariable String inid) {
		return biz.selectByInid(inid);
	}
	
	@PostMapping
	/**
	 * 新增救援车辆
	 * @param Workcardesc
	 * @return
	 */
	public Map<String,String> insertSelective(@RequestBody Workcardesc Workcardesc) {		
		Map<String, String> map = new HashMap<String, String>();
		if (biz.insertSelective(Workcardesc) > 0) {
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
	 * 修改救援车辆
	 * @param Workcardesc
	 * @return
	 */
	public Map<String, String> updateByPrimaryKeySelective(@RequestBody Workcardesc Workcardesc) {
		Map<String, String> map = new HashMap<String, String>();
		if (biz.updateByPrimaryKeySelective(Workcardesc) > 0) {
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
	 * 删除救援车辆
	 * @param workcarjlid
	 * @return
	 */
	public Map<String, String> deleteByPrimaryKey(Integer workcarjlid) {
		Map<String, String> map = new HashMap<String, String>();
		if (biz.deleteByPrimaryKey(workcarjlid) > 0) {
			map.put("code", "200");
			map.put("msg", "成功!");			
		} else {
			map.put("code", "500");
			map.put("msg", "失败!");
		}
		return map;		
	}
}
