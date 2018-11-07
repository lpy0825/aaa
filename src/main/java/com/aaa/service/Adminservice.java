package com.aaa.service;

import com.aaa.dao.admindao;
import com.aaa.entity.admin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class Adminservice {

    @Resource
    admindao adao;

    /*
    管理员登陆
     */
    public List<admin> last_login(String aname,String apassword)
    {
        return adao.last_login(aname,apassword);
    }

    /**
     * 查询所有管理员
     * @return
     */
    public List<Map<String,Object>> queryadmin(int aid)
    {
        return adao.queryadmin(aid);
    }


    /**
     * 修改管理员信息
     */
    public int update_admin(String aname,String apassword,String image,String email,String motto,String realname,Integer aid)
    {
        return adao.update_admin(aname,apassword,image,email,motto,realname,aid);
    }

}
