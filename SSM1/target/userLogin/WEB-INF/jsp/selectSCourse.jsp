
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" errorPage="fail.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <base href="<%=basePath%>">
    <title>学生选课界面</title>
    <style type="text/css">
        td{text-align: center;}
        div{height: 1.5em;}
    </style>
    <style type="text/css">
        td{text-align: center;}
        .td2{text-align: right;}
        .table1{
            border:1px solid #ddd;
            width:900px;
        }
        thead{
            background-color:lightblue;
        }
    </style>

</head>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<body >
<div >
    <center>
        <table  border="1" cellpadding="10" cellspacing="0" class="table1" bgcolor="#2ba3d4">
            <tr>
                <th>学号</th>
                <th>课程号</th>
                <th>成绩</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${scourses}" var="scourse" varStatus="status">
                <tr>
                    <!-- 和po类里的属性名一样 -->
                    <td>${scourse.student_id}</td>
                    <td>${scourse.course_id }</td>
                    <td>${scourse.mark }</td>
                    <td><!-- 用超链接传值方式把userid的值传给控制层 -->
                        <button onclick="window.location.href='/update2?student_id=${scourse.student_id}&course_id=${scourse.course_id}'" >修改</button>
                        <button onclick="window.location.href='/deleteSCourse?student_id=${scourse.student_id}&course_id=${scourse.course_id}'">删除</button>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </center>
    <br>

</div>
</body>
</html>