package com.aaa.dao;

import com.aaa.entity.FMmechannism;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface FMmechannismdao {


    /*
    查询所有企业认证
     */
    @Select("SELECT\n" +
            "fmmechannism.mid,\n" +
            "fmmechannism.mname,\n" +
            "fmmechannism.maddrs,\n" +
            "fmmechannism.mimage,\n" +
            "fmmechannism.eid,\n" +
            "fmmechannism.ename,\n" +
            "fmmechannism.eimage,\n" +
            "fmuser.Fmuname,\n" +
            "fmauthentication.Authentication\n" +
            "FROM\n" +
            "fmmechannism\n" +
            "INNER JOIN fmuser ON fmmechannism.Fmuid = fmuser.Fmuid\n" +
            "INNER JOIN fmauthentication ON fmmechannism.Fmaid = fmauthentication.aid")
    public List<Map<String,Object>> queryFMmechannism();

    /*
    按ID查询企业认证
     */

    @Select("SELECT\n" +
            "fmmechannism.mid,\n" +
            "fmmechannism.mname,\n" +
            "fmmechannism.maddrs,\n" +
            "fmmechannism.mimage,\n" +
            "fmmechannism.eid,\n" +
            "fmmechannism.ename,\n" +
            "fmmechannism.eimage,\n" +
            "fmuser.Fmuname,\n" +
            "fmuser.Fmuid,\n" +
            "fmauthentication.Authentication\n" +
            "FROM\n" +
            "fmmechannism\n" +
            "INNER JOIN fmuser ON fmmechannism.Fmuid = fmuser.Fmuid\n" +
            "INNER JOIN fmauthentication ON fmmechannism.Fmaid = fmauthentication.aid where mid=#{mid}")
    public List<Map<String,Object>> queryMid(@Param("mid") Integer mid);


    /*
    查询所有未审核
     */
    @Select("SELECT\n" +
            "fmmechannism.mid,\n" +
            "fmmechannism.mname,\n" +
            "fmmechannism.maddrs,\n" +
            "fmmechannism.mimage,\n" +
            "fmmechannism.eid,\n" +
            "fmmechannism.ename,\n" +
            "fmmechannism.eimage,\n" +
            "fmuser.Fmuname,\n" +
            "fmauthentication.Authentication,\n" +
            "fmuser.shenhe\n" +
            "FROM\n" +
            "fmmechannism\n" +
            "INNER JOIN fmuser ON fmmechannism.Fmuid = fmuser.Fmuid\n" +
            "INNER JOIN fmauthentication ON fmmechannism.Fmaid = fmauthentication.aid where shenhe=0")
    public List<Map<String,Object>> queryFMmechannismshenhe();


}
