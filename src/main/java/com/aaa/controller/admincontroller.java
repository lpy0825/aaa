package com.aaa.controller;

import com.aaa.entity.admin;
import com.aaa.service.Adminservice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("admin")
public class admincontroller {

    @Resource
    Adminservice aservice;

    /*
    * 后台登陆
    */
    @RequestMapping("/adminlogin")
    public String last_login(String aname, String apassword, HttpSession session, Model model) throws Exception
    {
        List<admin> list=aservice.last_login(aname, apassword);
        if(list.size()>0&&list!=null)
        {
            session.setAttribute("aname",list);
            return "index";
        }
        else
        {
            return "login";
        }
    }

}
