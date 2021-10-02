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
<title>All news page</title>
<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400" rel="stylesheet" />
<link href="resources/css/bootstrap.min.css" rel="stylesheet" />
<link href="resources/fontawesome/css/all.min.css" rel="stylesheet" />
<link href="resources/css/templatemo-diagoona-main.css" rel="stylesheet" />

<fmt:setLocale value="${sessionScope.local}" />
<fmt:setBundle basename="properties.local" var="loc" />
<fmt:message bundle="${loc}" key="local.message" var="message" />
<fmt:message bundle="${loc}" key="local.main.button.addNews" var="addNews_button" />

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
			</div>

			<div>
				<div class="tm-row">
					<div class="tm-col-left"></div>
					<main class="tm-col-right tm-contact-main">
						<!-- Content -->
						<section class="tm-content">
							<h2 class="mb-1 tm-content-title">Full list of news</h2>
							<c:choose>
								<c:when test="${newsList.size() == 0 || newsList.size() == null}">
									<p class="mb-1">
										<c:out value="No news are avaliable" />
									</p>
									<hr class="mb-1">
								</c:when>
								<c:otherwise>
									<c:forEach var="news" items="${newsList}">
										<a class="mb-1" href="Controller?command=go_to_view_news_page&id=${news.getId()}">
											<c:out value="${news.getTitle()}" />
										</a>
										<p class="mb-1">
											<c:out value="${news.getBrief()}" />
										</p>
										<hr class="mb-1">
										<p class="mb-3">
											<c:out value="${news.getAuthor()}" />
											<c:out value="|" />
											<c:out value="${news.getDateDB()}" />
										</p>
									</c:forEach>
								</c:otherwise>
							</c:choose>
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
			<!-- <div class="tm-bg">
				<div class="tm-bg-left"></div>
				<div class="tm-bg-right"></div>
			</div> -->
		</div>
	</div>

	<script src="resources/js/jquery-3.4.1.min.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>
	<script src="resources/js/jquery.backstretch.min.js"></script>
	<script src="resources/js/templatemo-script.js"></script>
</body>
</html>