<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
<title> home</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">
<link href="static/css/bootstrap.css" rel="stylesheet">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>

<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body>

<nav class="navbar navbar-expand-md navbar-dark bg-dark mb-4">
  <div class="container-fluid">
    <a class="navbar-brand" href="/home">Home</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarCollapse">
      <ul class="navbar-nav me-auto mb-2 mb-md-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">About-us</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Contact us</a>
        </li>
      </ul>
      <form class="d-flex">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>


<div id="carouselExampleDark" class="carousel carousel-dark slide" data-bs-ride="carousel">
  <div class="carousel-indicators">
    <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
    <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="1" aria-label="Slide 2"></button>
    <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="2" aria-label="Slide 3"></button>
  </div>
  <div class="carousel-inner">
    <div class="carousel-item active" data-bs-interval="10000">
      <img src="static/image/image1.jpg" class="d-block w-100" alt="...">
      <div class="carousel-caption d-none d-md-block">
        <h5>First slide label</h5>
        <p>Some representative placeholder content for the first slide.</p>
      </div>
    </div>
    <div class="carousel-item" data-bs-interval="2000">
      <img src="static/image/image2.jpg" class="d-block w-100" alt="...">
      <div class="carousel-caption d-none d-md-block">
        <h5>Second slide label</h5>
        <p>Some representative placeholder content for the second slide.</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="static/image/image3.jpg" class="d-block w-100" alt="...">
      <div class="carousel-caption d-none d-md-block">
        <h5>Third slide label</h5>
        <p>Some representative placeholder content for the third slide.</p>
      </div>
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleDark" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleDark" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>

<div class="container-fluid">

<nav class="navbar navbar-expand-lg navbar-dark bg-dark" aria-label="Tenth navbar example">
    <div class="container-fluid">
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarsExample08" aria-controls="navbarsExample08" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse justify-content-md-center" id="navbarsExample08">
        <ul class="navbar-nav">
          <li class="nav-item">
            <a class="nav-link " aria-current="page" href="/postAd">complain page</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/receiveCrops">view complain status</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/receiveCrops">farming tips</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/cropAds">crop advertisement detail</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/logout" tabindex="-1" >Logout</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
  
</div>


<c:choose>
<c:when test="${mode=='MODE_CROPAD'}">

<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">acceptence</th>
      <th scope="col">Supplier Id</th>
      <th scope="col">post date</th>
      <th scope="col">crop name</th>
      <th scope="col">crop image</th>
      <th scope="col">quantity</th>
      <th scope="col"> status</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach var="ad" items="${ads}">
    <tr>
      <th scope="row">${ad.id}</th>
      <td><a href="/sellCrops" >sell</a> / <a href="#">reject</a></td>
      <td>${ad.supplierid}</td>
      <td>${ad.postdate}</td>
      <td>${ad.cropname}</td>
      <td><img alt="" src="data:image/jpeg;base64,${ad.image}" style="width:50px;height:50px;"></td>
      <td>${ad.quantity}</td>
      <td>${ad.status}</td>
    </tr>
    </c:forEach>
  </tbody>
</table>

</c:when>


<c:when test="${mode=='MODE_SELLCROPS'}">

<div class="container-fluid text-center justify-content-md-center">
	<h3> Make Offer</h3>

	<div class="row py-lg-5">
      <div class="col-lg-6 col-md-8 mx-auto">
       
  <form method="POST" action="/makeOffer">

	 <div class="form-floating">
      <input type="text" name="farmerid" class="form-control" id="floatingInput" >
      <label for="floatingInput">farmer id</label>
    </div>
    
    <div class="form-floating">
      <input type="number" name="quantity" class="form-control" id="floatingText" >
      <label for="floatingText">quantity</label>
    </div>
    
    <div class="form-floating">
      <input type="number" name="price" class="form-control" id="floatingInput" >
      <label for="floatingInput">price</label>
    </div>
   

    <button class="w-100 btn btn-lg btn-primary" type="submit">send offer</button>
   
  </form>
        
        
      </div>
    </div>
</div>
  </c:when>


</c:choose>
 

  <script src="/static/js/bootstrap.min.js"></script>
  <script src="/static/js/bootstrap.js"></script>
</body>
</html>