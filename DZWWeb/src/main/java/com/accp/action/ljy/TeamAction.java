package com.accp.action.ljy;

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

import com.accp.biz.ljy.TeamBiz;
import com.accp.entity.Team;

@RestController
@RequestMapping("/ljy/api/TeamAction")
public class TeamAction {
	
	@Resource
	private TeamBiz biz;
	
	@GetMapping("{tid}")
	/**
	 * 根据维修单号查询维修
	 * @param tid
	 * @return
	 */
	public Team selectByPrimaryKey(Integer tid) {
		return biz.selectByPrimaryKey(tid);
	}
	
	@GetMapping("selectAllByType/{type}")
	/**
	 * 张来遇写的用于查询所有班组以及班组下的技工(动了TeamMapper.xml文件)
	 * @return
	 */
	public List<Team> selectAllByType(@PathVariable String type){
		return biz.selectAllByType(type);
	}
	
	@PostMapping
	/**
	 * 新增维修单
	 * @param Team
	 * @return
	 */
	public Map<String,String> insertSelective(@RequestBody Team Team) {		
		Map<String, String> map = new HashMap<String, String>();
		if (biz.insertSelective(Team) > 0) {
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
	 * @param Team
	 * @return
	 */
	public Map<String, String> updateByPrimaryKeySelective(@RequestBody Team Team) {
		Map<String, String> map = new HashMap<String, String>();
		if (biz.updateByPrimaryKeySelective(Team) > 0) {
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
	 * @param tid
	 * @return
	 */
	public Map<String, String> deleteByPrimaryKey(Integer tid) {
		Map<String, String> map = new HashMap<String, String>();
		if (biz.deleteByPrimaryKey(tid) > 0) {
			map.put("code", "200");
			map.put("msg", "成功!");			
		} else {
			map.put("code", "500");
			map.put("msg", "失败!");
		}
		return map;		
	}
}
