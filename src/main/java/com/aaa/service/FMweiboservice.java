package com.aaa.service;


import com.aaa.dao.FMweibodao;
import com.aaa.entity.FMweibo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class FMweiboservice {

    @Resource
    FMweibodao weibodao;


    /*
    查询所有微博认证
     */
  /*  public List<FMweibo> queryAllFMweibo()
    {
        return weibodao.queryAllweibo();
    }*/

  public List<Map<String,Object>> queryAllweibo()
  {
      return  weibodao.queryAllweibo();
  }


  /*
  按照ID查询微博认证
   */
  public List<Map<String,Object>> querywid(Integer wid)
  {
      return weibodao.querywid(wid);
  }

  public List<Map<String,Object>> queryAllweibosh()
  {
      return  weibodao.queryAllweibosh();
  }
}
