package com.aaa.service;

import com.aaa.dao.FMmechannismdao;
import com.aaa.entity.FMmechannism;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class FMmechannismservice {

    @Resource
    FMmechannismdao medao;


    /*
    查询所有企业认证
     */
    public List<Map<String,Object>> queryFMmechannism()
    {
        return medao.queryFMmechannism();
    }

    /*
    按ID查询
     */
    public List<Map<String,Object>> queryMid(Integer mid)
    {
        return medao.queryMid(mid);
    }

    /*
    查询所有未审核
     */
    public List<Map<String,Object>> queryFMmechannismshenhe()
    {
        return medao.queryFMmechannismshenhe();
    }
}
