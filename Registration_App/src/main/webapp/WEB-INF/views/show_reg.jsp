<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<table class="table table-bordered">
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>City</th>
			<th>Mobile</th>
			<th>Action</th>
		</tr>

		<%
		ResultSet result = (ResultSet) request.getAttribute("res");
		//ResultSet result =(ResultSet)request.getAttribute("res");
		while (result.next()) {
		%>
		<tr>
			<td><%=result.getString(1)%></td>
			<td><%=result.getString(2)%></td>
			<td><%=result.getString(3)%></td>
			<td><%=result.getString(4)%></td>
			<td><a href="delete_reg?email=<%=result.getString(2)%>"><button
						class="btn btn-danger">Delete</button></a> <a
				href="update_reg?email=<%=result.getString(2)%>&mobile=<%=result.getString(4)%>"><button
						class="btn btn-danger">Update</button></a></td>

		</tr>

		<%
		}
		%>
	</table>
</body>
</html>