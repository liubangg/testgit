<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/27
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="fail.jsp" %>

<!DOCTYPE html>
<html lang="en" class="no-js">

<head>

    <meta charset="utf-8">
    <title>登录页面</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
    <link rel="stylesheet" href="/assets/css/reset.css">
    <link rel="stylesheet" href="/assets/css/supersized.css">
    <link rel="stylesheet" href="/assets/css/style.css">
    <!-- Javascript -->
    <script src="/assets/js/jquery-1.8.2.min.js"></script>
    <script src="/assets/js/supersized.3.2.7.min.js"></script>
    <script src="/assets/js/supersized-init.js"></script>
    <script src="/assets/js/scripts.js"></script>
</head>

<body>

<div class="page-container">
    <h1>学生信息管理系统</h1>
    <form action="/checkLogin" method="post">
        <input type="text" name="username" class="username" placeholder="Username">
        <input type="password" name="password" class="password" placeholder="Password">
        <button type="submit">登录</button>
        <button  onclick="window.location.href='/regist'">注册</button>
    </form>
</div>

</body>
</html>
