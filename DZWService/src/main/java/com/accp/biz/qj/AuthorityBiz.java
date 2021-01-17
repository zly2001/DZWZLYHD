package com.accp.biz.qj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.qj.AuthorityMapper;
import com.accp.entity.Authority;

@Service
/**
 * 事务管理元注解
 * @author Administrator
 *
 */
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true, rollbackFor = {Exception.class })
public class AuthorityBiz {
	
	@Autowired
	private AuthorityMapper ama;
	
	/**
	 * 新增角色权限
	 * @param authority
	 * @return
	 */
	public int insertAuthority(Authority authority) {
		return ama.insertSelective(authority);
	}
	
	public int insert(Authority authority) {
		return ama.insert(authority);
	}
	
	/**
	 * 删除角色拥有权限
	 * @param positionid
	 * @return
	 */
	public int deleteAuthority(Integer positionid) {
		return ama.deleteByPid(positionid);
	}
	
	/**
	 * 查当前岗所有权限
	 * @return
	 */
	public List<Authority> queryAll(Integer positionid){
		return ama.queryAll(positionid);
	}
}
