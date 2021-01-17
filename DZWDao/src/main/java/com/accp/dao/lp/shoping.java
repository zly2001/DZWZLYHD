package com.accp.dao.lp;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.entity.Shop;

public interface shoping {
	
	@Select("select * from shop where shopname like '%${name}%'")
	List<Shop> selectAll(@Param ("name") String name);
	
	 int insert(Shop record);
}
