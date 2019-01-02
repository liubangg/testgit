<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8" errorPage="fail.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>

    <title>课程管理页面 - 编辑页面</title>
</head>

<body style=" background:url(/images/2.jpg);">
<center>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
<div class="addDIV" >

    <div class="panel panel-success">
        <div class="panel-heading">
            <h3 class="panel-title">添加课程</h3>
        </div>
        <div class="panel-body">

            <form method="post" action="/addCourse" role="form">
                <table class="addTable">
                    <%--<tr>--%>
                        <%--<td>ID：</td>--%>
                        <%--<td><input type="text" name="id" id="id" placeholder="请在这里输入ID"></td>--%>
                    <%--</tr>--%>
                    <tr>
                        <td>课程号：</td>
                        <td><input type="text" name="course_id" id="course_id" placeholder="请在这里输入课程号"></td>
                    </tr>
                    <tr>
                        <td>课程名：</td>
                        <td><input type="text" name="course_name" id="course_name" placeholder="请在这里输入课程名"></td>
                    </tr>
                        <tr>
                            <td>学分：</td>
                            <td><input type="text" name="credit" id="credit" placeholder="请在这里输入学分"></td>
                        </tr>
                    <tr class="submitTR">
                        <td colspan="2" align="center">
                            <button type="submit" class="btn btn-success">提 交</button>
                        </td>

                    </tr>

                </table>
            </form>
        </div>
    </div>

</div>
</center>
</body>
</html>