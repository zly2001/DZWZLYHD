package com.accp.action.qj;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.qj.PositionBiz;
import com.accp.entity.Position;

@RestController
@RequestMapping("/qj/api/QjPositionAction")
public class QjPositionAction {
	
	@Autowired
	private PositionBiz pbiz;
	
	/**
	 * 查所有岗位信息
	 * @return
	 */
	@GetMapping
	//fdzx
	public List<Position> queryPosition(){
		return pbiz.selectAll();
	}
	
	/**
	 * 新增岗位信息
	 * @param position
	 * @return
	 */
	@PostMapping
	public Map<String, String> addPositionInfo(@RequestBody Position position) {
		Map<String, String> message = new HashMap<String, String>();
		pbiz.insertPosition(position);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	/**
	 * 删除岗位信息
	 * @param positionid
	 * @return
	 */
	@DeleteMapping("position/{positionid}")
	public Map<String, String> delPositionInfo(@PathVariable Integer positionid) {
		Map<String, String> message = new HashMap<String, String>();
		pbiz.deletePosition(positionid);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	/**
	 * 修改岗位信息
	 * @param position
	 * @return
	 */
	@PutMapping("position")
	public Map<String, String> updatePositionInfo(@RequestBody Position position) {
		Map<String, String> message = new HashMap<String, String>();
		pbiz.updatePosition(position);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
}
