<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Common tags</title>
</head>
<body>

	<c:set var="name" value="Mike"></c:set>
	<c:out value="${name}"></c:out>
	
	
	<c:set var="val" value="80" />

    <c:if test="${val>100}">
        <p>Welcome you scored greater than 100!</p>
    </c:if>

    <c:if test="${val<100}">
        <p>You Scored less than 100.</p>
    </c:if>
    
    
    <c:forEach var="i" begin="1" end="10">
    Number: <c:out value="${i}"></c:out>
    <br> </c:forEach>
</body>
</html>