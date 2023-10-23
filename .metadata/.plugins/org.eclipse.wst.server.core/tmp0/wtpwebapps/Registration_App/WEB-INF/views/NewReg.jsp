<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<title>Bootstrap Form Example</title>
<!-- Include Bootstrap CSS link -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<div class="container mt-5">
		<h2>Registration Form</h2>
		<form action="SaveStudent" method="post">
			<div class="form-group">
				<label for="name">Name:</label> <input type="text"
					class="form-control" id="name" name="name"
					placeholder="Enter your name" >
			</div>
			<div class="form-group">
				<label for="email">Email:</label> <input type="email"
					class="form-control" id="email" name="email"
					placeholder="Enter your email" >
			</div>
			<div class="form-group">
				<label for="city">City:</label> <input type="text"
					class="form-control" id="city" name="city"
					placeholder="Enter your city">
			</div>
			<div class="form-group">
				<label for="batch">Mobile:</label> <input type="text"
					class="form-control" id="mobile" name="mobile"
					placeholder="Enter your Mobile No" >
			</div>
			<button type="submit" class="btn btn-primary" value="save">Submit</button>

		</form>


		<%
		if (request.getAttribute("msg") != null) {
			out.println(request.getAttribute("msg"));
		}
		%>
		<br>


	</div>

	<!-- Include Bootstrap JS and Popper.js scripts for optional functionality -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
