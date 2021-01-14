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

import com.accp.biz.zly.WorkcarBiz;
import com.accp.entity.Workcar;

@RestController
@RequestMapping("/zly/api/WorkcarAction")
public class WorkcarAction {

	@Resource
	private WorkcarBiz biz;
	
	@GetMapping("{wid}")
	/**
	 * 根据救援车辆id查询救援车辆
	 * @param wid
	 * @return
	 */
	public Workcar selectByPrimaryKey(@PathVariable Integer wid) {
		return biz.selectByPrimaryKey(wid);
	}
	
	@GetMapping()
	/**
	 * 张来遇写查询出所有空闲状态中的救援车辆
	 * @return
	 */
	public  List<Workcar> selectAllByWorkcar() {
		return biz.selectAllByWorkcar();
	}
	
	@PostMapping
	/**
	 * 新增救援车辆
	 * @param Workcar
	 * @return
	 */
	public Map<String,String> insertSelective(@RequestBody Workcar Workcar) {		
		Map<String, String> map = new HashMap<String, String>();
		if (biz.insertSelective(Workcar) > 0) {
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
	 * @param Workcar
	 * @return
	 */
	public Map<String, String> updateByPrimaryKeySelective(@RequestBody Workcar Workcar) {
		Map<String, String> map = new HashMap<String, String>();
		if (biz.updateByPrimaryKeySelective(Workcar) > 0) {
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
	 * @param wid
	 * @return
	 */
	public Map<String, String> deleteByPrimaryKey(Integer wid) {
		Map<String, String> map = new HashMap<String, String>();
		if (biz.deleteByPrimaryKey(wid) > 0) {
			map.put("code", "200");
			map.put("msg", "成功!");			
		} else {
			map.put("code", "500");
			map.put("msg", "失败!");
		}
		return map;		
	}
}
