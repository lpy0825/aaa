<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <base href="<%=basePath%>">
    <meta charset="UTF-8">
    <title>黑狗</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <script src="/js/jquery-3.1.1.js"></script>
    <script type="text/javascript" src="./lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="./js/xadmin.js"></script>

</head>
<body>

</body>
<script>
    $(function() {
        $.ajax({
            url:'https://api.weibo.com/2/users/show.json',
            type:'get',
            data:{
                'uid':'5597926437',
                'access_token':'2.00F51qGGBmARaC5541dc5ab8YhnrkC'
            },
            dataType:'jsonp',
            success:function(data){
                alert(JSON.stringify(data));
            }
        })
        }
    )
</script>
</html>
