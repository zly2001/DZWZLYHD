package com.accp.biz.ljy;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.TeamMapper;
import com.accp.entity.Team;

@Service
/**
 * 事务管理元注解
 * @author 
 *
 */
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true, rollbackFor = {Exception.class })
public class TeamBiz {

	@Resource
	private TeamMapper dao;
	
	/**
	 * 根据班组id查询
	 * @param tid
	 * @return
	 */
	public Team selectByPrimaryKey(Integer tid) {
		return dao.selectByPrimaryKey(tid);
	}
	
	/**
	 * 张来遇写的用于查询所有班组以及班组下的技工(动了TeamMapper.xml文件)
	 * @return
	 */
	public List<Team> selectAll(){
		return dao.selectAll();
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false, rollbackFor = {Exception.class })
	/**
	 * 新增班组
	 * @param Team
	 * @return
	 */
	public Integer insertSelective(Team Team) {
		return dao.insertSelective(Team);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false, rollbackFor = {Exception.class })
	/**
	 * 修改班组
	 * @param Team
	 * @return
	 */
	public Integer updateByPrimaryKeySelective(Team Team) {
		return dao.updateByPrimaryKeySelective(Team);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false, rollbackFor = {Exception.class })
	/**
	 * 删除班组
	 * @param tid
	 * @return
	 */
	public Integer deleteByPrimaryKey(Integer tid) {
		return dao.deleteByPrimaryKey(tid);
	}
}
