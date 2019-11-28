<%@page import="com.ust.webapp.dto.EmployeeInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
	EmployeeInfo info = (EmployeeInfo) request.getAttribute("info");
%>
<body>
	<a href='./home'>HOME</a>
	<a style='float: right' href='#'>LOGOUT</a>

	<%if(info != null){ %>
	<fieldset>
	<legend>EMPLOYEE INFO</legend>
	<table align='center' border='1'>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>EMAIL</th>
		</tr>

		<tr>
			<td><%=info.getId()%></td>
			<td><%=info.getName()%></td>
			<td><%=info.getEmail()%></td>
		</tr>
	</table>
	<%}else{ %>
	<h1>NO DATA FOUND</h1>
	<%} %>
	</fieldset>
</body>
</html>