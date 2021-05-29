<%--
  Created by IntelliJ IDEA.
  User: 30362
  Date: 2021/5/28
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>图片展示页面</title>
    <style>
        #tab1 tr:hover{
            background-color: #00FFFF;
        }
    </style>
</head>
<body>
<h1 align="center">Picture</h1>
<%--引入add.jsp--%>
<%@include file="add.jsp"%>

<table id="tab1" border="1" cellpadding="15" cellspacing="0" align="center" bgcolor="#7fffd4">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>图片|<button onclick="addP()">上传图片</button></th>
    </tr>

    <c:forEach var="p" items="${sessionScope.pictures}" varStatus="vs">
        <tr
                <c:if test="${vs.index%2==0}">
                    bgcolor="#ffe4b5"
                </c:if>
        >
            <td>${p.id}</td>
            <td>${p.name}</td>
            <td>${p.bigHead}</td>
        </tr>
    </c:forEach>
</table>
<script>
    function addP() {
        addForm.style.display='block';
    }
</script>
</body>
</html>
