package com.accp.action.ljy;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.ljy.banzuBiz;
import com.accp.entity.Team;

@RestController
@RequestMapping("/ljy/api/banzuAction")
public class BanzuAction {
	@Resource
	private banzuBiz biz;
	
	@GetMapping("select")
	public List<Team> banzuselect(){
		return biz.banzuselct();
	}

}
