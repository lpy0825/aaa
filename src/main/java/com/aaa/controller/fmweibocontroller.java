package com.aaa.controller;

import com.aaa.entity.FMweibo;
import com.aaa.service.FMweiboservice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("fmweibo")
public class fmweibocontroller {

    @Resource
    FMweiboservice weiboservice;


    /*
    查询全部微博认证
     */
    @RequestMapping("queryAllweibo")
    public String queryAllweibo(Model model)
    {
        List<Map<String,Object>> list=weiboservice.queryAllweibo();
        int weibocount=list.size();
        model.addAttribute("weibocount",weibocount);
        model.addAttribute("weibolsit",list);
        return "fmweibo";
    }


    /*
    按照ID查询微博认证
     */
    @RequestMapping("queryweibo")
    public String queryweibo(Integer wid, Model model)
    {
        List<Map<String,Object>> list=weiboservice.querywid(wid);
        model.addAttribute("wblist",list);
        return "fmweibolist";
    }


    @RequestMapping("queryAllweibosh")
    public String queryAllweibosh(Model model)
    {
        List<Map<String,Object>> list=weiboservice.queryAllweibosh();
        int weibocount=list.size();
        model.addAttribute("weibocountsh",weibocount);
        model.addAttribute("weibolsitsh",list);
        return "fmweibo";
    }
}
