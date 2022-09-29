<%--
  Created by IntelliJ IDEA.
  User: 靓仔古老板
  Date: 2022/9/26
  Time: 19:27
  Time: 19:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script>
    function zhuce(){
        document.login.action="enroll.jsp";
        document.login.submit();
    }
    </script>
    <title>登录</title>
    <style>

    </style>

</head><link href="css\login.css" rel="stylesheet" type="text/css">
<body>
<div class="content">
    <div style="width: 400px; height: 300px; " class="loginright">
        <div class="loginmar">
            <h2  style="color: black">管理后台登录</h2>
            <span><a href="enroll.jsp">立即注册</a></span>
                <p>账号:<input type="text" name="user"  id="user"  value="" max="10"></p>
                <p>密码:<input type="password" name="pass" id="password" value="" ></p>
                <p><input type="submit" name="submit" id="bth" value="登录"></p>
            <span id="error">${error}</span>
            <script>
                let bth01 = document.getElementById("bth")
                bth01.onclick = function (){
                    let id_str = document.getElementById("user").value;
                    if (id_str == null || id_str == ""){
                        document.getElementById("error").innerHTML="账户不能为空"
                        return;
                    }
                    let pwd_str = document.getElementById("password").value;
                    if (pwd_str == null || pwd_str == ""){
                        document.getElementById("error").innerHTML="密码不能为空"
                        return;
                    }
                    window.location.href = "login?user="+id_str+"&password="+pwd_str;

                }
            </script>
        </div>
    </div>
</div>
</body>
</html>
