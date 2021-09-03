<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/templatemo-diagoona-authoriz.css" rel="stylesheet">
<title>Registration Info page</title>
</head>

<body>
	<div class="tm-container">
		<div class="tm-row pt-4">
			<div class="tm-col-left">
				<div class="tm-site-header media">
					<i class="fas fa-umbrella-beach fa-3x mt-1 tm-logo"></i>
					<div class="media-body">
						<h1 class="tm-sitename text-uppercase">Your registration is successful</h1>
						<p class="tm-slogon">Welcome to News Portal</p>
						<br>
						<hr />
						<a class="tm-slogon" href="Controller?command=go_to_authorization_page"> Please log in </a>
					</div>
					<div class="media-body">
						<br />
						<p class="mb-5">
							<%--  <c:out value="${user.getName()}" />--%>
						</p>
					</div>
				</div>
			</div>
			<div class="tm-col-right">
				<nav class="navbar navbar-expand-lg" id="tm-main-nav">
					<button class="navbar-toggler toggler-example mr-0 ml-auto" type="button" data-toggle="collapse" data-target="#navbar-nav"
						aria-controls="navbar-nav" aria-expanded="false" aria-label="Toggle navigation">
						<span><i class="fas fa-bars"></i></span>
					</button>
					<div class="collapse navbar-collapse tm-nav" id="navbar-nav">
						<ul class="navbar-nav text-uppercase">
							<li class="nav-item"><a class="nav-link tm-nav-link" href="Controller?command=go_to_main_page">Home </a></li>
							<li class="nav-item"><a class="nav-link tm-nav-link" href="Controller?command=go_to_authorization_page">Log in </a></li>
						</ul>
					</div>
				</nav>
			</div>
		</div>
	</div>

	<div class="tm-row">
		<div class="tm-col-left text-center">
			<ul class="tm-bg-controls-wrapper">
				<li class="tm-bg-control active" data-id="0"></li>
				<li class="tm-bg-control" data-id="1"></li>
				<li class="tm-bg-control" data-id="2"></li>
			</ul>
		</div>
		<div class="tm-col-right tm-col-footer">
			<footer class="tm-site-footer text-right">
				<p class="mb-0">
					Copyright 2020 Diagoona Co. | Md-JD2 2021
					<a rel="nofollow" target="_parent" href="https://it-academy.by" class="tm-text-link">IT-Academy</a>
				</p>
			</footer>
		</div>
	</div>

</body>
</html>