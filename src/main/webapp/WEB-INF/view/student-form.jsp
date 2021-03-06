<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 11-07-2018
  Time: 07:18
  To change this template use File | Settings | File Templates.
--%>
<%@page isELIgnored="false"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title>Student Registration Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">
        First Name: <form:input path="firstName" />
		<br>
		<br>
          Last Name: <form:input path="lastName" />
		<br>
		<br>

        Country:
        <form:select path="country">
			<form:options items="${student.countryOptions}" />
		</form:select>
		<br>
		<br>
        Favourite Language:
        Java <form:radiobutton path="favouriteLanguage" value="Java" />
        C# <form:radiobutton path="favouriteLanguage" value="C#" />
        PHP <form:radiobutton path="favouriteLanguage" value="PHP" />
        Ruby <form:radiobutton path="favouriteLanguage" value="Ruby" />
		<br>
		<br>
        Linux <form:checkbox path="operatingSystems" value="Linux" />
        Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
        MS Windows <form:checkbox path="operatingSystems"
			value="Ms Windows" />
        Linux <form:checkbox path="operatingSystems" value="Linux" />

		<br>
		<br>
		<input type="submit" value="Submit">
	</form:form>
</body>
</html>
