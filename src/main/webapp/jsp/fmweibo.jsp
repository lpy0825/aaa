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
    <title>名人认证</title>
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
        <span class="x-right" style="line-height:40px">共有：${weibocountsh } 条数据未审核</span>
    </xblock>
    <table class="layui-table">
        <thead>
        <tr>
            <th>编号</th>
            <th>微博名</th>
            <th>粉丝数量</th>
            <th>是否大v</th>
            <th>身份证号</th>
            <th>证件照</th>
            <th>用户</th>
            <th>认证类型</th>
            <th>真实姓名</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>

        <c:forEach items="${weibolsitsh }" var="wb">
            <tr>
                <td>${wb.wid}</td>
                <td>${wb.wname}</td>
                <td>${wb.wfollower}</td>
                <td>${wb.wauth}</td>
                <td>${wb.eid}</td>
                <td><img src="image/${wb.eimage}" style="border-radius: 50%;height:70px;width:70px;"></td>
                <td>${wb.Fmuname}</td>
                <td>${wb.Authentication}</td>
                <td>${wb.ename}</td>
                <td class="td-manage">
                    <a title="查看"  onclick="x_admin_show('编辑','fmweibo/queryweibo?wid=${wb.wid}')" href="javascript:;">
                        <i class="layui-icon">&#xe63c;</i>
                    </a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>

</html>