<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html lang="en">
<head>
    <base href="<%=basePath%>">
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <title>500</title>
    <link rel="stylesheet" href="./CSS/style.css">
    <link rel="stylesheet" href="./CSS/style-responsive.css">
    <link rel="stylesheet" href="./CSS/bootstrap.min.css">


    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <![endif]-->
</head>

<body class="error-page">

<section>
    <div class="container ">

        <section class="error-wrapper text-center">
            <h1><img alt="" src="Images/500-error.png"></h1>
            <h2> 网页未找到</h2>
            <h3>我们找不到这个页面</h3>
            <a class="back-btn" href="admin/adminlogin"> Home</a>
        </section>
    </div>
</section>

<!-- Placed js at the end of the document so the pages load faster -->
<script src="./js/jquery-3.1.1.js"></script>
<script src="./js/bootstrap.min.js"></script>
<script src="./js/modernizr.min.js"></script>


<!--common scripts for all pages-->
<!--<script src="js/scripts.js"></script>-->

</body>
</html>

