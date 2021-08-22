<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link href="resources/css/style.css" rel="stylesheet">

<title>Registration Page Info</title>
</head>
<body>

<h1>Congratulations, registration has done successful!</h1>
<hr />
<h2><strong>Your registration Info:</strong></h2>

	<p>Name: <%= request.getParameter("name") %></p>
	<p>Password: <%= request.getParameter("password") %></p>
	<p>Gender: <%= request.getParameter("email-address") %></p>
	<p>Gender: <%= request.getParameter("gender") %></p>
	<p>Country: <%= request.getParameter("country") %></p>
	<p>Selected languages:</p>
	
	<ul><%
	String[] languages = request.getParameterValues("language");
		for(String language: languages){
			out.print("<li>" + language + "</li>");
		}
 	%></ul>
 	
 	<p>Hobby: <%= request.getParameter("comment") %></p>

</body>
</html>