package com.aaa.dao;

import com.aaa.entity.FMpersonal;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FMpersonaldao {

    /*
    查询所有个人认证
     */
    @Select("select * from fmpersonal")
    public List<FMpersonal> queryFMpersonal();
}
