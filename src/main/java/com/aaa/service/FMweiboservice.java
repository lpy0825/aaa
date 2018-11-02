package com.aaa.service;


import com.aaa.dao.FMweibodao;
import com.aaa.entity.FMweibo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FMweiboservice {

    @Resource
    FMweibodao weibodao;


    /*
    查询所有微博认证
     */
    public List<FMweibo> queryAllFMweibo()
    {
        return weibodao.queryAllweibo();
    }
}
