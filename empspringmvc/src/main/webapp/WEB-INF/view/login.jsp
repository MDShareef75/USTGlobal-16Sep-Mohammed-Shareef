<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>${msg}</h3>
	<fieldset>
		<legend>LOGIN</legend>
		<form action="./login" method="post">
			<table>
				<tr>
					<td>ID:</td>
					<td><input type="number" name="id"></td>
				</tr>
				<tr>
					<td>PASSWORD:</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td><input type="reset" name="Reset"></td>
					<td><input type="submit" name="Login"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	<a href="./register">Click here to register</a>
</body>
</html>