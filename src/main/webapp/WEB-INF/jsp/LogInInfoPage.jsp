<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    
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