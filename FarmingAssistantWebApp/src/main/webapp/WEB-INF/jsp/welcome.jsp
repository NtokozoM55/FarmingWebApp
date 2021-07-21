<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h1>WELCOME TO THE FARMING ASSISTANT WEB SERVICE</h1>
	
	<h3>If you are new here, Welcome and please:</h3>
	<h3> <a href="/farmerregister">Register as a FARMER</a></h3>
	<h3><a href="/supplierregister">Register as a SUPPLIER</a></h3>
        <h3>Welcome back if you are not new. Please <a href="/login">Login</a></h3>
</body>
</html>