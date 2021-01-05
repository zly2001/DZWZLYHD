package com.accp.biz.nj;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.GoodstypeMapper;
import com.accp.dao.nj.NjGoodsTypeMapper;
import com.accp.entity.Goodstype;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true, rollbackFor = {Exception.class })
public class GoodsTypeBiz {
	@Resource
	private NjGoodsTypeMapper goodstype;
	/**
	 * 查询所有商品类别
	 */
	public List<Goodstype> queryAllGoodsType(){
		return goodstype.queryAllGoodsType();
	}
	/**
	 * 根据商品类别id查询特定的商品类别
	 * 
	 */
	public Goodstype selectgoodstype(int goodid) {
		return goodstype.selectByPrimaryKey(goodid);
	}
	/**
	 * 新增商品类别
	 */
	public int insert(Goodstype record) {
		return goodstype.insert(record);
	}
	/**
	 * 修改商品类别
	 */
	public int updateGoodsType(Goodstype record) {
		return goodstype.updateByPrimaryKey(record);
	}
	/**
	 * 删除商品类别
	 */
	public int deleteGoodsType(int goodid) {
		return goodstype.deleteByPrimaryKey(goodid);
	}
	
	
}
