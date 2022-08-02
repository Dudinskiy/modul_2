<%--
  Created by IntelliJ IDEA.
  User: Александр
  Date: 28.07.2022
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
taglib
<html>
<head>
    <title>Edit student info</title>
</head>
<body>
<h1>Edit student info:</h1>
<form:form modelAttribute="question" action="/module2/user/begin" method="post">
    <table>
        <tr>
            <td>Question:</td>
            <td>${question.question}</td>
        </tr>
        <tr>
            <td>Enter answer:</td>
            <td><form:input path="answer"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Enter"></td>
        </tr>
    </table>
    <p><a href="/module2/user/begin">Next question</a></p>
    <p><a href="/module2/user/finish" >Finish test</a></p>
    <p><a href="/module2/user/result">Get result</a></p>
</form:form>
</body>
</html>
