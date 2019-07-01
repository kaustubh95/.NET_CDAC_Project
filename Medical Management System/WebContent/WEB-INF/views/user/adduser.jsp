<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="d" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  <h3 align="center" style="color: red;">${requestScope.status}</h3>-->
	<d:form method="POST" modelAttribute="user">
		<table style="background-color: cyan; margin: auto;">
		
			<tr>
				<td>Enter loginName</td>
				<td><d:input path="loginName" /></td>
			</tr>
			<tr>
				<td>Enter password</td>
				<td><d:input path="password"/></td>
			</tr>
			
			<tr>
				<td>Enter fname</td>
				<td><d:input path="fname" /></td>
			</tr>
			
			<tr>
				<td>Enter lname</td>
				<td><d:input path="lname" /></td>
			</tr>
			<tr>
				<td>Enter logintype</td>
				<td><d:input path="logintype" /></td>
			</tr>
			<tr>
				<td>Enter contactno</td>
				<td><d:input path="contactno" /></td>
			</tr>
			<tr>
			<tr>
				<td>Enter regdate</td>
				<td><d:input path="regdate" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit" /></td>
			</tr>
		</table>
	</d:form>

</body>
</html>