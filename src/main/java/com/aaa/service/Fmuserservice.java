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
    public int update_shenhe(int fmuid,int shenhe)
    {
        return  userdao.update_shenhe(fmuid,shenhe);
    }


}
