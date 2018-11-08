<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <title>机构审核</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <link rel="canonical" href="http://www.ximalaya.com/verify/company/new">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
    <meta content="webkit" name="renderer">
    <script async="" src="verifycompany_files/analytics.js"></script>
    <script src="verifycompany_files/xmlog.js"></script>
    <script src="verifycompany_files/redirect.js"></script>
    <script src="verifycompany_files/recordchannelfrom.js"></script>
    <link href="verifycompany_files/web.css" rel="stylesheet" type="text/css">
    <link href="verifycompany_files/web_002.css" rel="stylesheet" type="text/css">
    <script src="verifycompany_files/main.js" id="kf5-provide-supportBox" kf5-domain="ximalaya.kf5.com"
            charset="utf-8"></script>
    <script src="verifycompany_files/share.js"></script>
    <link rel="stylesheet" href="verifycompany_files/share_style1_16.css">
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
                    <c:forEach items="${melistid}" var="m">
                    <header class="typeTit">机构审核</header>
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
                    <header class="formTit">机构信息</header>
                    <div class="formItem">
                        <div class="ta-r formLab">
                            <label class="inl-b need">机构名称</label>
                        </div>
                        <div class="formArea">
                            <div class="formArea">
                                    ${m.mname}
                            </div>
                            <p class="c02 mgt-15">请与营业执照的机构名保持一致；因平台有付费业务，机构名需与提现支付宝账户的真实姓名保持一致，否则将无法提现</p>
                        </div>
                    </div>

                    <div class="formItem">
                        <div class="ta-r formLab">
                            <label class="inl-b need">机构所在地</label>
                        </div>
                        <div class="formArea">
                                ${m.maddrs}
                        </div>
                    </div>

                    <div class="formItem">
                        <div class="ta-r formLab vertp">
                            <label class="inl-b need">营业执照</label>
                        </div>
                        <div class="aa-img">
                            <p>
                                <img id="xmTanImg" class="xmtan" src="image/${m.mimage}"/>
                            </p>
                        </div>
                    </div>
                    <header class="formTit">运营者信息</header>

                    <div class="formItem">
                        <div class="ta-r formLab">
                            <label class="inl-b need">运营者</label>
                        </div>
                        <div class="formArea">
                                ${m.ename}
                        </div>
                    </div>
                    <div class="formItem">
                        <div class="ta-r formLab">
                            <label class="inl-b need">身份证号</label>
                        </div>
                        <div class="formArea">
                                ${m.eid}
                        </div>
                    </div>
                    <div class="formItem">
                        <div class="ta-r formLab vertp">
                            <label class="inl-b need">身份证正面照</label>
                        </div>
                        <div class="aa-img">
                            <p>
                                <img id="xmTanImg2" class="xmtan" src="image/${m.eimage}"/>
                            </p>
                        </div>
                    </div>

                    <div class="formItem">
                        <div class="ta-r formLab">
                            <label class="inl-b need">用户</label>
                        </div>
                        <div class="formArea">
                                ${m.Fmuname}
                        </div>
                    </div>

                    <div class="formItem">
                        <div class="ta-r formLab">
                            <label class="inl-b need">认证类型</label>
                        </div>
                        <div class="formArea">
                                ${m.Authentication}
                        </div>
                    </div>

                    <div class="formAgree">
                        <input id="xmlyReg" class="icon-checkbox" checked="checked" type="checkbox">
                        <label for="xmlyReg" class="regCheckLab c10"><span class="checkIcon"></span>我已看过并同意</label>
                        <a href="https://www.ximalaya.com/verify/agreement" target="_blank">《喜马拉雅网络服务使用协议》</a>
                    </div>
                    <div class="tc">
                        <a href="javascript:void(0);" class="btn-com btn-lg btn-red j-submit"
                           onclick="meber_shenhe(this,${m.Fmuid})" title="通过">通过</a>
                        <a href="javascript:void(0);" class="btn-com btn-lg btn-red j-submit"
                           onclick="meber_shenhe(this,${m.Fmuid})" title="未通过">未通过</a>
                    </div>
                </div>
                </c:forEach>
            </div>
        </div>
    </div>
</div>
<script src="verifycompany_files/soundmanager2.js"></script>
<script src="verifycompany_files/almond.js"></script>
<script src="verifycompany_files/frame.js"></script>
<script src="verifycompany_files/h.js" type="text/javascript"></script>
<link rel="styleSheet" type="text/css" href="verifycompany_files/supportBtn.css">

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
