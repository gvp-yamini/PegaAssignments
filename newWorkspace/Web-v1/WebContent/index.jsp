<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pega</title>
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" />
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link href="css/app.css" rel="stylesheet" />
<body>
<script>
 function validateUsername(){
	 var text = document.getElementByname("user").value;
	 if(text==""){
		 document.getElementById("errorusername").innerHTML = "Provide Username";
		 document.getElementById("errorusername").style.color = "red";
	 }
 }
 function validatePassword(){
	 var text = document.getElementByname("pass").value;
	 if(text==""){
		 document.getElementById("errorpassword").innerHTML = "Provide Password";
		 document.getElementById("errorpassword").style.color = "red";
	 } 
 }
</script>
</head>
<body>
  <div class="navbar navbar-custom navbar-fixed-top" role="navigation">
    <div class="container"> 
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span> 
            </button>
            <a class="navbar-brand" href="https://www.pega.com"><img src="resources/pegalogo.jpg" alt="Pega">
        </a>
        <h1 class="navbar-text">Pega Hiring Portal</h1>
        </div>
    </div>
</div>
<hr/>
         <div class="rightContainer">
   <div class="row">
       <div class="col-sml-12">
                   <div class="form">
					<form method="post" action="MyServlet">
						<input type="text"  name="user" placeholder="username" onblur="validateUsername();"/>
						<label id="errorusername"></label>
						<input type="password"  name="pass" placeholder="password" onblur="validatePassword();"/>
						<label id = "errorpassword"></label>
						<input type="submit" value="Login" style="background: #192980; color: #FFFFFF;" />
						<a href="#">Create an account</a> &nbsp;&nbsp;
						<a href="#">Forgot Password</a>
					</form>
					</div>
					</div>
					</div>
				</div>
				</body>
</html>