package com.accp.biz.zly;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.InststionMapper;
import com.accp.entity.Inststion;

@Service
/**
 * 事务管理元注解
 * 
 * @author
 *
 */
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true, rollbackFor = {
		Exception.class })
public class InststionMapperBiz {

	@Resource
	private InststionMapper dao;

	/**
	 * 根据维修单号查询维修
	 * 
	 * @param inid
	 * @return
	 */
	public Inststion selectByPrimaryKey(String inid) {
		return dao.selectByPrimaryKey(inid);
	}

	/**
	 * 张来遇写的根据维修状态和车牌号查询所有维修单与维修详情和救援记录改了Inststion.java文件和InststionMapper.xml文件
	 * 
	 * @param cno
	 * @param statusid
	 * @return
	 */
	public List<Inststion> selectAllByCnoAndStatusid(String cno, String statusid) {
		return dao.selectAllByCnoAndStatusid(cno, statusid);
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false, rollbackFor = {
			Exception.class })
	/**
	 * 新增维修单
	 * 
	 * @param inststion
	 * @return
	 */
	public Integer insertSelective(Inststion inststion) {
		return dao.insertSelective(inststion);
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false, rollbackFor = {
			Exception.class })
	/**
	 * 修改维修单
	 * 
	 * @param inststion
	 * @return
	 */
	public Integer updateByPrimaryKeySelective(Inststion inststion) {
		return dao.updateByPrimaryKeySelective(inststion);
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false, rollbackFor = {
			Exception.class })
	/**
	 * 删除维修单
	 * 
	 * @param inid
	 * @return
	 */
	public Integer deleteByPrimaryKey(String inid) {
		return dao.deleteByPrimaryKey(inid);
	}
}
