<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Complaint Page</title>
</head>
<body>
	<ul>
	  <li><a href="/farmer/">Home</a>
	   <a href="">Crop Advertisement</a>
	   <a href="/farmer/complaint">Complaints</a>
	   <a href="/farmer/users">Find Farmers</a>
	   <a href="/farmer/users">Find Suppliers</a></li>
	</ul>
	<div style="text-align:center">
		<div class="container">
		  <!--<form:form method="post" modelAttribute="complaintForm" action="submitComplaint">
		  -->
		  <form method="get" action="complaintpage.jsp" enctype=text/plain>
		  	<h3>My Complaint Relates: </h3>
	            <input type=radio value = "Crops"/> CROPS 
	            <input type=radio value = "Suppliers"/> SUPPLIERS
	            <input type=radio value = "Technical"/> TECHNICAL  
			
			
		    <h3>Complaint Details: </h3>
		    <textarea id="subject" name="subject" placeholder="Write something.." style="height:200px"></textarea>
			<br></br>
		    <input type="submit" value="Submit">
		  </form>
		  <!--</form:form>-->
		</div>
	</div>
</body>
</html>