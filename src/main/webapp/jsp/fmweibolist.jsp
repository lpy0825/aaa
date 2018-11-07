<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <title>名人名企认证</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <link rel="canonical" href="http://www.ximalaya.com/verify/star/new">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
    <meta content="webkit" name="renderer">
    <link href="verifycompany_files/web_002.css" rel="stylesheet" type="text/css">
    <script async="" src="verifystar_files/analytics.js"></script>
    <script src="verifystar_files/xmlog.js"></script>
    <script src="verifystar_files/redirect.js"></script>
    <script src="verifystar_files/recordchannelfrom.js"></script>
    <link href="verifystar_files/web.css" rel="stylesheet" type="text/css">
    <link href="verifystar_files/web_002.css" rel="stylesheet" type="text/css">
    <script src="verifystar_files/main.js" id="kf5-provide-supportBox" kf5-domain="ximalaya.kf5.com" charset="utf-8"></script>
    <script src="verifystar_files/share.js"></script>
    <link rel="stylesheet" href="verifystar_files/share_style1_16.css">
    <script src="/js/jquery-3.1.1.js"></script>
    <script type="text/javascript" src="./lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="./js/xadmin.js"></script>
</head>
<body>
<div class="page">


    <div id="container" class="bodyBgColor">
        <div class="mainbox" id="mainbox">

            <div class="reform">
                <div class="main-box cl">
                    <c:forEach items="${wblist}" var="w">

                    <header class="typeTit">微博审核</header>
                    <div class="step-line cl">

                        <div class="step-item on">
                            <span class="num inl-b"></span>
                            <p class="txt">审核资料</p>
                        </div>
                        <div class="step-item">
                            <span class="num inl-b"></span>
                            <p class="txt">审核成功</p>
                        </div>
                    </div>
                    <header class="formTit">微博信息</header>
                    <div class="formItem">
                        <div class="ta-r formLab">
                            <label class="inl-b">微博名称</label>
                        </div>
                        <div class="formArea">
                            <span class="inl-b c02 j-weibo_name">${w.wname}</span>
                        </div>
                    </div>
                    <div class="formItem">
                        <div class="ta-r formLab">
                            <label class="inl-b">总粉丝数</label>
                        </div>
                        <div class="formArea">
                            <span class="inl-b c02 j-fans">${w.wfollower}</span>
                        </div>
                    </div>
                    <div class="formItem">
                        <div class="ta-r formLab vertp">
                            <label class="inl-b">是否加V</label>
                        </div>
                        <div class="formArea">
                            <span class="inl-b c02 j-verify_intro">${w.wauth}</span>
                        </div>
                    </div>
                    <header class="formTit">个人信息</header>

                    <div class="formItem">
                        <div class="ta-r formLab">
                            <label class="inl-b need">真实姓名</label>
                        </div>
                        <div class="formArea">
                            <span class="c02 in-b j-phone">${w.ename}</span>
                        </div>
                    </div>


                    <div class="formItem">
                        <div class="ta-r formLab">
                            <label class="inl-b need">身份证号</label>
                        </div>
                        <div class="formArea">
                            <span class="c02 in-b j-phone">${w.eid}</span>
                        </div>
                    </div>

                    <div class="formItem">
                        <div class="ta-r formLab">
                            <label class="inl-b">认证类型</label>
                        </div>
                        <div class="formArea">
                            <span class="c02 in-b j-phone">${w.Authentication}</span>
                        </div>
                    </div>

                    <div class="personal-type">

                        <div class="formItem">
                            <div class="ta-r formLab">
                                <label class="inl-b">手持身份证正面</label>
                            </div>
                            <div class="aa-img">
                                <p>
                                    <img id="xmTanImg" class="xmtan" src="image/${w.eimage}"/>
                                </p>
                            </div>
                        </div>
                    </div>

                    <div class="formAgree">
                        <input id="xmlyReg" class="icon-checkbox" checked="checked" type="checkbox">
                        <label for="xmlyReg" class="regCheckLab c10"><span class="checkIcon"></span>我已看过并同意</label>
                        <a href="https://www.ximalaya.com/verify/agreement" target="_blank">《喜马拉雅网络服务使用协议》</a>
                    </div>

                        <div class="tc">
                            <a href="javascript:void(0);" class="btn-com btn-lg btn-red j-submit"
                               onclick="meber_shenhe(this,${w.Fmuid})" title="通过">通过</a>
                            <a href="javascript:void(0);" class="btn-com btn-lg btn-red j-submit"
                               onclick="meber_shenhe(this,${w.Fmuid})" title="未通过">未通过</a>
                        </div>

                </c:forEach>
        </div>
    </div>
</div>
<script src="verifystar_files/soundmanager2.js"></script>
<script src="verifystar_files/almond.js"></script>
<script src="verifystar_files/frame.js"> </script>
<script src="verifystar_files/h.js" type="text/javascript"></script>
<link rel="styleSheet" type="text/css" href="verifystar_files/supportBtn.css">
        <script>
            function meber_shenhe(obj, id) {
                if ($(obj).attr('title') == '通过') {
                    layer.confirm('确认通过吗？', function (index) {
                        window.location.replace('fmuser/update_shenhe?fmuid=' + id + '&shenhe=1');
                    })
                }
                else {
                    layer.confirm('确认未通过吗？', function (index) {
                        window.location.replace('fmuser/update_shenhe?fmuid=' + id + '&shenhe=0');
                    })

                }
            }
        </script>
    </div>
</div>
</body>
</html>
