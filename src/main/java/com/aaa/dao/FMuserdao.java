package com.aaa.dao;

import com.aaa.entity.FMuser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface FMuserdao {

    /**
     * 查询所有用户
     */
    @Select("select * from fmuser ")
    public List<FMuser> queryfmuser();


    /**
     * 修改用户状态
     */
    @Update("update fmuser set BP=#{bp} where Fmuid=#{fmuid} ")
    public int update_fmuser(@Param("fmuid") int fmuid,@Param("bp")int BP);


    /*
    修改审核状态
     */
    @Update("update fmuser set shenhe=#{shenhe},Fmanchor=#{fmanchor} where Fmuid=#{fmuid}")
    public int update_shenhe(@Param("fmuid") int fmuid,@Param("shenhe") int shenhe,@Param("fmanchor") int fmanchor);



    /*
    按照id查询用户
     */
    @Select("select * from fmuser where fmuid=#{fmuid}")
    public List<FMuser> queryfmuser_id(@Param("fmuid") Integer fmuid);


    /*
    查询信誉度低于100的
     */
    @Select("select * from fmuser where Fmcredibilty<100")
    public List<FMuser> query_Fmcredibilty();
}
