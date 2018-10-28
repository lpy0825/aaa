<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <base href="http://localhost:8080/">
    <meta charset="UTF-8">
    <title>专辑</title>
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
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="">演示</a>
        <a>
          <cite>导航元素</cite></a>
      </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
</div>
<div class="x-body">
    <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so layui-form-pane">
            <input class="layui-input" placeholder="分类名" name="cate_name">
            <button class="layui-btn"  lay-submit="" lay-filter="sreach"><i class="layui-icon"></i>增加</button>
        </form>
    </div>
    <xblock>
        <button class="layui-btn layui-btn-warm layui-btn-xs"  onclick="x_admin_show('编辑','jsp/admin-edit.jsp')" ><i class="layui-icon">&#xe642;</i>添加子栏目</button>
        <span class="x-right" style="line-height:40px">共有数据：${count1} 条</span>
    </xblock>
    <table class="layui-table layui-form">
        <thead>
        <tr>
            <th width="20">
                <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">&#xe605;</i></div>
            </th>
            <th width="70">专辑名称</th>
            <th width="50">节目类型</th>
            <th width="220">操作</th>
        </thead>
        <tbody class="x-cate">
            <c:forEach items="${conttypelist}" var="c">
                <tr cate-id='1' fid='0' >
                    <td>
                            ${c.tid}
                    </td>
                    <td>${c.contenttype}</td>
                    <td>
                        <i class="layui-icon x-show" status='true'>&#xe623;</i>
                        ${c.typeid}
                    </td>
                    <td class="td-manage">
                        <button class="layui-btn layui-btn layui-btn-xs"  onclick="x_admin_show('编辑','fmcontent/queryType?tid=${c.tid}')" ><i class="layui-icon">&#xe642;</i>编辑</button>
                        <button class="layui-btn-danger layui-btn layui-btn-xs"  onclick="member_del(this,'${c.tid}')" href="javascript:;" ><i class="layui-icon">&#xe640;</i>删除</button>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
<style type="text/css">

</style>
<script>
    layui.use(['form'], function(){
        form = layui.form;

    });


    /*用户-删除*/
    function member_del(obj,id){
        layer.confirm('确认要删除吗？',function(index){
            $.ajax({
                url:'fmcontent/delete_fmcontenttype',
                type:'post',
                data:{tid:id},
                success:function(data){
                    location.replace(location.href);
                    layer.msg('已删除!',{icon:1,time:1000});
                }
            })
        });
    }
</script>
</body>

</html>