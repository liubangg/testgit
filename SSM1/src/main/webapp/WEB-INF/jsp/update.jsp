
<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8" errorPage="fail.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<head>

    <title>修改学生信息</title>
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
            <h3 class="panel-title">根据学号修改学生信息</h3>
        </div>
        <div class="panel-body">

            <form method="post" action="/updateStudent?student_id=${student.student_id}" role="form">
                <table class="addTable">
                    <tr>
                        <td>姓名：</td>
                        <td><input type="text" name="name" id="name" placeholder="请在这里输入名字"></td>
                    </tr>
                    <tr>
                    <td>性别：</td>
                    <td><input type="radio" class="radio radio-inline" name="sex" value="男"> 男
                        <input type="radio" class="radio radio-inline" name="sex" value="女"> 女
                    </td>
                    </tr>
                    <tr>
                        <td>专业：</td>
                        <td><input type="text" name="major" id="major" placeholder="请在这里输入专业"></td>
                    </tr>
                    <tr>
                        <td>年龄：</td>
                        <td><input type="text" name="age" id="age" placeholder="请在这里输入年龄"></td>
                    </tr>
                    <tr>
                        <td>联系电话：</td>
                        <td><input type="text" name="telephone_number" id="telephone_number" placeholder="请在这里输入年龄"></td>
                    </tr>
                    <tr>
                        <td>出生日期：</td>
                        <td><input type="date" name="birthday" id="birthday" placeholder="请在这里输入出生日期"></td>
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
