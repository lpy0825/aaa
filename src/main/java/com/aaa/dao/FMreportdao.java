package com.aaa.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.List;
import java.util.Map;

@Mapper
public interface FMreportdao {

    @Select("select * from fmreport ")
    public List<Map<String,Object>> queryreport();
}
