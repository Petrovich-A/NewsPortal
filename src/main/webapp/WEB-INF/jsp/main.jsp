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
<title>My News main</title>
<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400" rel="stylesheet" />
<link href="resources/css/bootstrap.min.css" rel="stylesheet" />
<link href="resources/fontawesome/css/all.min.css" rel="stylesheet" />
<link href="resources/css/templatemo-diagoona-main.css" rel="stylesheet" />

<fmt:setLocale value="${sessionScope.local}" />
<fmt:setBundle basename="properties.local" var="loc" />
<fmt:message bundle="${loc}" key="local.message" var="message" />
<fmt:message bundle="${loc}" key="local.loc.button.name.ru" var="ru_button" />
<fmt:message bundle="${loc}" key="local.loc.button.name.en" var="en_button" />
<fmt:message bundle="${loc}" key="local.main.button.registration" var="registration_button" />
<fmt:message bundle="${loc}" key="local.main.button.login" var="login_button" />
<fmt:message bundle="${loc}" key="local.main.button.addNews" var="addNews_button" />
</head>
<body>
	<div class="local-button">
		<ul class="navbar-nav text-uppercase">
			<li class="nav-item active">
				<form action="Controller" method="post">
					<input type="hidden" name="command" value="change_local" />
					<input type="hidden" name="local" value="en" />
					<input type="submit" value="${en_button}" class="btn btn-primary" />
				</form>
			</li>
			<li class="nav-item active">
				<form action="Controller" method="post">
					<input type="hidden" name="command" value="change_local" />
					<input type="hidden" name="local" value="ru" />
					<input type="submit" value="${ru_button}" class="btn btn-primary" />
				</form>
			</li>
		</ul>
	</div>
	<div class="tm-container">
		<div>
			<div class="tm-row pt-4">
				<div class="tm-col-left">
					<div class="tm-site-header media">
						<i class="fas fa-umbrella-beach fa-3x mt-1 tm-logo"></i>
						<div class="media-body">
							<h1 class="tm-sitename text-uppercase">news portal</h1>
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
								<form action="Controller" method="post">
									<li class="nav-item active"><input type="hidden" name="command" value="go_to_add_news_page" /> <input type="hidden" name="local"
											value="Add news" /> <input type="submit" value="${addNews_button}" class="btn btn-primary" /></li>
								</form>
								<form action="Controller" method="post">
									<li class="nav-item active"><input type="hidden" name="command" value="go_to_registration_page" /> <input type="hidden" name="local"
											value="Registration" /> <input type="submit" value="${registration_button}" class="btn btn-primary" /></li>
								</form>
								<form action="Controller" method="post">
									<li class="nav-item"><input type="hidden" name="command" value="go_to_authorization_page" /> <input type="hidden" name="local"
											value="Log in" /> <input type="submit" value="${login_button}" class="btn btn-primary" /></li>
								</form>
							</ul>
						</div>
					</nav>
				</div>
			</div>
		</div>
	</div>
	<div class="tm-row">
		<div class="tm-col-left"></div>
		<main class="tm-col-right">
			<section class="tm-content">
				<h2 class="mb-5 tm-content-title">List of news</h2>
				<p class="mb-5">
					<c:choose>
						<c:when test="${newsList.size() == 0 || newsList.size() == null}">
							<div>
								<p class="mb-5">
									<c:out value="No data from DB" />
								</p>
								<hr class="mb-5">
							</div>
						</c:when>
						<c:otherwise>
							<c:forEach var="news" items="${newsList}">
								<div>
									<p class="mb-5">
										<c:out value="${news.getTitle()}" />
									</p>
									<hr class="mb-5">
									<p class="mb-5">
										<c:out value="${news.getAuthor()}" />
										<c:out value="|" />
										<c:out value="${news.getDateDB()}" />
									</p>
									<p class="mb-5">
										<c:out value="${news.getBrief()}" />
									</p>
									<hr class="mb-5">
								</div>
							</c:forEach>
						</c:otherwise>
					</c:choose>
				</p>
				<a href="about.html" class="btn btn-primary">Continue...</a>
			</section>
		</main>
	</div>

	<div class="tm-col-right tm-col-footer">
		<footer class="tm-site-footer text-right">
			<p class="mb-0">
				Copyright 2020 Diagoona | Md-JD2 |
				<%=new java.util.Date()%>
				|
				<a rel="nofollow" target="_parent" href="https://it-academy.by" class="tm-text-link">IT-Academy</a>
			</p>
		</footer>
	</div>
</body>
</html>