
<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8" errorPage="fail.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<head>
    <base href="<%=basePath%>">
    <title>修改选课信息</title>
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
<div class="addDIV">

    <div class="panel panel-success">
        <div class="panel-heading">
            <h3 class="panel-title">根据学号与课程号修改成绩</h3>
        </div>
        <div class="panel-body">

            <form method="post" action="/updateSCourse?student_id=${scourse.student_id}&course_id=${scourse.course_id}" role="form">
                <table class="addTable">
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