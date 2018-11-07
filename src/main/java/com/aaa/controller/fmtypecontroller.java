package com.aaa.controller;

import com.aaa.entity.Fmtype;
import com.aaa.entity.admin;
import com.aaa.service.Fmtypeservice;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("fmtype")
public class fmtypecontroller {

    @Resource
    Fmtypeservice fmservice;

    /*
    按照ID查询节目
     */
    @RequestMapping("/find_tid")
    public String find_tid(int tid,Model model)
    {
        List<Fmtype> list=fmservice.find_tid(tid);
        model.addAttribute("typelist",list);
        return "edit_fmtype";
    }
    /*
        分页查询所有节目
      */
    @RequestMapping("/queryAllFMtype")
    public String queryAllFMtype(Integer pageindex,Model model)
    {
        if(pageindex==null)
        {
            pageindex=1;
        }
        Page startPage= PageHelper.startPage(pageindex,5);
        List<Fmtype> list=fmservice.queryAllFMtype();
        int count=fmservice.queryAllFMtype().size();
        model.addAttribute("count",count);
        model.addAttribute("typelist",list);
        model.addAttribute("pages",pageindex);
        return "cate";
    }

    /*
    添加节目
     */
    @RequestMapping("/insert_fmtype")
    @ResponseBody
    public String insert_fmtype(String type)
    {
        Fmtype f=new Fmtype();
        f.setType(type);
        int fm=fmservice.save_fmtype(f);
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
    修改节目
     */
    @RequestMapping("update_fmtype")
    @ResponseBody
    public void update_fmtype(String type,Integer tid)
    {
        int count=fmservice.update_fmtype(type,tid);
    }

    /*
    删除节目
     */
    @RequestMapping("delete_fmtype")
    @ResponseBody
    public boolean delete_fmtype(int tid)
    {
        System.out.println(tid);
        int del=fmservice.delete_fmtype(tid);
        if(del>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
