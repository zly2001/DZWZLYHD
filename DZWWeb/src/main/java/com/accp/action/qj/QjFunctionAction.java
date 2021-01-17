package com.accp.action.qj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.qj.FunctionBiz;
import com.accp.entity.Function;

@RestController
@RequestMapping("/qj/api/QjFunctionAction")
public class QjFunctionAction {
	
	@Autowired
	private FunctionBiz biz;
	
	@GetMapping()
	public List<Function> queryAll(){
		return biz.queryAll();
	}
}
