package com.aaa.dao;

import com.aaa.entity.Fmcontenttype;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface fmcontenttypedao {
    /**
     * 按照ID查询专辑类型
     */
    @Select("select * from fmcontenttype where tid=#{tid}")
    public List<Fmcontenttype> queryByid(@Param("tid") Integer tid);


    /**
     * 查询所有专辑类型
     */
    @Select("select * from fmcontenttype")
    public List<Fmcontenttype> queryAllFmcontent();

    /*查询专辑下面的节目*/
    @Select("select fmcontenttype.tid,fmcontenttype.contenttype,fmtype.type from fmtype,fmcontenttype  where fmcontenttype.typeid =fmtype.tid and fmcontenttype.tid=#{param1}")
    public List<Map<String,Object>> queryType(Integer tid );

    /**
     * 添加专辑类型
     */
    @Insert("insert into fmcontenttype(contenttype,typeid) values(#{c.contenttype},#{c.typeid})")
    public int save_fmcontenttype(@Param("c")Fmcontenttype content);


    /**
     * 修改专辑类型
     */
    @Update("update  fmcontenttype set contenttype=#{contenttype},typeid=#{typeid} where tid=#{tid} ")
    public int update_fmcontenttype(@Param("contenttype")String contenttype,@Param("typeid") Integer typeid,@Param("tid")Integer tid);

    /*
    * 删除专辑类型
     */
    @Delete("delete from fmcontenttype where tid=#{tid}")
    public int delete_fmcontenttype(@Param("tid")Integer tid);

    /*
    查询专辑下的节目
     */
    @Select("select c.tid,c.contenttype,t.type from fmtype t,fmcontenttype c where c.typeid = t.tid")
    public List<Map<String,Object>> queryctype();


}