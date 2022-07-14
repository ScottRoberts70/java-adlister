<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><%= "Secret Site" %></title>
    <%@include file="/partials/header.jsp"%>
    <%@ include file="/partials/navbar.jsp" %>
</head>
<body>
    <c:if test="true">
        <section class="animated-grid">
            <div class="card"></div>
            <div class="card"></div>
            <div class="card"></div>
            <div class="card"></div>
            <div class="card"></div>
            <div class="card"></div>
            <div class="card"></div>
            <div class="card"></div>
            <div class="card"></div>
            <div class="card"></div>
            <div class="card"></div>
            <div class="card"></div>
            <div class="card img-container"><img src="media/welcome.jpg" alt="A welcome mat"></div>
        </section>
    </c:if>
    <c:if test="false">
        <h1>for real...</h1>
    </c:if>

</body>
</html>
