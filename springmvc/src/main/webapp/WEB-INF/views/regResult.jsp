<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration Response</title>
</head>
<body>
	<h2>User Registered Successfully</h2>
	<%=request.getAttribute("user") %>
</body>
</html>