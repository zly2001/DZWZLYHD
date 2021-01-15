package com.accp.biz.lp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.lp.Engine;
import com.accp.dao.lp.FIRM;
import com.accp.dao.lp.ITEMS;
import com.accp.dao.lp.Motorcycle;
import com.accp.entity.Brand;
import com.accp.entity.Firm;
import com.accp.entity.Goodstype;
import com.accp.entity.Items;
import com.accp.entity.lp.ItemsVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
/**
 * 事务管理元注解
 * @author Administrator
 *
 */
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true, rollbackFor = {Exception.class })
public class EngineBiz {
	@Resource
	private Engine dao;
	@Resource
	private Motorcycle dao2;
	
	@Resource
	private FIRM dao3;
	
	@Resource
	private ITEMS dao4;
	
	
	//查询
	public PageInfo<Goodstype> SelectAll(Integer p,String bh,String name){
		PageHelper.startPage(p, 5);
		return new PageInfo<Goodstype>(dao.SelectAll(bh, name));
	}
	
	public PageInfo<Brand> SelectAll2(Integer p,String name){
		PageHelper.startPage(p, 5);
		return new PageInfo<Brand>(dao2.SelectAll(name));
	}
	
	
	public List<Brand> SelectAll5(){
		return dao.SelectAll5();
	}
	
	public List<Firm> SelectAll6(){
		return dao.SelectAll6();
	}
	
	public PageInfo<Firm> SelectAll3(Integer p,String bh){
		PageHelper.startPage(p, 5);
		return new PageInfo<Firm>(dao3.SelectAll(bh));
	}
	
	public PageInfo<ItemsVO> SelectAll4(Integer p,String bh){
		PageHelper.startPage(p, 5);
		return new PageInfo<ItemsVO>(dao3.selectAll2(bh));
	}
	
	
	
	
	//删除
	public int removeEngine(String bh) {
		return dao.removeEngine(bh);
	}
	public int removeMotorcycle(String bh) {
		return dao2.removeMotorcycle(bh);
	}
	
	public int deleteByPrimaryKey(Integer bh) {
		return dao3.deleteByPrimaryKey(bh);
	}
	
	
	
	
	//修改
	public int updateEngine(String bh,String name) {
		return dao.updateEngine(bh, name);
	}
	public int updateMotorcycle(String bh,String name,String szm) {
		return dao2.updateMotorcycle(bh, name,szm);
	}
	public int updateByPrimaryKeySelective(Firm f) {
		return dao3.updateByPrimaryKeySelective(f);
	}
	
	
	//新增
	public int addEngine(Goodstype g) {
		return dao.addEngine(g);
	}
	
	
	public int addMotorcycle(Brand b) {
		return dao2.addMotorcycle(b);
	}
	
	public int addFrim(Firm f) {
		return dao3.insertSelective(f);
	}
	
	public int addItems(Items i) {
		return dao4.insert(i);
	}


	
	
}
