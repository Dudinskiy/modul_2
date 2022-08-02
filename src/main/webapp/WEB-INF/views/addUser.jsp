<%--
  Created by IntelliJ IDEA.
  User: Александр
  Date: 28.07.2022
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add student info</title>
</head>
<body>
<h1>Add student info:</h1>
<form:form modelAttribute="user" action="/module2/user/saveUser" method="post">
    <table>
        <tr>
            <td>Enter name:</td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Save user"></td>
        </tr>
    </table>
</form:form>
</body>
</html>
