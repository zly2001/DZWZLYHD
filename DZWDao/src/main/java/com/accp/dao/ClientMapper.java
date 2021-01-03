package com.accp.dao;

import com.accp.entity.Client;

public interface ClientMapper {
    int deleteByPrimaryKey(String clientno);

    int insert(Client record);

    int insertSelective(Client record);

    Client selectByPrimaryKey(String clientno);

    int updateByPrimaryKeySelective(Client record);

    int updateByPrimaryKeyWithBLOBs(Client record);

    int updateByPrimaryKey(Client record);
}