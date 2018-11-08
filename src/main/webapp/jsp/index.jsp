<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html lang="en">
<head>
    <base href="<%=basePath%>">
	<meta charset="UTF-8">
	<title>西瓜FM</title>
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />

    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="./CSS/font.css">
	<link rel="stylesheet" href="./CSS/xadmin.css">
    <script src="/js/jquery-3.1.1.js"></script>
    <script src="./lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="./js/xadmin.js"></script>
    <style>
        #time{
            float:right;
    </style>
</head>
<body>
    <!-- 顶部开始 -->
    <div class="container">
        <div class="logo"><a href="jsp/index.jsp">西瓜FM</a></div>
        <div class="left_open">
            <i title="展开左侧栏" class="iconfont">&#xe699;</i>
        </div>
        <ul class="layui-nav left fast-add" lay-filter="">
        </ul>
        <ul class="layui-nav right" lay-filter="">
          <li class="layui-nav-item">
              <c:if test="${empty aname[0].aname}">

              </c:if>
              <c:if test="${ not empty aname[0].aname}">
                  <a href="javascript:;" id="adname">${aname[0].aname}</a>
                  <dl class="layui-nav-child"> <!-- 二级菜单 -->
                      <dd><a onclick="x_admin_show('个人信息','admin/queryadmin?aid=${aname[0].aid}')">个人信息</a></dd>
                      <dd><a href="jsp/login.jsp">退出</a></dd>
                  </dl>
              </c:if>

          </li>
          </li>
          <li class="layui-nav-item to-index"><a href="/">前台首页</a></li>
          <li class="layui-nav-item to-index">⌚当前时间:<div id="time"></div></li>
        </ul>

    </div>
    <!-- 顶部结束 -->
    <!-- 中部开始 -->
     <!-- 左侧菜单开始 -->
    <div class="left-nav">
      <div id="side-nav">
        <ul id="nav">
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6b8;</i>
                    <cite>用户管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="fmuser/queryfmuser">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>用户列表</cite>
                        </a>
                    </li >
                </ul>
                <ul class="sub-menu">
                    <li>
                        <a _href="fmuser/query_Fmcredibilty">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>举报列表</cite>
                        </a>
                    </li >
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe723;</i>
                    <cite>订单管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="jsp/order-list.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>订单列表</cite>
                        </a>
                    </li >
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe723;</i>
                    <cite>分类管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="fmtype/queryAllFMtype">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>节目管理</cite>
                        </a>
                    </li >
                </ul>
                <ul class="sub-menu">
                    <li>
                        <a _href="fmcontent/queryctype">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>专辑管理</cite>
                        </a>
                    </li >
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe723;</i>
                    <cite>认证管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="fmpersonal/queryFMpersonalsh">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>个人认证</cite>
                        </a>
                    </li >
                </ul>
                <ul class="sub-menu">
                    <li>
                        <a _href="fmmechannism/queryFMmechannismshenhe">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>企业认证</cite>
                        </a>
                    </li >
                </ul>
                <ul class="sub-menu">
                    <li>
                        <a _href="fmweibo/queryAllweibosh">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>名人认证</cite>
                        </a>
                    </li >
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe726;</i>
                    <cite>管理员管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="userinfo/find_userinfo">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>管理员列表</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="position/find_Allpositionone">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>角色管理</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="jsp/admin-cate.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>权限分类</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="jsp/admin-rule.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>权限管理</cite>
                        </a>
                    </li >
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6ce;</i>
                    <cite>系统统计</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="jsp/echarts1.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>拆线图</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="jsp/echarts2.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>柱状图</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="jsp/echarts3.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>地图</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="jsp/echarts4.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>饼图</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="jsp/echarts5.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>雷达图</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="jsp/echarts6.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>k线图</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="jsp/echarts7.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>热力图</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="jsp/echarts8.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>仪表图</cite>
                        </a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6b4;</i>
                    <cite>图标字体</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="jsp/unicode.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>图标对应字体</cite>
                        </a>
                    </li>
                </ul>
            </li>
        </ul>
      </div>
    </div>
    <!-- <div class="x-slide_left"></div> -->
    <!-- 左侧菜单结束 -->
    <!-- 右侧主体开始 -->
    <div class="page-content">
        <div class="layui-tab tab" lay-filter="xbs_tab" lay-allowclose="false">
          <ul class="layui-tab-title">
            <li class="home"><i class="layui-icon">&#xe68e;</i>我的桌面</li>
          </ul>
          <div class="layui-tab-content">
            <div class="layui-tab-item layui-show">
                <iframe src='admin/queryAlltype' frameborder="0" scrolling="yes" class="x-iframe"></iframe>
            </div>
          </div>
        </div>
    </div>
    <div class="page-content-bg"></div>
    <!-- 右侧主体结束 -->
    <!-- 中部结束 -->
    <!-- 底部开始 -->
    <div class="footer">
        <div class="copyright">Copyright ©2017 x-admin v2.3 All Rights Reserved</div>  
    </div>
</body>
<script>

</script>
<script type="text/javascript">
    setInterval(function(){
        var time=new Date();
        var year=time.getFullYear(); //获取年份
        var month=time.getMonth()+1; //获取月份
        var day=time.getDate();  //获取日期
        var hour=checkTime(time.getHours());  //获取时
        var minite=checkTime(time.getMinutes()); //获取分
        var second=checkTime(time.getSeconds()); //获取秒
        /****当时、分、秒、小于10时，则添加0****/
        function checkTime(i){
            if(i<10) return "0"+i;
            return i;
        }
        var box=document.getElementById("time");
        box.innerHTML=year+"年"+month+"月"+day+"日 "+hour+":"+minite+":"+second;
    },1000);   //setInterval(fn,i) 定时器，每隔i秒执行fn
</script>
</html>