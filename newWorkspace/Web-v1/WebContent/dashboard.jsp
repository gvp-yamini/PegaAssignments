<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pega</title>
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" />
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link href="css/app.css" rel="stylesheet" />
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
        <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <span class="glyphicon glyphicon-user"></span> 
                        <strong>Yamini</strong>
                        <span class="glyphicon glyphicon-chevron-down"></span>
                    </a>
                    <ul class="dropdown-menu">
                        <li>
                            <div class="navbar-login">
                                <div class="row">
                                    <div class="col-lg-4">
                                        <p class="text-center">
                                            <span class="glyphicon glyphicon-user icon-size"></span>
                                        </p>
                                    </div>
                                    <div class="col-lg-8">
                                        <p class="text-left"><strong class="userDetails">Yamini Thota</strong></p>
                                        <p class="text-left small userDetails">yamini10.thota@gmail.com</p>
										<p class="text-left">
                                            <a href="#" class="btn btn-primary btn-block btn-sm">Profile</a>
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </li>
                        <li class="divider navbar-login-session-bg"></li>
                         <li><a href="#">Account Settings <span class="glyphicon glyphicon-cog pull-right"></span></a></li>
            <li class="divider"></li>
            <li><a href="#">Messages <span class="badge pull-right"> 2 </span></a></li>
            <li class="divider"></li>
            <li><a href="#!/login">Sign Out <span class="glyphicon glyphicon-log-out pull-right"></span></a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</div>
<div role="main" class="container theme-showcase" id="mainContainer">
 <div class="" style="margin-top:10px;">
    <div class="bs-component">
      <sql:setDataSource
        var="myDS"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost:3307/hiringportal"
        user="root" password="root"
    />
    <sql:query var="listUsers"   dataSource="${myDS}">
        SELECT * FROM employees;
    </sql:query>
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of JobSeekers</h2></caption>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Skills</th>
            </tr>
            <c:forEach var="employees" items="${listUsers.rows}">
                <tr>
                    <td><c:out value="${employees.id}" /></td>
                    <td><c:out value="${employees.name}" /></td>
                    <td><c:out value="${employees.skills}" /></td>
                </tr>
            </c:forEach>
        </table>
    </div>
    </div>
 </div>
</div>
</body>
</html>