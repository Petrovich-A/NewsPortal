<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="by.http.newsportal.bean.News"%>
<%@ page import="by.http.newsportal.bean.User"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>View News Page</title>
<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400" rel="stylesheet" />
<link href="resources/css/bootstrap.min.css" rel="stylesheet" />
<link href="resources/fontawesome/css/all.min.css" rel="stylesheet" />
<link href="resources/css/templatemo-diagoona-viewNews-Page.css" rel="stylesheet" />

<fmt:setLocale value="${sessionScope.local}" />
<fmt:setBundle basename="properties.local" var="loc" />
<fmt:message bundle="${loc}" key="local.message" var="message" />
<fmt:message bundle="${loc}" key="local.loc.button.name.ru" var="ru_button" />
<fmt:message bundle="${loc}" key="local.loc.button.name.en" var="en_button" />
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
						<div class="collapse navbar-collapse tm-nav" id="navbar-nav">
							<ul class="navbar-nav text-uppercase">
								<li class="nav-item"><a class="nav-link tm-nav-link" href="Controller?command=go_to_main_page">Home </a></li>
							</ul>
						</div>
					</nav>
				</div>
				<div class="tm-row">
					<div class="tm-col-left"></div>
					<main>
						<div class="tm-content">
							<p class="mb-5 tm-content-title">${newsChoisen.getTitle()}</p>
							<hr>
							<p class="mb-5 tm-content-title">${newsChoisen.getBrief()}</p>
							<hr>
							<p class="mb-5 tm-content-title">${newsChoisen.getContent()}</p>
							<p class="mb-5 tm-content-title">${newsChoisen.getDateDB()} | ${newsChoisen.getAuthor()} </p>
						</div>
					</main>
				</div>
			</div>
		</div>
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
</body>
</html>