package com.accp.biz.ljy;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.ljy.waiqin;
import com.accp.entity.Workcar;

@Service
/**
 * 事务管理元注解
 * @author Administrator
 *
 */
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true, rollbackFor = {Exception.class })
public class waiqinBiz {
	/**
	 * 第三步
	 * */
	@Resource
	private waiqin dao;
	
	public List<Workcar> select(){
		return dao.select();
	}
	
	public int delete(String wid){
		return dao.delete(wid);
	}
	
	public int insertSelective(Workcar workcar) {
		return dao.insertSelective(workcar);
	}
	public int update(Workcar workcar) {
		return dao.updateByPrimaryKeySelective(workcar);
	}
	
}
