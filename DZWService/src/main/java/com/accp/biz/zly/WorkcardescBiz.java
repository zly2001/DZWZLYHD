package com.accp.biz.zly;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.WorkcardescMapper;
import com.accp.entity.Workcardesc;

@Service
/**
 * 事务管理元注解
 * 
 * @author
 *
 */
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true, rollbackFor = {
		Exception.class })
public class WorkcardescBiz {

	@Resource
	private WorkcardescMapper dao;

	/**
	 * 根据救援车辆记录id查询救援车辆记录
	 * 
	 * @param workcarjlid
	 * @return
	 */
	public Workcardesc selectByPrimaryKey(Integer workcarjlid) {
		return dao.selectByPrimaryKey(workcarjlid);
	}

	/**
	 * 张来遇写的根据维修编号查询救援记录
	 * 
	 * @param inid
	 * @return
	 */
	public Workcardesc selectByInid(String inid) {
		return dao.selectByInid(inid);
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false, rollbackFor = {
			Exception.class })
	/**
	 * 新增救援车辆记录
	 * 
	 * @param Workcardesc
	 * @return
	 */
	public Integer insertSelective(Workcardesc Workcardesc) {
		return dao.insertSelective(Workcardesc);
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false, rollbackFor = {
			Exception.class })
	/**
	 * 修改救援车辆记录
	 * 
	 * @param Workcardesc
	 * @return
	 */
	public Integer updateByPrimaryKeySelective(Workcardesc Workcardesc) {
		return dao.updateByPrimaryKeySelective(Workcardesc);
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false, rollbackFor = {
			Exception.class })
	/**
	 * 删除救援车辆记录
	 * 
	 * @param workcarjlid
	 * @return
	 */
	public Integer deleteByPrimaryKey(Integer workcarjlid) {
		return dao.deleteByPrimaryKey(workcarjlid);
	}
}
