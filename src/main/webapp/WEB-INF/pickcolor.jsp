<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Color Picker</h1>
<form action="viewcolor" method="post">
    <label for="color">What is your favorite color?</label>
    <input type="text" id="color" name="color"/>
    <button type="submit">Submit</button>
</form>
</body>
</html>
