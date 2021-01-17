package com.accp.biz.ljy;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.ljy.jigong;
import com.accp.entity.Stars;

@Service
/**
 * 事务管理元注解
 * @author Administrator
 *
 */
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true, rollbackFor = {Exception.class })
public class ljyBiz {
	//第三步
	@Resource
	private jigong dao;
	//查询
	public List<Stars> LjySelectAll(){
		return dao.LjySelectAll();
	}
	
	//删除
	public int deleteStars(String sid) {
		return dao.deleteStars(sid);
	}
	//新增
	public int insertJiGong(Stars stars) {
		return dao.insert(stars);
	}
	//修改
	public int updateJiGong(Stars stars) {
		return dao.updateByPrimaryKeySelective(stars);
	}
	
	//模糊查询
	public List<Stars> mhcxselect(String sid){
		return dao.mhcxselect(sid);
	}
	
}
