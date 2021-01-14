package com.accp.biz.lp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.lp.Engine;
import com.accp.entity.Goodstype;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
/**
 * 事务管理元注解
 * @author Administrator
 *
 */
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true, rollbackFor = {Exception.class })
public class lp {
	@Resource
	private Engine dao;
	
	private PageInfo<Goodstype> SelectAll(Integer p,String bh,String name){
		PageHelper.startPage(p, 5);
		return new PageInfo<Goodstype>(dao.SelectAll(bh, name));
	}


	
	
}
