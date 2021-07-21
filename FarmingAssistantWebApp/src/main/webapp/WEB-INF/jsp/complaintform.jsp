<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">
<title>Complaint Page</title>
</head>
<body>
	<ul>
	  <li><a href="/farmer/farmerhome">Home</a>
	   <a href="">Crop Advertisement</a>
	   <a href="/farmer/complaint">Complaints</a>
	   <a href="/farmer/findfarmers">Find Farmers</a>
	   <a href="/farmer/findsuppliers">Find Suppliers</a>
	   <a href="/">Logout</a></li>
	   
	</ul>
	
	<h3>New Complaint</h3>
	
	<form:form action="submitcomplaint" method="post" modelAttribute="complaint">
		
		<form:label path="category">My complaint relates: </form:label></br></br>
			<form:radiobutton path="category" value = "CROPS" label = "CROPS"/></br>
			<form:radiobutton path="category" value = "SUPPLIERS" label = "SUPPLIERS"/></br>
			<form:radiobutton path="category" value = "TECHNICAL" label = "TECHNICAL"/></br>
			</br>
			</br>
		
		<form:textarea path="details" rows = "8" cols = "40"/>
		
	
		<form:button>Submit</form:button>
	
	
	
	
	</form:form>
</body>
</html>