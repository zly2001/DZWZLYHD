package com.accp.biz.zly;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.FangongMapper;
import com.accp.dao.WugongtypeMapper;
import com.accp.entity.Fangong;
import com.accp.entity.Wugongtype;

@Service
/**
 * 事务管理元注解
 * 
 * @author
 *
 */
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true, rollbackFor = {
		Exception.class })
public class FangongBiz {

	@Resource
	private FangongMapper dao;
	
	@Resource
	private WugongtypeMapper  Wugongtypedao;

	/**
	 * 根据返工记录号查询维修
	 * 
	 * @param fid
	 * @return
	 */
	public Fangong selectByPrimaryKey(Integer fid) {
		return dao.selectByPrimaryKey(fid);
	}

	/**
	 * 张来遇写的查询所有返工记录表
	 * @return
	 */
	public List<Fangong> selectByAllByFangong(){
		return dao.selectByAllByFangong();
	}
	
	/**
	 * 张来遇写的查询所有返工类型
	 * @return
	 */
	public List<Wugongtype> selectAllByWugongtype(){
		return Wugongtypedao.selectAllByWugongtype();
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false, rollbackFor = {
			Exception.class })
	/**
	 * 新增返工记录
	 * 
	 * @param Fangong
	 * @return
	 */
	public Integer insertSelective(Fangong Fangong) {
		return dao.insertSelective(Fangong);
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false, rollbackFor = {
			Exception.class })
	/**
	 * 修改返工记录
	 * 
	 * @param Fangong
	 * @return
	 */
	public Integer updateByPrimaryKeySelective(Fangong Fangong) {
		return dao.updateByPrimaryKeySelective(Fangong);
	}

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false, rollbackFor = {
			Exception.class })
	/**
	 * 删除返工记录
	 * 
	 * @param fid
	 * @return
	 */
	public Integer deleteByPrimaryKey(Integer fid) {
		return dao.deleteByPrimaryKey(fid);
	}
}
