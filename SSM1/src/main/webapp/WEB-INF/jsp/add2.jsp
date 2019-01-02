<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8" errorPage="fail.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>

    <title>学生选课页面 - 编辑页面</title>
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
            <h3 class="panel-title">学生选课</h3>
        </div>
        <div class="panel-body">

            <form method="post" action="/addSCourse" role="form">
                <table class="addTable">
                    <%--<tr>--%>
                        <%--<td>ID：</td>--%>
                        <%--<td><input type="text" name="id" id="id" placeholder="请在这里输入ID"></td>--%>
                    <%--</tr>--%>
                        <tr>
                            <td>学号：</td>
                            <td><input type="text" name="student_id" id="student_id" placeholder="请在这里输入学号"></td>
                        </tr>
                    <tr>
                        <td>课程号：</td>
                        <td><input type="text" name="course_id" id="course_id" placeholder="请在这里输入课程号"></td>
                    </tr>
                        <tr>
                            <td>成绩：</td>
                            <td><input type="text" name="mark" id="mark" placeholder="请在这里输入成绩"></td>
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