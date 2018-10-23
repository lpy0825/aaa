package com.aaa.dao;

import com.aaa.entity.Fmtype;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface fmtypedao {

    /*
    *按id查询节目类型
    */
    @Select("select * from fmtype where tid=#{tid}")
    public List<Fmtype> find_tid(@Param("tid") int tid);

   /*
   *查询所有节目
    */
   @Select("select * from fmtype")
    public List<Fmtype> queryAllFMtype();
    /*
     *增加节目类型
     */
    @Insert("insert into fmtype(type) values(#{t.type})")
    public int save_fmtype(@Param("t") Fmtype type);

    /*
     *修改节目类型
     */

    @Update("update fmtype set type=#{type} where tid=#{tid}")
    public int update_fmtype(@Param("type")String type,@Param("tid") int tid);

    /*
     *删除节目类型
     */
    @Delete("delete from fmtype where tid=#{tid}")
    public int delete_fmtype(@Param("tid") int tid);
}
