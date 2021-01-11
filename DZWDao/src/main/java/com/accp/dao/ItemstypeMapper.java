package com.accp.dao;

import java.util.List;

import com.accp.entity.Itemstype;

public interface ItemstypeMapper {
    int deleteByPrimaryKey(Integer itemstypeid);

    int insert(Itemstype record);

    int insertSelective(Itemstype record);

    Itemstype selectByPrimaryKey(Integer itemstypeid);
    
    //张来遇写的用于查询所有维修项目类型以及类型下的维修项目(动了ItemstypeMapper.xml文件)
    List<Itemstype> selectAll();

    int updateByPrimaryKeySelective(Itemstype record);

    int updateByPrimaryKey(Itemstype record);
}