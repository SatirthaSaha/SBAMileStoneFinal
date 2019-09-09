<%@ page language="java" contentType="text/html; charset=ISO-8859-1" import="com.example.sba.model.User,java.util.*"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
  <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Manage Users</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="./css/userDetails.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
.checked {
	color: orange;
}
</style>
</head>
<body background="./images/background.jpg" style="background-repeat: no-repeat; background-size: cover;">
	<%List<User> userList = (List) request.getAttribute("userList"); %>
	<div class="container-fluid">
		<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target="#myNavbar">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#"><span class="glyphicon glyphicon-education"></span>  ShikshaDham</a>
				</div>
				<div class="collapse navbar-collapse" id="myNavbar" style="">
					<ul class="nav navbar-nav">
						<!-- <li class="dropdown"><a class="dropdown-toggle"
							data-toggle="dropdown" href="#">Learner <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li class="active"><a href="./userDetails.html">Your Profile</a></li>
								<li><a href="#">Page 1-2</a></li>
								<li><a href="#">Page 1-3</a></li>
							</ul></li> -->
						<spring:url value="/skillList" var="url1" htmlEscape="true" />
						<li><a href="${url1 }">Manage Skills</a></li>
						<spring:url value="/userList" var="ul" htmlEscape="true" />
						<li class="active"><a href="${ul }">Manage Users</a></li>
						<spring:url value="/mentorList" var="ml" htmlEscape="true" />
						<li ><a href="${ml }">Manage Mentors</a></li>
						<li><a href="#">Payments Received</a></li>
						<li><a href="#">Payments Made</a></li>
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<!-- <li><a href="#"><span class="glyphicon glyphicon-user"></span>
								Sign Up</a></li> -->
						<li><a href="#" data-toggle="modal"
							data-target=".bd-example-modal-lg"><span
								class="glyphicon glyphicon-bell"></span></a></li>
						<spring:url value="/logout" var="logout" htmlEscape="true" />
						<li><a href="${logout }"><span
								class="glyphicon glyphicon-log-in"></span> Logout</a></li>

					</ul>
				</div>

			</div>
		</nav>
	</div>
	<div class="container">
		<div class="col-sm-1"></div>
		<div class="row">
			<div class="col-sm-10">
				<div class="card card-signin my-5">
					<div class="card-body">
						<h5 class="card-title text-center" style="">List of Users</h5>
						<hr>
						<div class="table-responsive-sm">
							<table class="table table-striped">
								
								<tr>
									<th>ID</th>
									<th>Name</th>
									<th>Contact Number</th>
									<th>Email</th>
									<th>Address</th>
									<th>Registration Code</th>
									<th>Registration Date</th>
									<th></th>
									<th></th>
								</tr>
								<c:forEach items="${userList}" var="userList" varStatus="status">
								
								<tr>
									<td>${userList.id}</td>
									<td>${userList.firstName }</td>
									<td>${userList.lastName }</td>
									<td>${userList.contactNumber }</td>
									<td>${userList.address }</td>
									<td>${userList.regCode }</td>
									<td>${userList.regDatetime }</td>
									<td><c:if test="${userList.active==1 }"><a type="button" class="btn btn-success"
											href="<c:url value='/activate/${userList.id}' />">Deactivate</a></c:if>
											<c:if test="${userList.active==0 }"><a type="button" class="btn btn-success"
											href="<c:url value='/activate/${userList.id}' />">Activate</a></c:if></td>
									<td style="border-right: none;"><a type="button" class="btn btn-danger"
											href="<c:url value='/userRemove/${userList.id}' />">Remove</a></td>
								</tr>
								</c:forEach>
							
								
							</table>
						
						</div>
					</div>

				</div>

			</div>
		</div>
	</div>
	
</body>
</html>
