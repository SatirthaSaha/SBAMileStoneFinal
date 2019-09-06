<%@ page language="java" contentType="text/html; charset=ISO-8859-1" import="java.util.*,com.example.sba.model.Mentor"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
  <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Manage Mentors</title>



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
<body>
	<%List<Mentor> mentorList = (List) request.getAttribute("mentorList"); %>
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
						<!-- <li class="dropdown"><a class="dropdown-toggle"
							data-toggle="dropdown" href="#">Learner <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li class="active"><a href="./userDetails.html">Your Profile</a></li>
								<li><a href="#">Page 1-2</a></li>
								<li><a href="#">Page 1-3</a></li>
							</ul></li> -->
						<li><a href="./manageSkills.html">Manage Skills</a></li>
						<li><a href="./manageUsers.html">Manage Users</a></li>
						<li class="active"><a href="./manageMentors.html">Manage Mentors</a></li>
						<li><a href="./paymentsReceived.html">Payments Received</a></li>
						<li><a href="./paymentsMade.html">Payments Made</a></li>
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<!-- <li><a href="#"><span class="glyphicon glyphicon-user"></span>
								Sign Up</a></li> -->
						<li><a href="#" data-toggle="modal"
							data-target=".bd-example-modal-lg"><span
								class="glyphicon glyphicon-bell"></span></a></li>
						<li><a href="./adminLogin.html"><span
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
						<h5 class="card-title text-center" style="">List of Mentors</h5>
						<hr>
						<div class="table-responsive-sm">
							<table class="table table-striped">
								<tr>
									<th>Name</th>
									<th>Years Of Experience</th>
									<th>Technology</th>
									<th>Total Training</th>
									<th>Fees</th>
									<th>Rating</th>
									<th>Action</th>
								</tr>
								<%
										for (int i = 0; i < mentorList.size(); i++) {
											Mentor e = (Mentor) mentorList.get(i);
									%>
								<tr>
									
									<td><%=e.getId() %></td>
									<td><%=e.getUsername() %></td>
									<td><%=e.getLinkedinUrl() %></td>
									<td><%=e.getContact() %></td>
									<td><%=e.getRegCode() %></td>
									<td><%=e.getRegDatetime() %></td>
									<td><button type="button" class="btn btn-primary">Remove</button></td>
								</tr>
								<%} %>
								
							</table>
						
						</div>
					</div>

				</div>

			</div>
		</div>
	</div>
	
</body>
</html>