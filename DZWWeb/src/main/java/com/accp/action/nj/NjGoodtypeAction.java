package com.accp.action.nj;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.nj.GoodsTypeBiz;
import com.accp.entity.Goodstype;

@RestController
@RequestMapping("nj/api/NjGoodstypeAction")
public class NjGoodtypeAction {
	@Resource
	private GoodsTypeBiz biz;
	/**
	 * 查询所有的商品类别
	 */
	public Map<String,String> queryAllGoodsType(HttpSession session){
		Map<String, String> map = new HashMap<String, String>();
		List<Goodstype> goodstype=biz.queryAllGoodsType();
		if (goodstype != null) {
			map.put("code", "200");
			map.put("msg", "成功!");
			session.setAttribute("client1", goodstype);
		} else {
			map.put("code", "500");
			map.put("msg", "失败!");
		}
		return map;		
	}
	
	/**
	 * 新增商品类别
	 */
	@PostMapping
	public Map<String, String> insertGoodsType(@RequestBody Goodstype record) {
		Map<String, String> map = new HashMap<String, String>();
		try {
			biz.insert(record);
			map.put("code", "200");
			map.put("msg", "成功!");
		} catch (Exception e) {
			map.put("code", "500");
			map.put("msg", "失败!");
		}
		return map;
	}
	/***
	 * 修改商品类别
	 */
	@PutMapping
	public Map<String, String> updateGoodsType(@RequestBody Goodstype record) {
		Map<String, String> map = new HashMap<String, String>();
		try {
			biz.updateGoodsType(record);
			map.put("code", "200");
			map.put("msg", "成功!");
		} catch (Exception e) {
			map.put("code", "500");
			map.put("msg", "失败!");
		}
		return map;
	}
	
	/**
	 * 删除商品类别
	 */
	public Map<String, String> deleteGoodsType(@PathVariable int goodid) {
		Map<String, String> map = new HashMap<String, String>();
		try {
			biz.deleteGoodsType(goodid);
			map.put("code", "200");
			map.put("msg", "成功!");
		} catch (Exception e) {
			map.put("code", "500");
			map.put("msg", "失败!");
		}
		return map;
	}
	

}
