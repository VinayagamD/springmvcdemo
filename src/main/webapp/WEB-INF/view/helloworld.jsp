<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 04-07-2018
  Time: 01:27
  To change this template use File | Settings | File Templates.
--%>
<%@page isELIgnored="false"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>Hello World of Spring!</title>
</head>
<body>

	<h2>Spring MVC Demo - Home Page</h2>
	<hr>
	Student name:${param.studentName}

	<br>
	<br> The message:${message}
</body>
</html>
