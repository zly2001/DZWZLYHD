package com.accp.biz.zly;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.CashiersMapper;
import com.accp.entity.Cashiers;

@Service
/**
 * 事务管理元注解
 * 
 * @author
 *
 */
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true, rollbackFor = {
		Exception.class })
public class CashiersBiz {

	@Resource
	private CashiersMapper dao;	

	/**
	 * 根据收银记录号查询收银
	 * 
	 * @param casid
	 * @return
	 */
	public Cashiers selectByPrimaryKey(String casid) {
		return dao.selectByPrimaryKey(casid);
	}
	
	/**
	 * 查询所有收银
	 * @return
	 */
	public List<Cashiers> selecAllByCashiers() {
		return dao.selecAllByCashiers();
	}
	
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false, rollbackFor = {
			Exception.class })
	/**
	 * 新增收银记录
	 * 
	 * @param Cashiers
	 * @return
	 */
	public Integer insertSelective(Cashiers Cashiers) {
		return dao.insertSelective(Cashiers);
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false, rollbackFor = {
			Exception.class })
	/**
	 * 修改收银记录
	 * 
	 * @param Cashiers
	 * @return
	 */
	public Integer updateByPrimaryKeySelective(Cashiers Cashiers) {
		return dao.updateByPrimaryKeySelective(Cashiers);
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false, rollbackFor = {
			Exception.class })
	/**
	 * 删除收银记录
	 * 
	 * @param casid
	 * @return
	 */
	public Integer deleteByPrimaryKey(String casid) {
		return dao.deleteByPrimaryKey(casid);
	}
}
