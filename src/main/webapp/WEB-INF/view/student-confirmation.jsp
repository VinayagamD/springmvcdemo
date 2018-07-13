<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 11-07-2018
  Time: 07:23
  To change this template use File | Settings | File Templates.
--%>
<%@page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>

The student is confirmed : ${student.firstName} ${student.lastName}

<br><br>

Country: ${student.country}

<br><br>

Favourite Language: ${student.favouriteLanguage}
</body>
</html>
