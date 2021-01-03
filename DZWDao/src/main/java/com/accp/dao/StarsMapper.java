package com.accp.dao;

import com.accp.entity.Stars;

public interface StarsMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Stars record);

    int insertSelective(Stars record);

    Stars selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Stars record);

    int updateByPrimaryKey(Stars record);
}