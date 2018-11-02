package com.aaa.controller;

import com.aaa.entity.FMuser;
import com.aaa.service.Fmuserservice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("fmuser")
public class fmusercontroller {

    @Resource
    Fmuserservice userservice;

    /**
     * 查询所有前台用户
     * @param model
     * @return
     */
    @RequestMapping("queryfmuser")
    public String queryfmuser(Model model)
    {
        List<FMuser> list=userservice.queryfmuser();
        int count=list.size();
        model.addAttribute("count",count);
        model.addAttribute("userlist",list);
        return "admin-list";
    }

    @RequestMapping("update_fmuser")
    @ResponseBody
    public boolean update_fmuser(int fmuid,int bp)
    {
        System.out.println("111");
        int count=userservice.update_fmuser(fmuid,bp);
        if(count>0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

}
