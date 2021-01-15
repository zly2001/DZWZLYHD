package com.accp.dao.lp;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.entity.Brand;
import com.accp.entity.Goodstype;

public interface Motorcycle {
	
	@Select("SELECT * FROM `brand` WHERE `Brandname` like '%${name}%'")
	List<Brand> SelectAll(@Param ("name") String name);
	
	int removeMotorcycle(@Param ("bh") String bh);
	
	int updateMotorcycle(@Param ("bh") String bh,@Param ("name") String name,@Param ("zm") String zm);
	
	int addMotorcycle(@Param ("b") Brand b);
}
