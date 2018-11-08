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
    <title>个人认证</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <link rel="canonical" href="http://www.ximalaya.com/verify/personal/new">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
    <meta content="webkit" name="renderer">
    <script async="" src="verifypersonal_files/analytics.js"></script>
    <script src="verifypersonal_files/xmlog.js"></script>

    <script src="verifypersonal_files/redirect.js"></script>
    <script src="verifypersonal_files/recordchannelfrom.js"></script>
    <link href="verifycompany_files/web_002.css" rel="stylesheet" type="text/css">
    <link href="verifypersonal_files/web.css" rel="stylesheet" type="text/css">
    <link href="verifypersonal_files/web_002.css" rel="stylesheet" type="text/css">
    <script src="verifypersonal_files/main.js" id="kf5-provide-supportBox" kf5-domain="ximalaya.kf5.com" charset="utf-8"></script>
    <script src="verifypersonal_files/share.js"></script>
    <link rel="stylesheet" href="verifypersonal_files/share_style1_16.css">
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
                    <c:forEach items="${pidlist}" var="p">

                        <header class="typeTit">个人审核</header>
                        <div class="step3 stepType">
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
                        </div>
                        <header class="formTit">身份信息</header>
                        <div id="not-ali-type" class="">
                            <div class="formItem">
                                <div class="ta-r formLab">
                                    <label class="inl-b need">个人名称</label>
                                </div>
                                <div class="formArea">
                                    <div class="formArea">
                                        ${p.name}
                                    </div>
                                    <span class="c09 mgl-10 inl-b hidden j-tips">请输入正确的名字</span>
                                    <p class="c02 mgt-15">因平台有付费业务，您的姓名需与提现支付宝账户的真实姓名保持一致，否则将无法提现</p>
                                </div>
                            </div>

                            <div class="formItem">
                                <div class="ta-r formLab">
                                    <label class="inl-b need">身份证号</label>
                                </div>
                                <div class="formArea">
                                    ${p.eid}
                                </div>
                            </div>

                            <div class="formItem">
                                <div class="ta-r formLab">
                                    <label class="inl-b">认证类型</label>
                                </div>
                                <div class="formArea">
                                    <span class="c02 in-b j-phone">${p.Authentication}</span>
                                </div>
                            </div>

                            <div class="formItem">
                                <div class="ta-r formLab vertp">
                                    <label class="inl-b need">身份证照:</label>
                                </div>
                                <div class="aa-img">
                                    <p>
                                        <img id="xmTanImg" class="xmtan" src="image/${p.eimage}"/>
                                    </p>
                                </div>
                            </div>
                            <div class="formAgree">
                                <input id="xmlyReg" class="icon-checkbox" checked="checked" type="checkbox">
                                <label for="xmlyReg" class="regCheckLab c10"><span class="checkIcon"></span>我已看过并同意</label>
                                <a href="https://www.ximalaya.com/verify/agreement" target="_blank">《喜马拉雅网络服务使用协议》</a>
                            </div>
                            <div class="tc">
                                <a href="javascript:void(0);" class="btn-com btn-lg btn-red j-submit"
                                   onclick="meber_shenhe(this,${p.Fmuid})" title="通过">通过</a>
                                <a href="javascript:void(0);" class="btn-com btn-lg btn-red j-submit"
                                   onclick="meber_shenhe(this,${p.Fmuid})" title="未通过">未通过</a>
                            </div>
                        </div>
                </div>
                    </c:forEach>
            </div>
        </div>
    </div>
</div>
<script src="verifypersonal_files/soundmanager2.js"></script>
<script src="verifypersonal_files/almond.js"></script>
<script src="verifypersonal_files/frame.js"> </script>
<script src="verifypersonal_files/h.js" type="text/javascript"></script>
<link rel="styleSheet" type="text/css" href="verifypersonal_files/supportBtn.css">

<script>
    function meber_shenhe(obj, id) {
        if ($(obj).attr('title') == '通过') {
            layer.confirm('确认通过吗？', function (index) {
                window.location.replace('fmuser/update_shenhe?fmuid=' + id + '&shenhe=1');
            })
        }
        else {
            layer.confirm('确认未通过吗？', function (index) {
                window.location.replace('jsp/verifyno.jsp');
            })

        }
    }
</script>
</body>
</html>
