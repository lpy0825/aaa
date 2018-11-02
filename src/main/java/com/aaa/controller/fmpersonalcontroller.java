package com.aaa.controller;

import com.aaa.entity.FMpersonal;
import com.aaa.service.FMpersonalservice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("fmpersonal")
public class fmpersonalcontroller {

    @Resource
    FMpersonalservice perservice;


    @RequestMapping("queryAllFMpersonal")
    public String  queryAllFMpersonal(Model model)
    {
        List<FMpersonal> list=perservice.queryAllFMpersonal();
        int percount=list.size();
        model.addAttribute("percount",percount);
        model.addAttribute("perlist",list);
        return "fmpersonal";
    }
}
