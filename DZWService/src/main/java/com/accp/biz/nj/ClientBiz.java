package com.accp.biz.nj;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.ClientMapper;
import com.accp.dao.ClientcarMapper;
import com.accp.entity.Client;

@Service
/**
 * 事务管理元注解
 * @author 28225
 *
 */
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true, rollbackFor = {Exception.class })
public class ClientBiz {
	@Resource
	private ClientMapper client;
	
	public List<Client> queryAllClientMessage() {
		return client.queryAllClientMessage();
	}

}
