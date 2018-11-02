<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <![endif]-->
</head>

<body>
<div class="x-body">
    <form class="layui-form" action="fmcontent/save_fmcontenttype" method="post">
        <div class="layui-form-item">
            <label for="contenttype" class="layui-form-label">
                <span class="x-red">*</span>专辑
            </label>
            <div class="layui-input-inline">
                <input type="text"  id="contenttype" name="contenttype" required="" lay-verify="type"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>添加一个专辑
            </div>
        </div>
        <div class="layui-input-inline">
            <label  class="layui-form-label">
                <span class="x-red">*</span>选择节目类型
            </label>
            <div class="layui-input-inline">
                <select name="tid">
                    <c:forEach items="${llist}" var="s">
                        <option value="${s.tid}">${s.type}</option>
                    </c:forEach>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label  class="layui-form-label">
            </label>
            <input type="submit" class="layui-btn" value="添加" onclick="x_admin_close()">
        </div>
    </form>
</div>
<script>
    layui.use(['form','layer'], function(){
        $ = layui.jquery;
        var form = layui.form
            ,layer = layui.layer;
    });
</script>
</body>
</html>