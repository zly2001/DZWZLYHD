package com.accp.dao.lp;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.entity.Goodstype;

public interface Engine {
	
	@Select("SELECT * FROM `Goodstype` WHERE `goodid`=#{bh} AND `goodname`=#{name}")
	List<Goodstype> SelectAll(@Param ("bh") String bh,@Param ("name") String name);
}
