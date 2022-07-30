<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
	<tr>
	<th>Id</th>
	<th>Name</th>
	<th>Mail ID</th>
	</tr>
		<c:forEach items="${users}" var="user">
		<td>
		${user.id}
		</td>
		<td>
		${user.name}
		</td>
		<td>
		${user.email}
		</td>
		<br>
	</c:forEach>
	</table>
</body>
</html>