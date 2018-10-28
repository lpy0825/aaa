package com.aaa.service;

import com.aaa.dao.fmcontenttypedao;
import com.aaa.entity.Fmcontenttype;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class Fmcontenttypeservice {

    @Resource
    fmcontenttypedao fmcontdao;

    /**
     * 按照ID查询专辑类型
     */
    public List<Fmcontenttype> queryByid(Integer tid)
    {
        return fmcontdao.queryByid(tid);
    }

    /**
     * 查询所有专辑类型
     */
    public List<Fmcontenttype> queryAllFmcontent()
    {
        return fmcontdao.queryAllFmcontent();
    }

    /**
     * 添加专辑
     */
    public int save_fmcontenttype(Fmcontenttype content)
    {
        return fmcontdao.save_fmcontenttype(content);
    }

    /**
     * 修改专辑类型
     */
    public int update_fmcontenttype(String contenttype,Integer typeid,Integer tid )
    {
        return  fmcontdao.update_fmcontenttype(contenttype,typeid,tid);
    }

    /**
     * 删除专辑类型
     */
    public int delete_fmcontenttype(Integer tid)
    {
        return fmcontdao.delete_fmcontenttype(tid);
    }

    public List<Map<String,Object>> queryType(Integer tid)
    {
        return fmcontdao.queryType(tid);
    }
}
