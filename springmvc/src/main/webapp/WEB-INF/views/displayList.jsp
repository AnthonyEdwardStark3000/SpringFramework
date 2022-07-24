<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.Mr_stark.spring.springmvc.dto.Employee,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Displaying Lists</title>
</head>
<body>
	<%
	List<Employee> employees = (List<Employee>)request.getAttribute("employees");
	for(Employee e: employees){
		out.println("ID: "+e.getId()+"\n");
		out.println("Name: "+e.getName()+"\n");
		out.println("Salary: "+e.getSalary()+"\n");
	}
	%>
</body>
</html>