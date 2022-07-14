<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: scottroberts
  Date: 7/13/22
  Time: 4:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form Submission</title>
    <style><%@include file="/css/main.css"%></style>
    <%@ include file="partials/navbar.jsp" %>
</head>
<body>

<%
    String username;
    username = request.getParameter("username");
    String password;
    password = request.getParameter("password");
    if (
            username != null
    && password != null
    && username.equalsIgnoreCase("username")
    && password.equalsIgnoreCase("password")
    ) {response.sendRedirect("/profile.jsp");}%>
<h1>Top Secret Login Page</h1>
<div id = frm>
    <h2>Please enter username and password</h2>
<form action="login.jsp" method="POST">
    <label for="username">Username</label>
    <input type="text" id="username" placeholder="Enter UserName" name="username" required>
    <label for="password">Password</label>
    <input type="password" id="password" placeholder="Enter Password" name="password" required>
    <button type="submit">Login</button>
</form>
</div>
</body>
</html>
