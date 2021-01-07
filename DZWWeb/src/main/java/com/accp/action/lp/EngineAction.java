package com.accp.action.lp;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.lp.EngineBiz;
import com.accp.biz.qj.QjEmployeeBiz;
import com.accp.dao.lp.Engine;
import com.accp.entity.Employee;
import com.accp.entity.Goodstype;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/lp/api/Engine")
public class EngineAction {
	
	@Resource
	private EngineBiz biz;
	
	@GetMapping("selectAll/{p}/{bh}/{name}")
	public PageInfo<Goodstype> SelectAll(@PathVariable Integer p,@PathVariable String bh,@PathVariable String name){
		return biz.SelectAll(p, bh, name);
	}

}
