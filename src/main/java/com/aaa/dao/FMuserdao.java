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




}
