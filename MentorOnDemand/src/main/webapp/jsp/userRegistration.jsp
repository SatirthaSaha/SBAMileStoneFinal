<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<title>Login</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="./css/login.css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<script src="./js/jquery-3.3.1.min.js"></script>
<script src="./js/jquery-migrate-1.4.1.min.js"></script>
<script src="./js/jquery-ui-1.10.3.custom.min.js"></script>

</head>

<body>
	<div class="container-fluid">
		<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target="#myNavbar">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">WebSiteName</a>
				</div>
				<div class="collapse navbar-collapse" id="myNavbar" style="">
					<ul class="nav navbar-nav">
						<li><a href="#">About Us</a></li>
						<li><a href="#">Contact Us</a></li>
					</ul>


				</div>
			</div>
		</nav>
	</div>
	<div class="container">
		<div class="col-sm-2"></div>
		<div class="row">
			<div class="col-sm-8">
				<div class="card card-signin my-5">
					<div class="card-body">
						<h5 class="card-title text-center">Sign Up</h5>
						<hr>
						<form:form class="form" role="form" autocomplete="off"
									action="/register" modelAttribute="ul">
									<div class="form-group row">
										<label class="col-lg-4 col-form-label form-control-label">   First Name:</label>
										<div class="col-lg-8">
											<form:input class="form-control" type="text" path="firstName"
												required="required"/>
										</div>
										
									</div>
									<div class="form-group row">
										<label class="col-lg-4 col-form-label form-control-label">   Last Name:</label>
										<div class="col-lg-8">
											<form:input class="form-control" type="text" path="lastName"
												required="required"/>
										</div>
										
									</div>
									<div class="form-group row">
										<label class="col-lg-4 col-form-label form-control-label">   Password:</label>
										<div class="col-lg-8">
											<form:input class="form-control" type="password" path="password"
												required="required" onfocus="avail1()"/>
										</div>
									</div>
									<div class="form-group row">
										<label class="col-lg-4 col-form-label form-control-label">   Mobile
											Number:</label>
										<div class="col-lg-8">
											<form:input class="form-control" type="number"
												path="contactNumber" required="required" value="mobilenumber" min="1000000000" max="10000000000"/>
										</div>
									</div>
									<div class="form-group row">
										<label class="col-lg-4 col-form-label form-control-label">   Email:</label>
										<div class="col-lg-8">
											<form:input class="form-control" type="email" path="email"
												required="required" />
										</div>
									</div>
									<div class="form-group row">
										<label class="col-lg-4 col-form-label form-control-label">  Registration Date:</label>
										<div class="col-lg-8">
											<form:input class="form-control" type="date" path="regDatetime"
												required="required"/>
										</div>
									</div>
									<div class="form-group row">
										<label class="col-lg-4 col-form-label form-control-label">  Address:</label>
										<div class="col-lg-8">
											<form:input class="form-control" type="text" path="address"
												required="required"/>
										</div>
									</div>
									<div class="form-group row">
										<label class="col-lg-4 col-form-label form-control-label"></label>
										<div class="col-lg-8">
											<div class="col-lg-3">
												<input type="reset" class="btn btn-secondary" value="Reset">
											</div>
											<div class="col-lg-3">
												<input type="submit" class="btn btn-primary"
													value="Save Changes">
											</div>
										</div>
									</div>
								</form:form>

					</div>
				</div>
			</div>
		</div>
		<div class="col-sm-2"></div>
	</div>


</body>

</html>