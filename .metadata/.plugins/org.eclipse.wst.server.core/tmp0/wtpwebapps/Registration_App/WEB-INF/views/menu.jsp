<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<div>
		<a href="SaveStudent"><button
				class="mb-2 mt-2 ml-2 mr-2 btn btn-primary">New
				Registration</button></a> <br>
	</div>
	<div>
		<a href="all_reg"><button class="mb-2 ml-2 mr-2 btn btn-primary">Show
				Registration</button></a>
	</div>
	<div class="text-right">
		<form action="logOut" method="post">
			<button type="submit" value="logout"
				class="ml-2 mr-2 mb-2 btn btn-primary">LogOut</button>
		</form>
	</div>

</body>
</html>