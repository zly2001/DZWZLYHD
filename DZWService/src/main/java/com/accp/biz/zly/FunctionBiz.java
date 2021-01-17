package com.accp.biz.zly;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.AuthorityMapper;
import com.accp.dao.FunctionMapper;
import com.accp.entity.Authority;
import com.accp.entity.Function;

@Service
/**
 * 事务管理元注解
 * 
 * @author
 *
 */
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true, rollbackFor = {
		Exception.class })
public class FunctionBiz {

	@Resource
	private AuthorityMapper Authoritydao;

	@Resource
	private FunctionMapper Functiondao;

	public List<Function> selectAllByFunction() {
		return Functiondao.selectAllByFunction();
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false, rollbackFor = {
			Exception.class })
	public Integer insertSelective(Authority record) {
		return Authoritydao.insertSelective(record);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false, rollbackFor = {
			Exception.class })
	public Integer deleteByPositionid(Integer positionid) {
		return Authoritydao.deleteByPositionid(positionid);
	}
}
