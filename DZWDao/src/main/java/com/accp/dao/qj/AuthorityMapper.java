package com.accp.dao.qj;


import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.entity.Authority;


public interface AuthorityMapper {
	
	int insertSelective(@Param("authority")Authority authority);
	
	@Delete("delete  from authority where positionid = #{positionid}")
	int deleteByPid(@Param("positionid")Integer positionid);
	
	@Insert("insert into authority values(0,#{authority.positionid},#{authority.functionId})")
	int insert(@Param("authority")Authority authority);
	
	@Select("select * from authority where positionid = #{positionid}")
	List<Authority> queryAll(@Param("positionid")Integer positionid);
	
	
}
