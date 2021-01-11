package com.accp.action.zly;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zly.ItemstypeBiz;
import com.accp.entity.Itemstype;

@RestController
@RequestMapping("/lp/api/ItemstypeAction")
public class ItemstypeAction {

	@Resource
	private ItemstypeBiz biz;

	@GetMapping("{itemstypeid}")
	/**
	 * 根据维修单号查询维修
	 * 
	 * @param itemstypeid
	 * @return
	 */
	public Itemstype selectByPrimaryKey(Integer itemstypeid) {
		return biz.selectByPrimaryKey(itemstypeid);
	}
	
	@GetMapping("selectAll")
	/**
	 * 张来遇写的用于查询所有维修项目类型以及类型下的维修项目(动了ItemstypeMapper.xml文件)
	 * @return
	 */
	public List<Itemstype> selectAll(){
		return biz.selectAll();
	}

	@PostMapping
	/**
	 * 新增维修单
	 * 
	 * @param Itemstype
	 * @return
	 */
	public Map<String, String> insertSelective(@RequestBody Itemstype Itemstype) {
		Map<String, String> map = new HashMap<String, String>();
		if (biz.insertSelective(Itemstype) > 0) {
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
	 * 
	 * @param Itemstype
	 * @return
	 */
	public Map<String, String> updateByPrimaryKeySelective(@RequestBody Itemstype Itemstype) {
		Map<String, String> map = new HashMap<String, String>();
		if (biz.updateByPrimaryKeySelective(Itemstype) > 0) {
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
	 * 
	 * @param itemstypeid
	 * @return
	 */
	public Map<String, String> deleteByPrimaryKey(Integer itemstypeid) {
		Map<String, String> map = new HashMap<String, String>();
		if (biz.deleteByPrimaryKey(itemstypeid) > 0) {
			map.put("code", "200");
			map.put("msg", "成功!");
		} else {
			map.put("code", "500");
			map.put("msg", "失败!");
		}
		return map;
	}

}
