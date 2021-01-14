package com.accp.biz.zly;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.ItemstypeMapper;
import com.accp.entity.Itemstype;
import com.accp.entity.Itemstype;

@Service
/**
 * 事务管理元注解
 * @author 
 *
 */
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true, rollbackFor = {Exception.class })
public class ItemstypeBiz {
	
	@Resource
	private ItemstypeMapper dao;
	
	/**
	 * 根据维修项目类型id查询
	 * @param itemstypeid
	 * @return
	 */
	public Itemstype selectByPrimaryKey(Integer itemstypeid) {
		return dao.selectByPrimaryKey(itemstypeid);
	}
	
	/**
	 * 张来遇写的用于查询所有维修项目类型以及类型下的维修项目(动了ItemstypeMapper.xml文件)
	 * @return
	 */
	public List<Itemstype> selectAll(){
		return dao.selectAll();
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false, rollbackFor = {Exception.class })
	/**
	 * 新增维修类型
	 * @param Itemstype
	 * @return
	 */
	public Integer insertSelective(Itemstype Itemstype) {
		return dao.insertSelective(Itemstype);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false, rollbackFor = {Exception.class })
	/**
	 * 修改维修类型
	 * @param Itemstype
	 * @return
	 */
	public Integer updateByPrimaryKeySelective(Itemstype Itemstype) {
		return dao.updateByPrimaryKeySelective(Itemstype);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false, rollbackFor = {Exception.class })
	/**
	 * 删除维修类型
	 * @param itemstypeid
	 * @return
	 */
	public Integer deleteByPrimaryKey(Integer itemstypeid) {
		return dao.deleteByPrimaryKey(itemstypeid);
	}
}
