package com.aaa.controller;

import com.aaa.entity.FMmechannism;
import com.aaa.service.FMmechannismservice;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("fmmechannism")
public class fmmechannismcontroller {

    @Resource
    FMmechannismservice meservice;


    @RequestMapping("queryFMmechannism")
    public  String queryFMmechannism(Model model)
    {
        List<Map<String,Object>> list=meservice.queryFMmechannism();
        int mecount=list.size();
        model.addAttribute("mecount",mecount);
        model.addAttribute("melist",list);
        return "fmmechannism";
    }

    @RequestMapping("queryMid")
    public String queryMid(Integer mid,Model model)
    {
        List<Map<String,Object>> list=meservice.queryMid(mid);
        model.addAttribute("melistid",list);
        return "fmmechannismlist";
    }


    @RequestMapping("queryFMmechannismshenhe")
    public  String queryFMmechannismshenhe(Model model)
    {
        List<Map<String,Object>> list=meservice.queryFMmechannismshenhe();
        int mecount=list.size();
        model.addAttribute("mecountsh",mecount);
        model.addAttribute("melistsh",list);
        return "fmmechannism";
    }
}
