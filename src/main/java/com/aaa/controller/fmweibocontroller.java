package com.aaa.controller;

import com.aaa.entity.FMweibo;
import com.aaa.service.FMweiboservice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

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
        List<FMweibo> list=weiboservice.queryAllFMweibo();
        int weibocount=list.size();
        model.addAttribute("weibocount",weibocount);
        model.addAttribute("weibolsit",list);
        return "fmweibo";
    }
}
