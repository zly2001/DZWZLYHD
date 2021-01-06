package com.accp.dao;

import com.accp.entity.Wxxq;

public interface WxxqMapper {
    int deleteByPrimaryKey(Integer xqid);

    int insert(Wxxq record);

    int insertSelective(Wxxq record);

    Wxxq selectByPrimaryKey(Integer xqid);
       
    int updateByPrimaryKeySelective(Wxxq record);

    int updateByPrimaryKey(Wxxq record);
}