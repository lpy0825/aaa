package com.aaa.service;

import com.aaa.dao.FMpersonaldao;
import com.aaa.entity.FMpersonal;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class FMpersonalservice {

    @Resource
    FMpersonaldao perdao;


    /*
    查询所有个人认证
     */
    public List<Map<String,Object>> queryAllFMpersonal()
    {
        return perdao.queryFMpersonal();
    }

    /*
    按ID查询
     */
    public List<Map<String,Object>> queryPid(Integer pid)
    {
        return perdao.queryPid(pid);
    }


    /*
    查询所有未审核
     */
    public List<Map<String,Object>> queryFMpersonalsh()
    {
        return perdao.queryFMpersonalsh();
    }

}
