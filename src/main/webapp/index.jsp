<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><%= "Secret Site" %></title>
    <style><%@include file="/css/main.css"%></style>
</head>
<body>
    <c:if test="true">
        <h1>This page under construction</h1>
    </c:if>
    <c:if test="false">
        <h1>for real...</h1>
    </c:if>
</body>
</html>
