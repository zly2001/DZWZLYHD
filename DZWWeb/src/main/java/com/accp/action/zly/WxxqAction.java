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

import com.accp.biz.zly.WxxqMapperBiz;
import com.accp.entity.Wxxq;

@RestController
@RequestMapping("/zly/api/WxxqAction")
public class WxxqAction {

	@Resource
	private WxxqMapperBiz biz;
	
	@GetMapping("{xqid}")
	/**
	 * 根据id查询维修详情
	 * @param xqid
	 * @return
	 */
	public Wxxq selectByPrimaryKey(@PathVariable Integer xqid) {
		return biz.selectByPrimaryKey(xqid);
	}
	
	@PostMapping
	/**
	 * 新增维修详情
	 * @param Wxxq
	 * @return
	 */
	public Map<String,String> insertSelective(@RequestBody Wxxq[] Wxxqs) {		
		Map<String, String> map = new HashMap<String, String>();
		try {
			for (Wxxq w : Wxxqs) {				
				biz.insertSelective(w);
			}
			map.put("code", "200");
			map.put("msg", "成功!");	
		} catch (Exception e) {
			map.put("code", "500");
			map.put("msg", "失败!");
		}		
		return map;	
	}
	
	@PutMapping
	/**
	 * 修改维修详情
	 * @param Wxxq
	 * @return
	 */
	public Map<String, String> updateByPrimaryKeySelective(@RequestBody Wxxq Wxxq) {
		Map<String, String> map = new HashMap<String, String>();
		if (biz.updateByPrimaryKeySelective(Wxxq) > 0) {
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
	 * 删除维修详情
	 * @param xqid
	 * @return
	 */
	public Map<String, String> deleteByPrimaryKey(Integer xqid) {
		Map<String, String> map = new HashMap<String, String>();
		if (biz.deleteByPrimaryKey(xqid) > 0) {
			map.put("code", "200");
			map.put("msg", "成功!");			
		} else {
			map.put("code", "500");
			map.put("msg", "失败!");
		}
		return map;		
	}
}
