<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400" rel="stylesheet" />
<link href="resources/css/bootstrap.min.css" rel="stylesheet" />
<link href="resources/fontawesome/css/all.min.css" rel="stylesheet" />
<link href="resources/css/templatemo-diagoona-registr-page.css" rel="stylesheet">
<title>Registration Page Info</title>
</head>
<body>
	<div class="tm-container">
		<div>
			<div class="tm-row pt-4">
				<div class="tm-col-left">
					<div class="tm-site-header media">
						<i class="fas fa-umbrella-beach fa-3x mt-1 tm-logo"></i>
						<div class="media-body">
							<h1 class="tm-sitename text-uppercase">NEWS PORTAL</h1>
							<p class="tm-slogon">java web app</p>
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
							</ul>
						</div>
					</nav>
				</div>
			</div>
		</div>

		<div class="tm-row">
			<div class="tm-col-left"></div>
			<main class="tm-col-right">
				<section class="tm-content tm-about">
					<h2 class="mb-5 tm-content-title">Congratulations, registration has done successful</h2>
					<hr class="mb-4">
					<p>Your registration Info:</p>
					<hr class="mb-4">
					<div class="media my-3">
						<i class="fas fa-draw-polygon fa-3x p-3 mr-4"></i>
						<div class="media-body">
							<%--<p>
								Name:<%=request.getParameter("name")%></p>
							<p>
								Password:
								<%=request.getParameter("password")%></p>
							<p>
								email:
								<%=request.getParameter("email")%></p>
							<p>
								Gender:
								<%=request.getParameter("gender")%></p>
							<p>
								Country:
								<%=request.getParameter("country")%></p>
							<p>
								Hobby:
								<%=request.getParameter("hobby")%></p>

							<%--
							<p>
								<%
								String[] languages = request.getParameterValues("language");
								for (String language : languages) {
									out.print("<li>" + language + "</li>");
								}
								%>
							<p>
							--%>
						</div>
					</div>
				</section>
			</main>
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
					Copyright 2020 Diagoona |
					<a rel="nofollow" target="_parent" href="https://it-academy.by" class="tm-text-link">IT-Academy</a>
					| Md-JD2
				</p>
			</footer>
		</div>
	</div>

	<!-- Diagonal background design -->
	<div class="tm-bg">
		<div class="tm-bg-left"></div>
		<div class="tm-bg-right"></div>
	</div>
</body>
</html>