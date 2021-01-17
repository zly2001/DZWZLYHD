package com.accp.dao.ljy;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.entity.Stars;

public interface jigong {
	//第一步
	//查询
	List<Stars> LjySelectAll();
	
	//删除
	int deleteStars(@Param("sid") String sid);
	
	//新增技工信息
	int insert(Stars stars);
	//修改技工信息
	int updateByPrimaryKeySelective(Stars stars);
	
	//模糊查询
	
	List<Stars> mhcxselect(String sid);
}
