package com.accp.dao;

import com.accp.entity.Department;

public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer deid);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer deid);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}