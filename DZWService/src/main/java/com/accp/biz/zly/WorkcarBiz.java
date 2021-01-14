package com.accp.biz.zly;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.WorkcarMapper;
import com.accp.entity.Workcar;

@Service
/**
 * 事务管理元注解
 * 
 * @author
 *
 */
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true, rollbackFor = {
		Exception.class })
public class WorkcarBiz {

	@Resource
	private WorkcarMapper dao;

	/**
	 * 根据救援车辆id查询救援车辆
	 * 
	 * @param wid
	 * @return
	 */
	public Workcar selectByPrimaryKey(Integer wid) {
		return dao.selectByPrimaryKey(wid);
	}

	/**
	 * 张来遇写查询出所有空闲状态中的救援车辆
	 * 
	 * @return
	 */
	public List<Workcar> selectAllByWorkcar(String statusid) {
		return dao.selectAllByWorkcar(statusid);
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false, rollbackFor = {
			Exception.class })
	/**
	 * 新增救援车辆
	 * 
	 * @param Workcar
	 * @return
	 */
	public Integer insertSelective(Workcar Workcar) {
		return dao.insertSelective(Workcar);
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false, rollbackFor = {
			Exception.class })
	/**
	 * 修改救援车辆
	 * 
	 * @param Workcar
	 * @return
	 */
	public Integer updateByPrimaryKeySelective(Workcar Workcar) {
		return dao.updateByPrimaryKeySelective(Workcar);
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false, rollbackFor = {
			Exception.class })
	/**
	 * 删除救援车辆
	 * 
	 * @param wid
	 * @return
	 */
	public Integer deleteByPrimaryKey(Integer wid) {
		return dao.deleteByPrimaryKey(wid);
	}
}
