package com.aaa.controller;

import com.aaa.entity.*;
import com.aaa.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("admin")
public class admincontroller {

    @Resource
    Adminservice aservice;

    @Resource
    Fmtypeservice typeservice;

    @Resource
    Fmcontenttypeservice conttypeservice;

    @Resource
    Fmuserservice userservice;

    @Resource
    FMpersonalservice perservice;

    @Resource
    FMweiboservice weiboservice;

    @Resource
    FMmechannismservice meservice;

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

    /**
     * id查询管理员
     * @param model
     * @return
     */
    @RequestMapping("queryadmin")
    public String  queryadmin(Integer aid,Model model)
    {

        List<Map<String,Object>> list=aservice.queryadmin(aid);
        model.addAttribute("list",list);
        return "Mycenter";
    }

    /**
     * 修改管理员信息
     * @param aname
     * @param apassword
     * @param email
     * @param motto
     * @param aid
     */
    @RequestMapping("update_admin")
    @ResponseBody
    public void  update_admin(String aname,String apassword,String email,String motto,String realname,Integer aid,MultipartFile[] picfile) throws  IOException
    {
        String image="";
        //上传文件
        for(MultipartFile uploadadmin : picfile)
        {
            String originaFilename=uploadadmin.getOriginalFilename();
            if(!originaFilename.equals(""))
            {
                image = UUID.randomUUID().toString()
                        + originaFilename.substring(originaFilename
                        .lastIndexOf("."));
                String lujing="G:/RadioFM/src/main/resources/static/img/"+image;
                File file=new File(lujing);
                uploadadmin.transferTo(file);
            }
        }
        int count=aservice.update_admin(aname,apassword,image,email,motto,realname,aid);
    }


    /*
    查询所有总和数量
     */

    @RequestMapping("queryAlltype")
    public String queryAlltype(Model model)
    {
        List<Fmtype> list1=typeservice.queryAllFMtype();
        List<Fmcontenttype> list2=conttypeservice.queryAllFmcontent();
        List<FMuser> list3=userservice.queryfmuser();
        List<Map<String,Object>> list4=weiboservice.queryAllweibo();
        List<Map<String,Object>> list5=perservice.queryAllFMpersonal();
        List<Map<String,Object>> list6=meservice.queryFMmechannism();

        int count1=list1.size();//节目总数
        int count2=list2.size();//专辑总和
        int count3=list3.size();//用户总和
        int count4=list4.size();//微博认证总和
        int count5=list5.size();//个人认证总和
        int count6=list6.size();//机构认证总和
        model.addAttribute("count1",count1);
        model.addAttribute("count2",count2);
        model.addAttribute("count3",count3);
        model.addAttribute("count4",count4);
        model.addAttribute("count5",count5);
        model.addAttribute("count6",count6);
        return "welcome";
    }

    /**
     * 头像上传
     */
    /*@RequestMapping("upload_admin")
    @ResponseBody
    public String upload_admin(MultipartFile[] picfile) throws IOException{
        String picValue="";
        //上传文件
        for(MultipartFile uploadadmin : picfile)
        {
            String originaFilename=uploadadmin.getOriginalFilename();
            if(!originaFilename.equals(""))
            {
                picValue = UUID.randomUUID().toString()
                        + originaFilename.substring(originaFilename
                        .lastIndexOf("."));
                String lujing="G:/RadioFM/src/main/resources/static/image"+picValue;
                File file=new File(lujing);
                uploadadmin.transferTo(file);
            }
        }
        return  picValue;
    }*/

}
