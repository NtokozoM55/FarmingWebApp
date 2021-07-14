<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">
<title>Farmers and Suppliers</title>
</head>
<body>
	<ul>
	  <li><a href="/farmer/">Home</a>
	   <a href="">Crop Advertisement</a>
	   <a href="/farmer/complaint">Complaints</a>
	   <a href="/farmer/findfarmers">Find Farmers</a>
	   <a href="/farmer/findsuppliers">Find Suppliers</a></li>
	</ul>
	<div align="center">

		<h1>Farming Assistant App</h1>
		<br />
		<form th:action="@{/}">
			<input type="text" name="keyword" placeholder="Search For Suppliers"  id="keyword" size="50"
				${keyword}/>
			&nbsp; <input type="submit" value="Search" />
				<button onclick="document.getElementById('keyword').value = ''">
     				 Clear
  				</button>
		</form>
		<br />
		<br />

		<table border="1" cellpadding="10">
			<thead>
				<tr>
					<th>Name</th>
					<th>Email</th>
					<th>Address</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listUsers}" var="user" >
				
				<tr>
					<td>${user.name}</td>
					<td>${user.email}</td>
					<td>${user.address}</td>

					<td><a th:href="@{'/edit/' + ${user.id}}">View</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a th:href="@{'/delete/' + ${user.id}}">Contact</a>
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<script type="text/javascript">
	function clearSearch() {
		window.location = "[[@{/}]]";
	}
</script>
</body>
</html>