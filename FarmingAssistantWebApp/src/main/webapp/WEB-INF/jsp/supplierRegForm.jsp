<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
</head>
<body>
	
	<h2>Supplier Registration</h2>
	
	<form:form  action="supplierregister"  method="post" modelAttribute = "user">
	
		<form:label path="username">Email: </form:label></br>
		<form:input path="username"/></br>
		
		<form:label path="lastname">Last Name: </form:label></br>
		<form:input path="lastname"/></br>
		
		<form:label path="firstname">First Name: </form:label></br>
		<form:input path="firstname"/></br>
		
		<form:label path="phonenumber">Phone Number: </form:label></br>
		<form:input path="phonenumber"/></br>
		
		<form:label path="address">Address: </form:label></br>
		<form:input path="address"/></br>

		
		<form:label path="password">Password: </form:label></br>
		<form:input path="password"/></br>
		
		
		
		</br><form:button>Register</form:button>
		
	</form:form>
</body>
</html>