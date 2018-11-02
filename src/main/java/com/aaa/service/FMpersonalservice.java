package com.aaa.service;

import com.aaa.dao.FMpersonaldao;
import com.aaa.entity.FMpersonal;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FMpersonalservice {

    @Resource
    FMpersonaldao perdao;


    /*
    查询所有个人认证
     */
    public List<FMpersonal> queryAllFMpersonal()
    {
        return perdao.queryFMpersonal();
    }

}
