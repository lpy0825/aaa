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
    <title>个人中心</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="static/CSS/font.css">
    <link rel="stylesheet" href="static/CSS/xadmin.css">
    <link rel="stylesheet" type="text/css" href="./lib/layui/css/layui.css" />
    <script src="/js/jquery-3.1.1.js"></script>
    <script type="text/javascript" src="./lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="./js/xadmin.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style type="text/css">
        .fileDiv{
            margin-left:10px;
            width: 160px;
            height: 170px;
            position: relative;
        }
        .fileDiv span{
            display: none;
            font-size: 18px;
            position: absolute;
            right: 5px;
        }
        .fileDiv img{
            display: none;
            width: 160px;
            height: 160px;
        }
        .fileDefaultDiv{
            border: 1px solid #fb6b84;
            text-align: center;
            font-size: 45px;
            height: 160px;
            line-height: 160px;
            color: #fb6b84;
            border-radius:4px;
        }

    </style>
</head>

<body>
<section class="layui-larry-box">
    <div class="larry-personal">
        <div class="larry-personal-body clearfix">
            <form class="layui-form col-lg-5" action="admin/update_admin" method="post" enctype="multipart/form-data">
                <div class="layui-form-item">
                    <label class="layui-form-label">用户名</label>
                    <div class="layui-input-block">
                        <input type="text" name="aname" autocomplete="off"  class="layui-input layui-disabled"  readonly value="${list[0].aname}" >
                    </div>
                    <input type="text" style="opacity: 0" name="aid" value="${list[0].aid}">
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">密码</label>
                    <div class="layui-input-block">
                        <input type="text" name="apassword"  autocomplete="off" class="layui-input" value="${list[0].apassword}">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">真实姓名</label>
                    <div class="layui-input-block">
                        <input type="text" name="realname"  autocomplete="off" class="layui-input" value="${list[0].realname}">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">修改头像</label>
                    <div class="layui-input-block">
                    <div class="fileDiv" id="imageFile">
                        <span type="button" onclick="clearAway(this)">X</span>
                            <input type="file" id="bookPicFile" onchange="changImg(event,this)" name="picfile" style="display: none;" />
                            <div class="fileDefaultDiv" onclick="selectPic(this)">+</div>
                            <img alt="" teaPicName="" src="" onclick="selectPic(this)">
                    </div>

                    </div>
                </div>
                <input type="text" value="${list[0].image}" style="opacity: 0;">
                <div class="layui-form-item">
                    <label class="layui-form-label">邮箱</label>
                    <div class="layui-input-block">
                        <input type="text" name="email"  autocomplete="off" class="layui-input" placeholder="输入邮箱" value="${list[0].email}">
                    </div>
                </div>
                <div class="layui-form-item layui-form-text">
                    <label class="layui-form-label">座右铭</label>
                    <div class="layui-input-block">
                        <input type="text" name="motto"  autocomplete="off" class="layui-input" placeholder="输入座右铭" value="${list[0].motto}">
                    </div>
                </div>

                <div class="layui-form-item">
                    <div class="layui-input-block">
                        <button class="layui-btn" lay-submit="" lay-filter="demo1" onclick="x_admin_close()">立即修改</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</section>
<script type="text/javascript">
    $(function () {
        if(!${empty list[0].image}){
            $("#imageFile").find("img").attr("src", "img/${list[0].image}").show();
            $("#imageFile").find("span").show();
            $("#imageFile").find("div").hide();
        }
    })
    //选择图片
    function selectPic(obj)
    {
        var parent = $(obj).parent();
        parent.find("input").click();
    }
    //图片回显
    function changImg(e, obj)
    {
        var parent = $(obj).parent();
        var num = $(obj).val().lastIndexOf(".");
        var check = $(obj).val().substring(num + 1);
        if (check == "jpg" || check == "gif" || check == "png" || check == "jpeg")
        {
            for (var i = 0; i < e.target.files.length; i++)
            {
                var file = e.target.files.item(i);
                if (!(/^image\/.*$/i.test(file.type))) {
                    continue;
                    //不是图片 就跳出这一次循环
                }
                //实例化FileReader API
                var freader = new FileReader();
                freader.readAsDataURL(file);
                freader.onload = function (e)
                {
                    parent.find("img").attr("src", e.target.result).show();
                    parent.find("span").show();
                    parent.find("div").hide();
                };
            }
        }
        else {
            $(obj).val("");
            toastr.error("请选择正确的图片格式！");
        }
    }
    //清除选择的图片
    function clearAway(obj)
    {
        var parent = $(obj).parent();
        $(obj).hide();
        parent.find("img").attr("src", "").hide();
        parent.find("div").show();
        parent.find("input").val("");
    }

</script>
</body>

</html>