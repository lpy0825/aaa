package com.aaa.controller;

import com.aaa.entity.FMpersonal;
import com.aaa.service.FMpersonalservice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("fmpersonal")
public class fmpersonalcontroller {

    @Resource
    FMpersonalservice perservice;


    /*
    查询全部个人认证
     */
    @RequestMapping("queryAllFMpersonal")
    public String  queryAllFMpersonal(Model model)
    {
        List<Map<String,Object>> list=perservice.queryAllFMpersonal();
        int percount=list.size();
        model.addAttribute("percount",percount);
        model.addAttribute("perlist",list);
        return "fmpersonal";
    }

    /*
    按ID查询
     */
    @RequestMapping("queryPid")
    public String queryPid(Integer pid,Model model)
    {
        List<Map<String,Object>> list=perservice.queryPid(pid);
        model.addAttribute("pidlist",list);
        return "fmpersonallist";
    }

    /*
    查询所有未审核
     */
    @RequestMapping("queryFMpersonalsh")
    public String  queryFMpersonalsh(Model model)
    {
        List<Map<String,Object>> list=perservice.queryFMpersonalsh();
        int percount=list.size();
        model.addAttribute("percountsh",percount);
        model.addAttribute("perlistsh",list);
        return "fmpersonal";
    }
}
