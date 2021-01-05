package com.accp.dao.nj;

import java.util.List;

import com.accp.entity.Goodstype;

public interface NjGoodsTypeMapper {
	/**
	 * 根据商品类型id删除商品类型
	 * 
	 * @param goodid
	 * @return
	 */
	int deleteByPrimaryKey(Integer goodid);

	/**
	 * 新增商品类型
	 * 
	 * @param record
	 * @return
	 */
	int insert(Goodstype record);

	/**
	 * 新增商品类型
	 * 
	 * @param record
	 * @return
	 */
	int insertSelective(Goodstype record);

	/**
	 * 通过商品类型id查询特定类型
	 * 
	 * @param goodid
	 * @return
	 */
	Goodstype selectByPrimaryKey(Integer goodid);

	/**
	 * 修改商品类型
	 * 
	 * @param record
	 * @return
	 */
	int updateByPrimaryKeySelective(Goodstype record);

	/**
	 * 通过商品类型id修改商品类型
	 * 
	 * @param record
	 * @return
	 */
	int updateByPrimaryKey(Goodstype record);

	/**
	 * 查询所有商品类型
	 * 
	 * @return
	 */
	List<Goodstype> queryAllGoodsType();

}
