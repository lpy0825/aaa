package com.aaa.service;

import com.aaa.dao.FMmechannismdao;
import com.aaa.entity.FMmechannism;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FMmechannismservice {

    @Resource
    FMmechannismdao medao;


    /*
    查询所有企业认证
     */
    public List<FMmechannism> queryFMmechannism()
    {
        return medao.queryFMmechannism();
    }
}
