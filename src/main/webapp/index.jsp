<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
   	pageEncoding="UTF-8"%>
    	    	
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="resources/css/style.css" rel="stylesheet">	
<title>My News main</title>

</head>
<p><img src="resources/logo.png"></p>
<body>
	<%
		response.sendRedirect("Controller?command=go_to_main_page");
	%>
</body>
</html>