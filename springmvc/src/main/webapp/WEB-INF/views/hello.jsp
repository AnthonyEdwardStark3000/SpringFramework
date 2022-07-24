<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Say Hello</title>
</head>
<body>
	<h2>Employee Details</h2>
	<%
		Integer id = (Integer) request.getAttribute("id");
	String name = (String) request.getAttribute("name");
	Integer sal = (Integer) request.getAttribute("salary");
	out.println("ID :" + id);
	out.println(" Name :" + name);
	out.println("Salary he earns per hour :" + sal + " $");
	%>
	<br> 
	ID :
	<b>${id}</b>
	<br> Name :
	<b>${name}</b>
	<br> Salary he earns per hour :
	<b>${salary}</b>
	<br>
</body>
</html>