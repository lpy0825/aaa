package com.aaa.dao;

import com.aaa.entity.Fmcontenttype;
import org.apache.ibatis.annotations.*;

import java.util.List;
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

    /**
     * 添加专辑类型
     */
    @Insert("insert into fmcontenttype(contenttype,typeid) values(#{c.contenttype},#{c.typeid})")
    public int save_fmcontenttype(@Param("c")Fmcontenttype content);


    /**
     * 修改专辑类型
     */
    @Update("update set fmcontenttype ")
    public int update_fmcontenttype(@Param("contenttype")String contenttype,@Param("typeid") int typeid);


    /*
    * 删除专辑类型
     */
    @Delete("delete from fmcontenttype where tid=#{tid}")
    public int delete_fmcontenttype(@Param("tid")Integer tid);
}
