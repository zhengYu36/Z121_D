package com.zy.mapper;

import com.zy.entity.FeeBase;

public interface FeeBaseMapper {
    int deleteByPrimaryKey(String id);

    int insert(FeeBase record);

    int insertSelective(FeeBase record);

    FeeBase selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(FeeBase record);

    int updateByPrimaryKey(FeeBase record);
}