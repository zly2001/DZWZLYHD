package com.accp.dao.lp;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.entity.Brand;
import com.accp.entity.Firm;
import com.accp.entity.Goodstype;

public interface Engine {
	
	@Select("SELECT * FROM `Goodstype` WHERE `goodid` like '%${bh}%' AND `goodname` like '%${name}%'")
	List<Goodstype> SelectAll(@Param ("bh") String bh,@Param ("name") String name);
	
	int removeEngine(@Param ("bh") String bh);
	
	int updateEngine(@Param ("bh") String bh,@Param ("name") String name);
	
	int addEngine(@Param ("g") Goodstype g);
	
	@Select("SELECT * FROM Brand")
	List<Brand> SelectAll5();
	
	
	@Select("SELECT * FROM firm")
	List<Firm> SelectAll6();
}
