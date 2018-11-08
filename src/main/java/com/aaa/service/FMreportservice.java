package com.aaa.service;

import com.aaa.dao.FMreportdao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class FMreportservice {

    @Resource
    FMreportdao reportdao;

    public List<Map<String,Object>>queryreport()
    {
        return reportdao.queryreport();
    }

}
