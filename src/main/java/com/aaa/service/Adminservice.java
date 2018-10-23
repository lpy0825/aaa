package com.aaa.service;

import com.aaa.dao.admindao;
import com.aaa.entity.admin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Adminservice {

    @Resource
    admindao adao;

    public List<admin> last_login(String aname,String apassword)
    {
        return adao.last_login(aname,apassword);
    }
}
