<%--
  Created by IntelliJ IDEA.
  User: 86265
  Date: 2018/1/30
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="fail.jsp" %>
<!DOCTYPE html>
<html lang="en" class="no-js">

<head>

    <meta charset="utf-8">
    <title>用户注册页面</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- CSS -->
    <!--<link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>-->
    <link rel="stylesheet" href="/assets/css/reset.css">
    <link rel="stylesheet" href="/assets/css/supersized.css">
    <link rel="stylesheet" href="/assets/css/style.css">

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
        <!--<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>-->
    <![endif]-->

</head>

<body>

<div class="page-container">
    <h1>注册页面</h1>
    <form action="/doRegist " method="post">
        <input type="text" name="username" class="username" placeholder="Username">
        <input type="password" name="password" class="password" placeholder="Password">
        <button type="submit">注册</button>
    </form>
</div>
<!-- Javascript -->
<script src="/assets/js/jquery-1.8.2.min.js"></script>
<script src="/assets/js/supersized.3.2.7.min.js"></script>
<script src="/assets/js/supersized-init.js"></script>
<script src="/assets/js/scripts.js"></script>

</body>

</html>