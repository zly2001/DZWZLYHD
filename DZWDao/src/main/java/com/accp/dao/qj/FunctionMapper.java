package com.accp.dao.qj;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.accp.entity.Function;

public interface FunctionMapper {
	
	@Select("select * from function")
	List<Function> queryAll();
	
}
