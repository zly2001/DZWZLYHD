package com.accp.dao.nj;

import java.util.List;

import com.accp.entity.Client;

public interface NJClientMapper {
	/**
	 * 依据主键删除用户
	 * 
	 * @param clientno
	 * @return
	 */
	int deleteByPrimaryKey(String clientno);

	/**
	 * 新增用户
	 * 
	 * @param record
	 * @return
	 */
	int insert(Client record);

	/**
	 * 新增用户
	 * 
	 * @param record
	 * @return
	 */
	int insertSelective(Client record);

	/**
	 * 新增用户
	 * 
	 * @param clientno
	 * @return
	 */
	Client selectByPrimaryKey(String clientno);

	/**
	 * 根据主键更新用户
	 * 
	 * @param record
	 * @return
	 */
	int updateByPrimaryKeySelective(Client record);

	/**
	 * 根据主键更新用户
	 * 
	 * @param record
	 * @return
	 */
	int updateByPrimaryKeyWithBLOBs(Client record);

	/**
	 * 根据主键更新用户
	 * 
	 * @param record
	 * @return
	 */
	int updateByPrimaryKey(Client record);

	List<Client> queryAllClientMessage();
}
