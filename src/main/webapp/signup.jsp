<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign-Up Page</title>
<!-- Compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

<!-- Compiled and minified JavaScript -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</head>
<body
	style="background: url('img/back-1.jpg'); background-size: cover; background-attachment: fixed;">
	<div class="container">
		<div class="row">
			<div class="col m6 offset-m3">
				<div class="card">
					<div class="card-content">
						<h3 class="center-align" style="margin-top: 10px;">Register
							Here !!!</h3>
						
						<h5 id="msg" class="center-align"></h5>

						<div class="form center-align">
							<!-- creating form -->
							<form action="Signup" method="post" id="form">
								<input type="text" name="user_name"
									placeholder="Enter name here"> <input type="password"
									name="user_pass" placeholder="Enter password here"> <input
									type="email" name="user_email" placeholder="Enter email here">

								<button type="submit" class="btn #1e88e5 blue darken-1">Register</button>
								<button type="reset" class="btn #26a69a teal lighten-1">Reset</button>

							</form>
						</div>

						<div class="loader center-align"
							style="margin-top: 10px; display: none;" id="loader">
							<!-- loader !!! -->
							<div class="preloader-wrapper big active">
								<div class="spinner-layer spinner-blue">
									<div class="circle-clipper left">
										<div class="circle"></div>
									</div>
									<div class="gap-patch">
										<div class="circle"></div>
									</div>
									<div class="circle-clipper right">
										<div class="circle"></div>
									</div>
								</div>

								<div class="spinner-layer spinner-red">
									<div class="circle-clipper left">
										<div class="circle"></div>
									</div>
									<div class="gap-patch">
										<div class="circle"></div>
									</div>
									<div class="circle-clipper right">
										<div class="circle"></div>
									</div>
								</div>

								<div class="spinner-layer spinner-yellow">
									<div class="circle-clipper left">
										<div class="circle"></div>
									</div>
									<div class="gap-patch">
										<div class="circle"></div>
									</div>
									<div class="circle-clipper right">
										<div class="circle"></div>
									</div>
								</div>

								<div class="spinner-layer spinner-green">
									<div class="circle-clipper left">
										<div class="circle"></div>
									</div>
									<div class="gap-patch">
										<div class="circle"></div>
									</div>
									<div class="circle-clipper right">
										<div class="circle"></div>
									</div>
								</div>
							</div>

							<h5>Please wait...</h5>

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script src="https://code.jquery.com/jquery-3.6.0.min.js"
		integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
		crossorigin="anonymous"></script>
		
	<script type="text/javascript">
		$(document).ready(function() {
			console.log("Page is ready...!!!");
			
			$("#form").on('submit', function(event){
				event.preventDefault();
				
				var f = $(this).serialize();
				console.log(f);
				
				$(".loader").show();
				$(".form").hide();
				
				$.ajax({
					url: "Signup",
					data: f,
					type: 'POST',
					success: function(data, textStatus, jqXHR) {
						console.log(data);
						console.log("success...!!!");
						$(".loader").hide();
						$(".form").show();
						if(data.trim()=== 'Done...'){
							$('#msg').html("Successfuly Registered...!!!");
							$('#msg').addClass('green-text');
						}else {
							$('#msg').html("Something went wrong on server...!!!");
							$('#msg').addClass('red-text');
						}
						
					},
					error: function(jqXHR, textStatus, errorThrown) {
						console.log("error...!!!");
						$(".loader").hide();
						$(".form").show();
						$('#msg').html("Something went wrong on server...!!!");
						$('#msg').addClass('red-text');
					}
				})
				
			})
			
		})	
	
	</script>

</body>
</html>