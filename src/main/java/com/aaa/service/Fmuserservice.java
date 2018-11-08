package com.aaa.service;

import com.aaa.dao.FMuserdao;
import com.aaa.entity.FMuser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Fmuserservice {

    @Resource
    FMuserdao userdao;

    /*
    查询所有前台用户
     */
    public List<FMuser> queryfmuser()
    {
        return  userdao.queryfmuser();
    }


    /*
    修改状态
     */
    public int update_fmuser(int fmuid,int bp)
    {
        return userdao.update_fmuser(fmuid,bp);
    }


    /*
    修改审核
     */
    public int update_shenhe(int fmuid,int shenhe,int fmanchor)
    {
        return  userdao.update_shenhe(fmuid,shenhe,fmanchor);
    }


    /*
    按照ID查询用户
     */
    public List<FMuser> queryfmuser_id(Integer fmuid)
    {
        return userdao.queryfmuser_id(fmuid);
    }


    /*
    查询信誉度低于100的
     */
    public List<FMuser>query_Fmcredibilty()
    {
        return userdao.query_Fmcredibilty();
    }
}
