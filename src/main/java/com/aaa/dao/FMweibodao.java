package com.aaa.dao;

import com.aaa.entity.FMweibo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface FMweibodao {

    /*
    查询所有个人认证
     */
  /*  @Select("select * from fmweibo")
    public List<FMweibo> queryAllweibo();*/

    @Select("SELECT\n" +
            "fmweibo.wid,\n" +
            "fmweibo.wname,\n" +
            "fmweibo.wfollower,\n" +
            "fmweibo.wauth,\n" +
            "fmweibo.eid,\n" +
            "fmweibo.eimage,\n" +
            "fmuser.Fmuname,\n" +
            "fmauthentication.Authentication,\n" +
            "fmweibo.ename\n" +
            "FROM\n" +
            "fmweibo\n" +
            "INNER JOIN fmuser ON fmweibo.Fmuid = fmuser.Fmuid\n" +
            "INNER JOIN fmauthentication ON fmweibo.Fmaid = fmauthentication.aid")
    public List<Map<String,Object>> queryAllweibo();


    /**
     * 按照ID查询微博认证用户
     * @param wid
     * @return
     */
    @Select("SELECT\n" +
            "fmweibo.wid,\n" +
            "fmweibo.wname,\n" +
            "fmweibo.wfollower,\n" +
            "fmweibo.wauth,\n" +
            "fmweibo.eid,\n" +
            "fmweibo.eimage,\n" +
            "fmuser.Fmuname,\n" +
            "fmuser.Fmuid,\n" +
            "fmauthentication.Authentication,\n" +
            "fmweibo.ename\n" +
            "FROM\n" +
            "fmweibo\n" +
            "INNER JOIN fmuser ON fmweibo.Fmuid = fmuser.Fmuid\n" +
            "INNER JOIN fmauthentication ON fmweibo.Fmaid = fmauthentication.aid where wid=#{wid}")
    public List<Map<String,Object>> querywid(@Param("wid") Integer wid);


    /*
    查询未审核
     */
    @Select("SELECT\n" +
            "fmweibo.wid,\n" +
            "fmweibo.wname,\n" +
            "fmweibo.wfollower,\n" +
            "fmweibo.wauth,\n" +
            "fmweibo.eid,\n" +
            "fmweibo.eimage,\n" +
            "fmweibo.ename,\n" +
            "fmuser.Fmuname,\n" +
            "fmauthentication.Authentication,\n" +
            "fmuser.shenhe\n" +
            "FROM\n" +
            "fmweibo\n" +
            "INNER JOIN fmuser ON fmweibo.Fmuid = fmuser.Fmuid\n" +
            "INNER JOIN fmauthentication ON fmweibo.Fmaid = fmauthentication.aid where shenhe =0")
    public List<Map<String,Object>> queryAllweibosh();
}
