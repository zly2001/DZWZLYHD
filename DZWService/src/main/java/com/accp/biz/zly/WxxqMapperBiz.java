package com.accp.biz.zly;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.WxxqMapper;
import com.accp.entity.Wxxq;

@Service
/**
 * 事务管理元注解
 * @author 
 *
 */
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true, rollbackFor = {Exception.class })
public class WxxqMapperBiz {

	@Resource
	private WxxqMapper dao;
	
	/**
	 * 根据id查询维修详情
	 * @param xqid
	 * @return
	 */
	public Wxxq selectByPrimaryKey(Integer xqid) {
		return dao.selectByPrimaryKey(xqid);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false, rollbackFor = {Exception.class })
	/**
	 * 新增维修单详情
	 * @param Wxxq
	 * @return
	 */
	public Integer insertSelective(Wxxq Wxxq) {
		return dao.insertSelective(Wxxq);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false, rollbackFor = {Exception.class })
	/**
	 * 修改维修详情
	 * @param Wxxq
	 * @return
	 */
	public Integer updateByPrimaryKeySelective(Wxxq Wxxq) {
		return dao.updateByPrimaryKeySelective(Wxxq);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false, rollbackFor = {Exception.class })
	/**
	 * 删除维修详情
	 * @param xqid
	 * @return
	 */
	public Integer deleteByPrimaryKey(Integer xqid) {
		return dao.deleteByPrimaryKey(xqid);
	}

}
