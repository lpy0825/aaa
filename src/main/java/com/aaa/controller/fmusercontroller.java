package com.aaa.controller;

import com.aaa.entity.FMuser;
import com.aaa.service.Fmuserservice;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
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
     * 分页查询所有前台用户
     * @param model
     * @return
     */
    @RequestMapping("queryfmuser")
    public String queryfmuser(Integer pageindex , Model model)
    {
        if(pageindex==null)
        {
            pageindex=1;
        }
        Page startPage= PageHelper.startPage(pageindex,5);
        List<FMuser> list=userservice.queryfmuser();
        int count=userservice.queryfmuser().size();
        model.addAttribute("count",count);
        model.addAttribute("userlist",list);
        model.addAttribute("pages",pageindex);
        return "admin-list";
    }



    /*
    用户禁用启用
     */
    @RequestMapping("update_fmuser")
    @ResponseBody
    public boolean update_fmuser(int fmuid,int bp)
    {
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

    /*
    修改审核状态
     */

    @RequestMapping("update_shenhe")
    public String update_shenhe(int fmuid,int shenhe)
    {
        int count=userservice.update_shenhe(fmuid,shenhe,1);
        if(count>0){
            if(shenhe==0){
                return "verifyno";
            }else{
                return "verifyok";
            }
        }
        return "500";
    }
    /*
    按照ID查询
     */
    @RequestMapping("queryfmuser_id")
    public String queryfmuser_id(Integer fmuid, Model model)
    {
        List<FMuser> list=userservice.queryfmuser_id(fmuid);
        model.addAttribute("listfmuid",list);
        return "fmcreditlist";
    }


    /*
    查询信誉度低于100的用户
     */
    @RequestMapping("query_Fmcredibilty")
    public String query_Fmcredibilty(Integer pageindex,Model model)
    {
        if(pageindex==null)
        {
            pageindex=1;
        }
        List<FMuser> list=userservice.query_Fmcredibilty();
        int count=userservice.query_Fmcredibilty().size();
        model.addAttribute("countcr",count);
        model.addAttribute("userlistcr",list);
        model.addAttribute("pages",pageindex);
        return "fmcreditlist";
    }
}
