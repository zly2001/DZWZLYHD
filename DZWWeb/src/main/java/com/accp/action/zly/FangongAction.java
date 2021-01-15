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

import com.accp.biz.zly.FangongBiz;
import com.accp.entity.Fangong;
import com.accp.entity.Wugongtype;

@RestController
@RequestMapping("/zly/api/FangongAction")
public class FangongAction {

	@Resource
	private FangongBiz biz;
	
	@GetMapping("/selectByAllByFangong")
	/**
	 *  张来遇写的查询所有返工记录表
	 * @return
	 */
	public List<Fangong> selectByAllByFangong() {
		return biz.selectByAllByFangong();
	}
	
	@GetMapping("/selectAllByWugongtype")
	/**
	 * 张来遇写的查询所有返工类型
	 * @return
	 */
	public List<Wugongtype> selectAllByWugongtype() {
		return biz.selectAllByWugongtype();
	}
	
	@GetMapping("{fid}")
	/**
	 * 根据返工记录号查询维修
	 * @param fid
	 * @return
	 */
	public Fangong selectByPrimaryKey(@PathVariable Integer fid) {
		return biz.selectByPrimaryKey(fid);
	}
	
	@PostMapping
	/**
	 * 新增返工记录
	 * @param Fangong
	 * @return
	 */
	public Map<String,String> insertSelective(@RequestBody Fangong Fangong) {		
		Map<String, String> map = new HashMap<String, String>();
		if (biz.insertSelective(Fangong) > 0) {
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
	 * 修改返工记录
	 * @param Fangong
	 * @return
	 */
	public Map<String, String> updateByPrimaryKeySelective(@RequestBody Fangong Fangong) {
		Map<String, String> map = new HashMap<String, String>();
		if (biz.updateByPrimaryKeySelective(Fangong) > 0) {
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
	 * 删除返工记录
	 * @param fid
	 * @return
	 */
	public Map<String, String> deleteByPrimaryKey(Integer fid) {
		Map<String, String> map = new HashMap<String, String>();
		if (biz.deleteByPrimaryKey(fid) > 0) {
			map.put("code", "200");
			map.put("msg", "成功!");			
		} else {
			map.put("code", "500");
			map.put("msg", "失败!");
		}
		return map;		
	}
}
