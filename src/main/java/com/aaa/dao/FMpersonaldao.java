package com.aaa.dao;

import com.aaa.entity.FMpersonal;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface FMpersonaldao {

    /*
    查询所有个人认证
     */
    @Select("SELECT\n" +
            "fmpersonal.pid,\n" +
            "fmpersonal.`name`,\n" +
            "fmpersonal.eid,\n" +
            "fmpersonal.eimage,\n" +
            "fmuser.Fmuname,\n" +
            "fmauthentication.Authentication\n" +
            "FROM\n" +
            "fmpersonal\n" +
            "INNER JOIN fmuser ON fmpersonal.Fmuid = fmuser.Fmuid\n" +
            "INNER JOIN fmauthentication ON fmpersonal.Fmaid = fmauthentication.aid\n" +
            "\n")
    public List<Map<String,Object>> queryFMpersonal();


    /*
    按ID查询
     */
    @Select("SELECT\n" +
            "fmpersonal.pid,\n" +
            "fmpersonal.`name`,\n" +
            "fmpersonal.eid,\n" +
            "fmpersonal.eimage,\n" +
            "fmuser.Fmuname,\n" +
            "fmuser.Fmuid,\n" +
            "fmauthentication.Authentication\n" +
            "FROM\n" +
            "fmpersonal\n" +
            "INNER JOIN fmuser ON fmpersonal.Fmuid = fmuser.Fmuid\n" +
            "INNER JOIN fmauthentication ON fmpersonal.Fmaid = fmauthentication.aid where pid=#{pid}\n" +
            "\n")
    public List<Map<String,Object>> queryPid(@Param("pid") Integer pid);


    /*
    查询所有未审核
     */
    @Select("SELECT\n" +
            "fmpersonal.pid,\n" +
            "fmpersonal.`name`,\n" +
            "fmpersonal.eid,\n" +
            "fmpersonal.eimage,\n" +
            "fmauthentication.Authentication,\n" +
            "fmuser.Fmuname,\n" +
            "fmuser.shenhe\n" +
            "FROM\n" +
            "fmpersonal\n" +
            "INNER JOIN fmauthentication ON fmpersonal.Fmaid = fmauthentication.aid\n" +
            "INNER JOIN fmuser ON fmpersonal.Fmuid = fmuser.Fmuid where shenhe=0\n")
    public List<Map<String,Object>> queryFMpersonalsh();
}
