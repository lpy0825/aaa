<%--
  Created by IntelliJ IDEA.
  User: 40828
  Date: 2018/10/23
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <title>ITAEM</title>
    <link rel="stylesheet" href="lib/layui/css/layui.css" />
</head>
<body>
<center>

    <fieldset class="layui-elem-field">
        <hr class="layui-bg-red"/>
        <img src="img/itaem.jpg" height="100px">
        <hr class="layui-bg-red"/>
        <form class="layui-form" action="/alipay/pay">
            <input type="text" placeholder="￥" name="money" id="money"/>
            <input type="submit" value="赠送" class="layui-btn layui-btn-mini" />
        </form>
    </fieldset>
</center>
</body>
</html>
