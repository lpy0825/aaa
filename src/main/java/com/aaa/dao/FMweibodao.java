package com.aaa.dao;

import com.aaa.entity.FMweibo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FMweibodao {

    /*
    查询所有个人认证
     */
    @Select("select * from fmweibo")
    public List<FMweibo> queryAllweibo();
}
