package com.accp.dao;

import com.accp.entity.Artisan;
import com.accp.entity.ArtisanKey;

public interface ArtisanMapper {
    int deleteByPrimaryKey(ArtisanKey key);

    int insert(Artisan record);

    int insertSelective(Artisan record);

    Artisan selectByPrimaryKey(ArtisanKey key);

    int updateByPrimaryKeySelective(Artisan record);

    int updateByPrimaryKey(Artisan record);
}