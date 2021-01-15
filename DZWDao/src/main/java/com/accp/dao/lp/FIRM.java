package com.accp.dao.lp;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.entity.Firm;
import com.accp.entity.Items;
import com.accp.entity.lp.ItemsVO;

public interface FIRM {
	
	
	@Select("select * from firm WHERE firmname  like '%${bh}%' ")
	List<Firm> SelectAll(@Param ("bh") String bh);
	
	int insertSelective(Firm record);
	
	int updateByPrimaryKeySelective(Firm record);
	
	int deleteByPrimaryKey(Integer firmid);
	
	
	List<ItemsVO> selectAll2(@Param ("bh") String bh);
}
