<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>REGISTER</legend>
		<form action="./register" method="post">
			<table>
				<tr>
					<td>NAME:</td>
					<td><input type="name" name="name"></td>
				</tr>
				<tr>
					<td>EMAIL:</td>
					<td><input type="email" name="email"></td>
				</tr>
				<tr>
					<td>PASSWORD:</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>DOJ:</td>
					<td><input type="date" name="doj"></td>
				</tr>
				<tr>
					<td>GENDER:</td>
					<td><select name="gender" required="required">
							<option selected="disabled" >******SELECT******</option>
							<option value="M">Male</option>
							<option value="F">Female</option>
					</select>
					</td>
				</tr>

				<tr>
					<td><input type="reset" value="Reset"></td>
					<td><input type="submit" value="Register"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	<a href="./login">Click Here to Login</a>
</body>
</html> --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>Register</legend>
		<form action="./register" method="post">
			<table>
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><input type="email" name="email"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>Doj:</td>
					<td><input type="date" name="doj"></td>
				</tr>
				<tr>
					<td>Gender:</td>
					<td><select name="gender" required="required">
							<option>-----Select----</option>
							<option value="M">Male</option>
							<option value="F">Female</option>
					</select></td>
				</tr>
				<tr>
					<td><input type="reset" value="Reset"></td>
					<td><input type="submit" value="Register"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	<a href="./login">Click here to Login</a>
</body>
</html>