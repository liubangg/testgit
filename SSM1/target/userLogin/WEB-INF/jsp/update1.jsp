
<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8" errorPage="fail.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<head>

    <title>修改课程信息</title>
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
            <h3 class="panel-title">根据课程号修改课程信息</h3>
        </div>
        <div class="panel-body">

            <form method="post" action="/updateCourse?course_id=${course.course_id}" role="form">
                <table class="addTable">
                    <tr>
                        <td>课程名：</td>
                        <td><input type="text" name="course_name" id="course_name" placeholder="请在这里输入课程名字"></td>
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
