<%--
  Created by IntelliJ IDEA.
  User: scottroberts
  Date: 7/15/22
  Time: 10:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>
<div>
  <form action="pizza-order" method="post">
    <label for="fname">First name:</label><br>
    <input type="text" id="fname" name="fname"><br>
    <label for="lname">Last name:</label><br>
    <input type="text" id="lname" name="lname"><br>
    <label for="deliveryAdd">Delivery Address</label><br>
    <input type="text" id="deliveryAdd" name="deliveryAdd"><br>
    <label for="crust">Choose a Crust:</label><br>
    <select name="crust" id="crust">
      <option value="Thin">Thin</option>
      <option value="Stuffed">Stuffed</option>
      <option value="Chicago">Chicago</option>
      <option value="Hand Tossed">Hand Tossed</option>
    </select>
    <label for="sauce">Choose a Sauce:</label>
    <select name="sauce" id="sauce">
      <option value="Regular">Regular</option>
      <option value="Sweet">Sweet</option>
      <option value="White">White</option>
      <option value="Veggie">Veggie</option>
    </select>
    <label for="size">Choose a Size:</label>
    <select name="size" id="size">
      <option value="Personal">Personal</option>
      <option value="Small">Small</option>
      <option value="Medium">Medium</option>
      <option value="Large">Large</option>
      <option value="Party">Party</option>
    </select>
    <br>
    <input type="checkbox" id="pepperoni" name="toppings" value="Pepperoni">
    <label for="pepperoni"> Pepperoni</label><br>
    <input type="checkbox" id="sausage" name="toppings" value="Sausage">
    <label for="sausage">Sausage</label><br>
    <input type="checkbox" id="cheese" name="toppings" value="Cheese">
    <label for="cheese">Cheese</label><br>
    <input type="submit" value="Submit">
  </form>
</div>
</body>
</html>
