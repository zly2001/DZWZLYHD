package com.accp.action.qj;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.qj.AuthorityBiz;
import com.accp.entity.Authority;


@RestController
@RequestMapping("/qj/api/QjAuthorityAction")
public class QjAuthorityAction {
	
	@Autowired
	private AuthorityBiz abiz;
	
	@GetMapping("query/{positionid}")
	public List<Authority> queryAll(@PathVariable Integer positionid){
		//System.out.println(positionid);
		return abiz.queryAll(positionid);
	}
	
	@PostMapping("insert/{positionid}")
	public Map<String, String> addAuthorityInfo(@RequestBody Authority authority) {
		Map<String, String> message = new HashMap<String, String>();
		abiz.insert(authority);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	@PutMapping("delete/{positionid}")
	public Map<String, String> deleteEmployeeInfo(@PathVariable Integer positionid) {
		Map<String, String> message = new HashMap<String, String>();
		abiz.deleteAuthority(positionid);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
}
