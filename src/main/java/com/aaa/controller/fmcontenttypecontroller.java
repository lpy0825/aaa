package com.aaa.controller;

import com.aaa.entity.Fmcontenttype;
import com.aaa.entity.Fmtype;
import com.aaa.service.Fmcontenttypeservice;
import com.aaa.service.Fmtypeservice;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("fmcontent")
public class fmcontenttypecontroller {

    @Resource
    Fmcontenttypeservice fmcontservice;

    @Resource
    Fmtypeservice fmtypeservice;
    /*
    *根据ID查询专辑
     */
    @RequestMapping("queryByid")
    public String queryByid(Integer tid, Model model)
    {
        List<Fmcontenttype> list=fmcontservice.queryByid(tid);
        model.addAttribute("conttypelist",list);
            return "edit_fmcontenttype";
    }

    /**
     *查询全部专辑类型
     */
    @RequestMapping("queryAllFmcontent")
    public  String queryAllFmcontent(Model model)
    {
        List<Fmcontenttype> list=fmcontservice.queryAllFmcontent();
        int count=list.size();
        model.addAttribute("count1",count);
        model.addAttribute("conttypelist",list);
            return "cate2";
    }

    /*
     *添加专辑
     */
    @RequestMapping("save_fmcontenttype")
    @ResponseBody
    public String save_fmcontenttype(String contenttype,Integer typeid)
    {
        Fmcontenttype f=new Fmcontenttype();
        f.setContenttype(contenttype);
        f.setTypeid(typeid);
        int fm=fmcontservice.save_fmcontenttype(f);
        if(fm>0)
        {
            return "<h1>添加成功</h1>";
        }
        else
        {
            return "<h1>添加失败</h1>";
        }

    }

    /*
     *修改专辑
     */
    @RequestMapping("update_fmcontenttype")
    @ResponseBody
    public void update_fmcontenttype(String contenttypeName,Integer typeid,Integer tid)
    {
        int count=fmcontservice.update_fmcontenttype(contenttypeName,typeid,tid);
    }

    /*
    *删除专辑
     */
    @RequestMapping("delete_fmcontenttype")
    @ResponseBody
    public boolean delete_fmcontenttype(Integer tid)
    {
        int del=fmcontservice.delete_fmcontenttype(tid);
        if(del>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     *查询专辑下面的节目类型
     */
    @RequestMapping("queryType")
    public String queryType(Integer tid,Model model)
    {
        List<Map<String,Object>> list=fmcontservice.queryType(tid);
        List<Fmtype> llist=fmtypeservice.queryAllFMtype();
        List<Fmcontenttype> list1=fmcontservice.queryByid(tid);
        model.addAttribute("list",list);
        model.addAttribute("llist",llist);
        model.addAttribute("list1",list1);
        return  "edit_fmcontenttype";
    }
}
