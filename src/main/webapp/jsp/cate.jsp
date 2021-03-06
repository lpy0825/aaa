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
    <script type="text/javascript" src="./js/jqPaginator.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <![endif]-->
    <style type="text/css">
      .active {
        background-color: #1AAD19 !important;
        color: white !important;
      }
    </style>
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

      <xblock>
          <button class="layui-btn"  lay-submit="" lay-filter="sreach" onclick="x_admin_show('编辑','jsp/add_fmtype.jsp')"><i class="layui-icon"></i>增加</button>
          <span class="x-right" style="line-height:40px">共有数据:${count} 条</span>
      </xblock>
      <table class="layui-table layui-form">
        <thead>
          <tr>
            <th width="20">
              <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">&#xe605;</i></div>
            </th>
            <th width="70">节目名称</th>

            <th width="220">操作</th>
        </thead>
        <tbody class="x-cate">
          <c:forEach items="${typelist}" var="f">
            <tr cate-id='1' fid='0' >
              <td>${f.tid}</td>
              <td>
                <i class="layui-icon x-show" status='true'>&#xe623;</i>
                ${f.type}
              </td>
                <td class="td-manage">
                <button class="layui-btn layui-btn layui-btn-xs"  onclick="x_admin_show('编辑','fmtype/find_tid?tid=${f.tid}')" ><i class="layui-icon">&#xe642;</i>编辑</button>

                <button class="layui-btn-danger layui-btn layui-btn-xs"  onclick="member_del(this,'${f.tid}')" href="javascript:;" ><i class="layui-icon">&#xe640;</i>删除</button>
              </td>
            </tr>
          </c:forEach>
        </tbody>
      </table>
    </div>
    <div id="pageDiv" class="layui-box layui-laypage layui-laypage-default">

    </div>

    <script>
      layui.use(['form'], function(){
        form = layui.form;
        
      });


      /*用户-删除*/
      function member_del(obj,id){
          layer.confirm('确认要删除吗？',function(index){
              $.ajax({
              url:'fmtype/delete_fmtype',
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

    <script>
        $(function () {
            $(".layui-disabled").attr("href","javacript:void(0)");
        });
        layui.use(['form'], function () {
            form = layui.form;

        });
        $('#pageDiv').jqPaginator({
            totalCounts: ${count},
            pageSize: 5,
            visiblePages: 5,
            currentPage: ${pages},
            disableClass: 'layui-disabled',
            first: '<a class="layui-laypage-prev" href="fmtype/queryAllFMtype?pageindex=1">首页</a>',
            prev: '<a class="layui-laypage-prev" href="fmtype/queryAllFMtype?pageindex={{page}}">上一页</a>',
            next: '<a class="layui-laypage-prev" href="fmtype/queryAllFMtype?pageindex={{page}}">下一页</a>',
            last: '<a class="layui-laypage-prev" href="fmtype/queryAllFMtype?pageindex={{totalPages}}">尾页</a>',
            page: '<a class="layui-laypage-prev" href="fmtype/queryAllFMtype?pageindex={{page}}">{{page}}</a>',
            activeClass: 'active'
        });
    </script>
  </body>

</html>