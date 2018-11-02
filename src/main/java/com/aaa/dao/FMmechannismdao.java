package com.aaa.dao;

import com.aaa.entity.FMmechannism;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FMmechannismdao {


    /*
    查询所有企业认证
     */
    @Select("select * from fmmechannism")
    public List<FMmechannism> queryFMmechannism();
}
