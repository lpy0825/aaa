package com.aaa.controller;

import com.aaa.entity.FMmechannism;
import com.aaa.service.FMmechannismservice;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("fmmechannism")
public class fmmechannismcontroller {

    @Resource
    FMmechannismservice meservice;


    @RequestMapping("queryFMmechannism")
    public  String queryFMmechannism(Model model)
    {
        List<FMmechannism> list=meservice.queryFMmechannism();
        int mecount=list.size();
        model.addAttribute("mecount",mecount);
        model.addAttribute("melist",list);
        return "fmmechannism";
    }

}
