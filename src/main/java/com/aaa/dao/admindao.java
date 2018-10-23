package com.aaa.dao;

import com.aaa.entity.admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface admindao {
    /*
    *后台管理员登陆
    */
    @Select("select * from admin where aname=#{aname} and apassword=#{apassword} ")
    public List<admin> last_login(@Param("aname") String aname, @Param("apassword") String apassword);
}
