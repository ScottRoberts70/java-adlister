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
    <%@include file="/partials/header.jsp"%>
    <%@ include file="/partials/navbar.jsp" %>
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
<div id = frm>
    <h2>Please enter username and password</h2>
<form action="login.jsp" method="POST">
    <label for="username">Username</label>
    <input type="text" id="username" placeholder="Enter UserName" name="username" required>
    <label for="password">Password</label>
    <input type="password" id="password" placeholder="Enter Password" name="password" required>
    <button type="submit">Login</button>
</form>
    <div>
        <p><span>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Alias, consectetur, voluptatibus. Doloribus eaque explicabo hic laboriosam maiores, minus nisi nostrum, quibusdam quos ratione reiciendis reprehenderit sed suscipit vel veniam voluptas!</span><span>Consequuntur maxime molestiae voluptates? Dolorem eum nostrum nulla, quam quo repellendus saepe tempore vero vitae. Consequatur dolore, ducimus eligendi error, ex excepturi inventore, ipsam laudantium nesciunt porro quisquam reprehenderit! Quisquam.</span><span>At aut consequatur cumque explicabo illum maxime obcaecati perferendis provident rem repellendus. Adipisci iusto labore maxime porro ut velit. Dolorum enim fugit nemo nihil nulla sequi voluptatum! Architecto dolores, nemo.</span>
        </p>
    </div>
</div>
</body>
</html>
