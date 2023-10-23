<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>scriptor</title>
</head>
<body>

	<%!public int x = 100;

	public int test() {
		return 10000;
	}%>
	<%
	out.println(test());
	out.println(x);
	%>
</body>
</html>