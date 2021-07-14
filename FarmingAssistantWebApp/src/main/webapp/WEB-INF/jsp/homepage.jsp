<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Farmer Page</title>
</head>
<body>
	<ul>
	  <li><a href="/farmer/">Home</a>
	   <a href="">Crop Advertisement</a>
	   <a href="/farmer/complaint">Complaints</a>
 	   <a href="/farmer/findfarmers">Find Farmers</a>
	   <a href="/farmer/findsuppliers">Find Suppliers</a></li>
	</ul>
	<a class="weatherwidget-io" href="https://forecast7.com/en/n25d7528d23/pretoria/" data-label_2="WEATHER" data-icons="Climacons Animated" data-theme="sky" >WEATHER</a>
	<script>
	!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0];if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src='https://weatherwidget.io/js/widget.min.js';fjs.parentNode.insertBefore(js,fjs);}}(document,'script','weatherwidget-io-js');
	</script>
</body>
</html>