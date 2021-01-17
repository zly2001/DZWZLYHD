package com.accp.dao.ljy;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.entity.Artisan;

public interface jgbanzu {
	
	/**
	 * 技工班组
	 * */
	List<Artisan> jgbzselect(String  tid);
	
	int deleteArtisan(@Param("tid") String tid);
		
	int insertSelective(Artisan artisan);
	
	int updateByPrimaryKeySelective(Artisan artisan);
}
