<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" >
</head>
<body>
<h3 style="text-align: center">用户登录</h3>
<form id="frmLogin" action="login" method="post">
    <table class="tb" border="1" cellpadding="10" style="margin: 0px auto">
        <tr>
            <td align="center">账号</td>
            <td><input id="username" type="text" name="username"></td>
        </tr>
        <tr>
            <td align="center">密码</td>
            <td><input id="password" type="password" name="password"/></td>
        </tr>
        <tr align="center">
            <td colspan="2">
                <input type="submit" value="登录" onclick="check()"/>
                <input type="reset" value="重置"/>
            </td>
        </tr>
    </table>
</form>
</body>
<%--这个不生效，得加/script 后缀
<script type="text/javascript" src="js/check.js" />--%>
<script type="text/javascript" src="js/check.js"></script>
</html>
