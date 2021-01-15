package com.accp.action.lp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lp.EngineBiz;
import com.accp.biz.qj.QjEmployeeBiz;
import com.accp.dao.lp.Engine;
import com.accp.entity.Brand;
import com.accp.entity.Employee;
import com.accp.entity.Firm;
import com.accp.entity.Goodstype;
import com.accp.entity.Items;
import com.accp.entity.lp.ItemsVO;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/lp/api/Engine")
public class EngineAction {
	
	@Resource
	private EngineBiz biz;
	//查询
	/**
	 * 根据条件查询发动机
	 * */
	@GetMapping("selectAll/{p}/{bh}/{name}")
	public PageInfo<Goodstype> SelectAll(@PathVariable Integer p,@PathVariable String bh,@PathVariable String name){
		if(bh.equals("-1")) {
			bh="";
		}
		if(name.equals("-1")) {
			name="";
		}
		return biz.SelectAll(p, bh, name);
	}
	/**
	 * 根据条件查询供应商
	 * */
	@GetMapping("selectAll3/{p}/{bh}")
	public PageInfo<Firm> SelectAll3(@PathVariable Integer p,@PathVariable String bh){
		if(bh.equals("-1")) {
			bh="";
		}
		return biz.SelectAll3(p, bh);
	}
	/**
	 * 根据条件查询车辆
	 * */
	@GetMapping("selectAll2/{p}/{name}")
	public PageInfo<Brand> SelectAll(@PathVariable Integer p,@PathVariable String name){
		if(name.equals("-1")) {
			name="";
		}
		return biz.SelectAll2(p,name);
	}
	
	
	/**
	 * 根据条件查询维修项目
	 * */
	@GetMapping("selectAll4/{p}/{name}")
	public PageInfo<ItemsVO> SelectAll4(@PathVariable Integer p,@PathVariable String name){
		if(name.equals("-1")) {
			name="";
		}
		return biz.SelectAll4(p,name);
	}
	
	
	/**
	 * 根据查询车辆
	 * */
	@GetMapping("selectAll5")
	public List<Brand> SelectAll5(){
		return biz.SelectAll5();
	}
	
	/**
	 * 根据查询供货商
	 * */
	@GetMapping("selectAll6")
	public List<Firm> SelectAll6(){
		return biz.SelectAll6();
	}
	
	
	
	
	
	//删除
	/**
	 * 根据编号删除发动机
	 * */
	@GetMapping("removeEngine/{bh}")
	public int removeEngine(@PathVariable String bh) {
		return biz.removeEngine(bh);
	}
	/**
	 * 根据编号删除车辆
	 * */
	@GetMapping("removeMotorcycle/{bh}")
	public int removeMotorcycle(@PathVariable String bh) {
		return biz.removeMotorcycle(bh);
	}
	
	@GetMapping("removeFirm/{bh}")
	public int deleteByPrimaryKey(@PathVariable Integer bh) {
		return biz.deleteByPrimaryKey(bh);
	}
	
	
	
	
	//修改
	/**
	 * 根据编号修改发动机名称
	 * */
	@GetMapping("updateEngine/{bh}/{name}")
	public int updateEngine(@PathVariable String bh,@PathVariable String name) {
		return biz.updateEngine(bh, name);
	}
	
	/**
	 * 根据编号修改车辆名称
	 * */
	@GetMapping("updataMotorcycle/{bh}/{name}/{szm}")
	public int updataMotorcycle(@PathVariable String bh,@PathVariable String name,@PathVariable String szm) {
		return biz.updateMotorcycle(bh,name,szm);
	}
	
	
	@PutMapping("updateFirm")
	public int updateByPrimaryKeySelective(@RequestBody Firm firm) {
		return biz.updateByPrimaryKeySelective(firm);
	}
	
	
	
	
	
	
	//新增
	/**
	 * 新增发动机
	 * */
	@GetMapping("addEngine/{name2}")
	public int addEngine(@PathVariable String name2) {
		return biz.addEngine(new Goodstype(0,name2,null,null,null,null,null));
	}
	
	
	/**
	 * 新增车辆品牌
	 * */
	@PostMapping("addMotorcycle")
	public int addMotorcycle(@RequestBody Brand xz) {
		return biz.addMotorcycle(xz);
	}
	
	
	/**
	 * 新增供货商
	 * */
	@PostMapping("addFirm")
	public int addFrim(@RequestBody Firm firm) {
		return biz.addFrim(firm);
	}
	
	
	/**
	 * 新增维修项目
	 * */
	@PostMapping("addItems")
	public int addFrim(@RequestBody Items i) {
		return biz.addItems(i);
	}
	

}
