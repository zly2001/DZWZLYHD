package com.accp.biz.nj;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.nj.NjClientCarMapper;
import com.accp.entity.Clientcar;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true, rollbackFor = {
		Exception.class })
public class ClientcarBiz {
	@Resource
	private NjClientCarMapper clientcar;

	/**
	 * 张来遇写的根据车牌号查询车辆信息
	 * 
	 * @param cno
	 * @return
	 */
	public Clientcar selectClientcarByCno(String cno) {
		return clientcar.selectClientcarByCno(cno);
	}

	/**
	 * 根据用户id查询用户名下所属的车辆
	 */
	public List<Clientcar> selectclientcar(String clientno) {
		return clientcar.selectByPrimaryKey(clientno);
	}

	/**
	 * 根据用户id新增用户名下所属的车辆
	 */
	public int insert(Clientcar record) {
		return clientcar.insert(record);
	}

	/**
	 * 根据用户id修改用户名下的所属的车辆
	 */
	public int updateClientcar(Clientcar record) {
		return clientcar.updateByPrimaryKeySelective(record);
	}

	/**
	 * 查询所有用户车的类型
	 * 
	 * @return
	 */
	public List<Clientcar> queryAllClientcar() {
		return clientcar.queryAllClientCarMessage();
	}

	/**
	 * 根据用户删除用户所属下的车辆
	 */
	public int deleteClientcar(String cno) {
		return clientcar.deleteByPrimaryKey(cno);
	}

}
