package com.accp.dao.ljy;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.entity.Workcar;

public interface waiqin {
	/**
	 * 查询
	 * */
	List<Workcar> select();
	/**
	 * 删除
	 * */
	int delete(@Param("wid") String wid);
	/**
	 * 新增
	 * */
	int insertSelective(Workcar workcar);
	/**
	 * 修改
	 * */
	int updateByPrimaryKeySelective(Workcar workcar);
	
	
}
