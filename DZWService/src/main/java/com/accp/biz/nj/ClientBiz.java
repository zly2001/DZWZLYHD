package com.accp.biz.nj;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.ClientMapper;
import com.accp.dao.ClientcarMapper;
import com.accp.dao.nj.NJClientMapper;
import com.accp.entity.Client;

@Service
/**
 * 事务管理元注解
 * @author 28225
 *
 */
public class ClientBiz {
	@Resource
	private NJClientMapper client;
	/**
	 * 查询所有用户信息
	 * @return
	 */
	public List<Client> queryAllClientMessage() {
		return client.queryAllClientMessage();
	}
	/**
	 * 依据主键查询特定用户信息
	 */
	public Client selectClient(String clientno) {
		return client.selectByPrimaryKey(clientno);
	}
	
	/**
	 * 新增用户信息
	 */
	public int insert(Client record) {
		return client.insert(record);
	}
	
	/**
	 * 修改用户信息
	 */
	public int updateClient(Client record) {
		return client.updateByPrimaryKey(record);
	}
	
	/**
	 * 删除用户信息
	 */
	public int deleteClient(String clientno) {
		return client.deleteByPrimaryKey(clientno);
	}

}
