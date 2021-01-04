package com.accp.biz.qj;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.PositionMapper;
import com.accp.entity.Position;

@Service
/**
 * 事务管理元注解
 * @author Administrator
 *
 */
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true, rollbackFor = {Exception.class })
public class PositionBiz {
	
	@Resource
	private PositionMapper pma;
	
	/**
	 * 查询所有部门
	 * @return
	 */
	public Position selectAll() {
		return pma.selectAll();
	}
	
	/**
	 * 新增部门
	 * @param record
	 * @return
	 */
	public int insertPosition(Position record) {
		return pma.insertSelective(record);
	}
	
	/**
	 * 修改部门
	 * @param record
	 * @return
	 */
	public int updatePosition(Position record) {
		return pma.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 删除部门
	 * @param positionid
	 * @return
	 */
	public int deletePosition(Integer positionid) {
		return pma.deleteByPrimaryKey(positionid);
	}
}
