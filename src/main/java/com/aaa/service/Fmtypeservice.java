package com.aaa.service;

import com.aaa.dao.fmtypedao;
import com.aaa.entity.Fmtype;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Fmtypeservice {

    @Resource
    fmtypedao fmdao;

    /*
    根据id查询节目类型
     */
    public List<Fmtype> find_tid (int tid)
    {
        return fmdao.find_tid(tid);
    }

    /*
     *查询所有节目
     */
    public List<Fmtype> queryAllFMtype()
    {
        return fmdao.queryAllFMtype();
    }
    /*
     *增加节目类型
     */
    public int save_fmtype( Fmtype type )
    {
        return fmdao.save_fmtype(type);
    }

    /*
     *修改节目类型
     */


    public int update_fmtype(String type, int tid)
    {
        return fmdao.update_fmtype(type,tid);
    }

    /*
     *删除节目类型
     */

    public int delete_fmtype( int tid)
    {
        return fmdao.delete_fmtype(tid);
    }

}
