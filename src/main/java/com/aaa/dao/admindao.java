package com.aaa.dao;

import com.aaa.entity.admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface admindao {
    /*
    *后台管理员登陆
    */
    @Select("select * from admin where aname=#{aname} and apassword=#{apassword} ")
    public List<admin> last_login(@Param("aname") String aname, @Param("apassword") String apassword);

    /**
     * 查询所有管理员
     */
    @Select("select * from admin")
    public List<admin> queryadmin();

    /**
     * 修改管理员信息
     */
    @Update("update admin set aname=#{aname},apassword=#{apassword},image=#{image},email=#{email},motto=#{motto},realname=#{realname} where aid=#{aid} ")
    public int update_admin(@Param("aname")String aname,@Param("apassword")String apassword,@Param("image") String image,@Param("email") String email,@Param("motto") String motto,@Param("realname") String realname,@Param("aid") Integer aid);
}
