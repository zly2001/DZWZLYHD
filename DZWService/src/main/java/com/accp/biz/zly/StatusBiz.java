package com.accp.biz.zly;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.StatusMapper;
import com.accp.entity.Status;

@Service
/**
 * 事务管理元注解
 * @author 
 *
 */
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true, rollbackFor = {Exception.class })
public class StatusBiz {
	
	@Resource
	private StatusMapper dao;
	
	/**
	 * 根据状态号查询维修
	 * @param statusid
	 * @return
	 */
	public Status selectByPrimaryKey(Integer statusid) {
		return dao.selectByPrimaryKey(statusid);
	}
	
	/**
	 * 张来遇写的根据状态类型查询不同的状态集合改了StatusMapper.xml文件
	 * @param type
	 * @return
	 */
	public List<Status> selectAllByType(String type){
		return dao.selectAllByType(type);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false, rollbackFor = {Exception.class })
	/**
	 * 新增状态
	 * @param Status
	 * @return
	 */
	public Integer insertSelective(Status Status) {
		return dao.insertSelective(Status);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false, rollbackFor = {Exception.class })
	/**
	 * 修改状态
	 * @param Status
	 * @return
	 */
	public Integer updateByPrimaryKeySelective(Status Status) {
		return dao.updateByPrimaryKeySelective(Status);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false, rollbackFor = {Exception.class })
	/**
	 * 删除状态
	 * @param statusid
	 * @return
	 */
	public Integer deleteByPrimaryKey(Integer statusid) {
		return dao.deleteByPrimaryKey(statusid);
	}
}
