<%@ page language="java" 
		contentType="text/html; charset=UTF-8"
    	import="by.http.newsportal.bean.User"
    	pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link href="resources/css/style.css" rel="stylesheet">

<title>User Info</title>
</head>
<body>

<h2><b>Matrix has you!</b></h2>
<hr />
<h2><b>Welcome to "The News Portal" web page, <%= request.getParameter("username") %>!</b></h2>
	<br />
	<%
		out.print(request.getParameter("username"));
	%>
</body>
</html>