<%@ page language="java" import="java.util.*" pageEncoding="utf-8" errorPage="fail.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <base href="<%=basePath%>">
    <title>学生管理界面</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <link href="xxxx/css/demo.css" rel="stylesheet" type="text/css" />
    <script src="xxxx/js/jquery-1.10.2.min.js" type="text/javascript"></script>
    <script src="xxxx/js/jquery.fancy-textbox.js" type="text/javascript"></script>
    <link href="xxxx/css/font-awesome.css" rel="stylesheet" type="text/css" />
    <link href="xxxx/css/font-awesome.css" rel="stylesheet" type="text/css" />
    <link href="xxxx/css/fancy-textbox.css" rel="stylesheet" type="text/css" />

    <!--[if IE]>
    <link rel="stylesheet" type="text/css" href="xxxx/css/fancy-textbox-ie.css"/>
    <![endif]-->
    <script type="text/javascript">
        $(document).ready(function () {
            $('input').ftext();
        });
    </script>
    <script src="/js/jquery-1.11.2.min.js" language="javascript"></script>
    <style type="text/css">
        td{text-align: center;}
        div{height: 1.5em;}
    </style>
    <script type="text/javascript">
        //定义个方法提醒用户确定要删除吗？方法的参数就是要删除的id名
    </script>
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
<body >
<div >
    <h1>
        学生信息管理系统</h1>
    <h2>
        学生信息管理界面</h2>
</div>
<br>
<br>
<br>
<br>
<br>
<div class="demos">
    <ul>
        <li><a href="/manage">学生查询</a></li>
        <li><a href="/add">添加学生</a></li>
        <li><a href="/course">课程信息管理界面</a></li>
        <li><a href="/scourse">学生选课信息界面</a></li>
        <li><a href="/outlogin">退出</a></li>

    </ul>
</div>
<br>
<br>
<hr>
<br>

<div >
    <center>
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
    <c:forEach items="${requestScope.pagemsg.lists}" var="student" varStatus="status">
        <tr>
            <!-- 和po类里的属性名一样 -->
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
    </c:forEach>
</table>
        <table  border="0" cellspacing="0" cellpadding="0"  width="900px">
            <tr>
                <td class="td2">
                    <span>第${requestScope.pagemsg.currPage }/ ${requestScope.pagemsg.totalPage}页</span>&nbsp;&nbsp;
                    <span>总记录数：${requestScope.pagemsg.totalCount }&nbsp;&nbsp;每页显示:${requestScope.pagemsg.pageSize}</span>&nbsp;&nbsp;
                    <span>
       <c:if test="${requestScope.pagemsg.currPage != 1}">
           <a href="${pageContext.request.contextPath }/student1?currentPage=1">[首页]</a>&nbsp;&nbsp;
           <a href="${pageContext.request.contextPath }/student1?currentPage=${requestScope.pagemsg.currPage-1}">[上一页]</a>&nbsp;&nbsp;
       </c:if>

       <c:if test="${requestScope.pagemsg.currPage != requestScope.pagemsg.totalPage}">
           <a href="${pageContext.request.contextPath }/student1?currentPage=${requestScope.pagemsg.currPage+1}">[下一页]</a>&nbsp;&nbsp;
           <a href="${pageContext.request.contextPath }/student1?currentPage=${requestScope.pagemsg.totalPage}">[尾页]</a>&nbsp;&nbsp;
       </c:if>
   </span>
                </td>
            </tr>
        </table>
    </center>
    <br>

</div>
</body>
</html>