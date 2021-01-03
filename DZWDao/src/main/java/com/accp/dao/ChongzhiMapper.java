package com.accp.dao;

import com.accp.entity.Chongzhi;

public interface ChongzhiMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Chongzhi record);

    int insertSelective(Chongzhi record);

    Chongzhi selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Chongzhi record);

    int updateByPrimaryKey(Chongzhi record);
}