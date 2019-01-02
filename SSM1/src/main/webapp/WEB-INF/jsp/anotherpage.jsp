<%@ page language="java" contentType="text/html; charset=UTF-8" errorPage="fail.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>查找结果</title>
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
<body background="/images/2.jpg">
<center>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <table border="1" cellpadding="10" cellspacing="0" class="table1" bgcolor="#2ba3d4">
<tr>
    <th>学号</th>
    <th>学生姓名</th>
    <th>性别</th>
    <th>专业</th>
    <th>年龄</th>
    <th>联系电话</th>
    <th>生日</th>
    <th>操作</th>
</tr>
    <tr>
    <td>${student.student_id}</td>
    <td>${student.name }</td>
    <td>${student.sex }</td>
    <td>${student.major}</td>
    <td>${student.age }</td>
    <td>${student.telephone_number}</td>
    <td><fmt:formatDate value="${student.birthday }" pattern="yyyy-MM-dd"/></td>
    <td><!-- 用超链接传值方式把userid的值传给控制层 -->
        <button onclick="window.location.href='/update?student_id=${student.student_id}'" >修改</button>
        <button onclick="window.location.href='/deleteStudent?student_id=${student.student_id}'">删除</button>
    </td>
    </tr>
        </table >
</center>
</body>
</html>
