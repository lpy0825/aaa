<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">
  <meta charset="UTF-8">
  <title>欢迎页面-X-admin2.0</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
  <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
  <link rel="stylesheet" href="./CSS/font.css">
  <link rel="stylesheet" href="./CSS/xadmin.css">
  <script src="/js/jquery-3.1.1.js"></script>
  <script type="text/javascript" src="./lib/layui/layui.js" charset="utf-8"></script>
  <script type="text/javascript" src="./js/xadmin.js"></script>
  <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
  <!--[if lt IE 9]>
  <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
  <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
  <![endif]-->
</head>

<body class="layui-anim layui-anim-up">
<div class="x-nav">
      <span class="layui-breadcrumb">
      </span>
  <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
    <i class="layui-icon" style="line-height:30px">ဂ</i></a>
</div>
<div class="x-body">
  <xblock>
    <span class="x-right" style="line-height:40px">共有数据：${count } 条</span>
  </xblock>
  <table class="layui-table">
    <thead>
    <tr>
      <th>编号</th>
      <th>用户名</th>
      <th>手机号</th>
      <th>邮箱</th>
      <th>普通用户&VIP会员</th>
      <th>主播&非主播</th>
      <th>头像</th>
      <th>签名</th>
      <th>信誉度</th>
      <th>审核状态</th>
      <th>操作</th>
    </tr>
    </thead>
    <tbody>

    <c:forEach items="${userlist }" var="us">
      <tr>
        <td>${us.fmuid}</td>
        <td>${us.fmuname}</td>
        <td>${us.fmuphone}</td>
        <td>${us.fmemali}</td>
        <td>${us.fmstate}</td>
        <td>${us.fmanchor}</td>
        <td><img src="image/${us.fmuserimg}" style="border-radius: 50%;height:70px;width:70px;"></td>
        <td>${us.fmsignature}</td>
        <td>${us.fmcredibilty}</td>
        <td>${us.shenhe}</td>

        <c:choose>
          <c:when test="${us.BP eq 1}">
            <td class="td-status">
              <span class="layui-btn layui-btn-normal layui-btn-mini">已启用</span>
            </td>
          </c:when>
          <c:when test="${us.BP eq 0}">
            <td class="td-status">
              <span class="layui-btn layui-btn-normal layui-btn-mini layui-btn-disabled">已停用</span>
            </td>
          </c:when>
        </c:choose>
        <td class="td-manage">
          <c:if test="${us.BP eq 0}">
            <a onclick="member_stop(this,${us.fmuid})" href="javascript:;"  title="启用">
              <i class="layui-icon">&#xe601;</i>
            </a>
          </c:if>
          <c:if test="${us.BP eq 1}">
            <a onclick="member_stop(this,${us.fmuid})" href="javascript:;"  title="停用">
              <i class="layui-icon">&#xe601;</i>
            </a>
          </c:if>

        </td>
      </tr>
    </c:forEach>

    </tbody>
  </table>


</div>
<script>
    layui.use('laydate', function(){
        var laydate = layui.laydate;

        //执行一个laydate实例
        laydate.render({
            elem: '#start' //指定元素
        });

        //执行一个laydate实例
        laydate.render({
            elem: '#end' //指定元素
        });
    });

    /*用户-停用*/
    function member_stop(obj,id){
        if($(obj).attr('title')=='停用'){
            layer.confirm('确认要停用吗？',function(index){
                $.ajax({
                    url:'fmuser/update_fmuser',
                    type:'post',
                    data:{
                        fmuid:id,
                        bp:0
                    },
                    success:function(data){
                        $(obj).attr('title','启用')
                        $(obj).find('i').html('&#xe62f;');
                        $(obj).parents("tr").find(".td-status").find('span').addClass('layui-btn-disabled').html('已停用');
                        layer.msg('已停用!',{icon: 5,time:1000});
                    }
                })
            });
        }else{
            layer.confirm('确认要启用吗？',function(index){
                $.ajax({
                    url:'fmuser/update_fmuser',
                    type:'post',
                    data:{
                        fmuid:id,
                        bp:1
                    },
                    success:function(data){
                        $(obj).attr('title','停用')
                        $(obj).find('i').html('&#xe601;');
                        $(obj).parents("tr").find(".td-status").find('span').removeClass('layui-btn-disabled').html('已启用');
                        layer.msg('已启用!',{icon: 6,time:1000});
                    }
                })
            });
        }
    }
</script>
</body>

</html>