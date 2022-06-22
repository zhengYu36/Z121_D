package com.zy.mapper;

import com.zy.entity.FeeBase;

public interface FeeBaseMapper {
    //测试数据相关信息333
    int deleteByPrimaryKey(String id);

    int insert(FeeBase record);

    int insertSelective(FeeBase record);

    FeeBase selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(FeeBase record);

    int updateByPrimaryKey(FeeBase record);
}