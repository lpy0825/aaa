package com.aaa.controller;

import com.aaa.service.FMpersonalservice;
import com.aaa.service.FMreportservice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("FMreprot")
public class FMreportcontroller {



    @Resource
    FMreportservice reportservice;

    @RequestMapping("queryreport")
    public String queryreport(Model model)
    {
        List<Map<String,Object>> list=reportservice.queryreport();

        return "";
    }
}
