package com.accp.dao;

import com.accp.entity.Fangong;

public interface FangongMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(Fangong record);

    int insertSelective(Fangong record);

    Fangong selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(Fangong record);

    int updateByPrimaryKey(Fangong record);
}