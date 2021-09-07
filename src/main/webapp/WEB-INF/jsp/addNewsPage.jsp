<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<link href="resources/css/templatemo-diagoona-addNews-page.css" rel="stylesheet">
<title>Add news page</title>
<fmt:setLocale value="${sessionScope.local}" />
<fmt:setBundle basename="properties.local" var="loc" />
<fmt:message bundle="${loc}" key="local.message" var="message" />
<fmt:message bundle="${loc}" key="local.addNews.page.h1" var="registrationPageH1_text" />
<fmt:message bundle="${loc}" key="local.addNews.page.h2" var="registrationPageH2_text" />
<fmt:message bundle="${loc}" key="local.addNews.page.news.title" var="news_title" />
<fmt:message bundle="${loc}" key="local.addNews.page.news.brief" var="news_brief" />
<fmt:message bundle="${loc}" key="local.addNews.page.news.content" var="news_content" />
<fmt:message bundle="${loc}" key="local.addNews.page.news.author" var="news_author" />
<fmt:message bundle="${loc}" key="local.addNews.page.button.submit" var="submit_button" />
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

			<div class="tm-row">
				<div class="tm-col-left"></div>
				<main class="tm-col-right tm-contact-main">
					<!-- Content -->
					<section class="tm-content tm-contact">
						<h2 class="mb-4 tm-content-title">${registrationPageH1_text}</h2>
						<p class="mb-85">${registrationPageH2_text}</p>
						<form id="contact-form" action="Controller" method="POST">
							<div class="form-group mb-4">
								<input type="text" name="title" class="form-control" placeholder="${news_title}" required="required" />
							</div>
							<div class="form-group mb-5">
								<textarea rows="4" name="brief" class="form-control" placeholder="${news_brief}..." required="required" style="width: 632px; "></textarea>
							</div>
							<div class="form-group mb-5">
								<textarea rows="4" name="content" class="form-control" placeholder="${news_content}..." required="required" style="width: 636px; height: 123px"></textarea>
							</div>

							<div class="form-group mb-4">
								<input type="text" name="author" class="form-control" placeholder="${news_author}" required="required" />
							</div>
							<div class="text-right">
								<input type="hidden" name="command" value="delete_news" />
								<button type="submit" class="btn btn-big btn-primary">${submit_button}</button>
							</div>

						</form>
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
	</div>
</body>

</html>