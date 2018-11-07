<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <meta charset="UTF-8">
    <title>审核成功</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <script async="" src="verifyok_files/analytics.js"></script>
    <script src="verifyok_files/xmlog.js"></script>
    <script src="verifyok_files/redirect.js"></script>
    <script src="verifyok_files/recordchannelfrom.js"></script>
    <link href="verifyok_files/web.css" rel="stylesheet" type="text/css">
    <link href="verifyok_files/web_002.css" rel="stylesheet" type="text/css">
    <script src="verifyok_files/main.js" id="kf5-provide-supportBox" kf5-domain="ximalaya.kf5.com" charset="utf-8"></script>
    <script src="verifyok_files/share.js"></script>
    <link rel="stylesheet" href="verifyok_files/share_style1_16.css">
    <script src="/js/jquery-3.1.1.js"></script>
    <script type="text/javascript" src="./lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="./js/xadmin.js"></script>
    <![endif]-->
</head>
<body>
<div class="page">
    <div id="container" class="bodyBgColor">
        <div class="mainbox" id="mainbox">
            <div class="reform">
                <div class="main-box cl">
                    <header class="typeTit">主播认证</header>
                    <div class="step3 stepType">
                        <div class="step-line cl">
                            <div class="step-item on">
                                <span class="num inl-b"></span>
                                <p class="txt">入驻资料</p>
                            </div>
                            <div class="step-item on">
                                <span class="num inl-b"></span>
                                <p class="txt">提交审核</p>
                            </div>
                        </div>
                    </div>
                    <div class="identSuc tc">
                        <span class="inl-b typePic typePic6"><img src="verifyok_files/commit.png"></span>
                        <p class="sucTit mgtb-20">审核未通过</p>
                        <a  id="no" href="javascript:;" class="btn-com btn-lg btn-red mgt-40" >关闭</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script>
    $("#no").click(function(){
        x_admin_close();
    })
</script>
</body>
</html>
