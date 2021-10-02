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
<link href="resources/css/templatemo-diagoona-manageNews.css" rel="stylesheet">
<title>Manage news page</title>
<fmt:setLocale value="${sessionScope.local}" />
<fmt:setBundle basename="properties.local" var="loc" />
<fmt:message bundle="${loc}" key="local.message" var="message" />
</head>

<body>
	<div class="tm-container">
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
			<main class="tm-col-right tm-contact-main">
				<!-- Content from BD-->
				<section class="tm-content tm-contact">
					<h2 class="mb-2 tm-content-title">Manage news page</h2>
					<form action="Controller" method="POST">
						<table class="table">
							<col width="20">
							<col width="30">
							<col width="150">
							<col width="220">
							<col width="450">
							<col width="80">
							<thead>
								<tr>
									<th></th>
									<th>News ID</th>
									<th>Title</th>
									<th>Brief</th>
									<th>Content</th>
									<th>Author / Date</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<c:choose>
									<c:when test="${newsList.size() == 0 || newsList.size() == null}">
										<p class="mb-2">
											<c:out value="No news are avaliable" />
										</p>
									</c:when>
									<c:otherwise>
										<c:forEach var="news" items="${newsList}">
											<tr>
												<td><input class="tm-content tm-contact" type="radio" name="id" required="required" value="${news.getId()}"></td>
												<td>${news.getId()}</td>
												<td>${news.getTitle()}</td>
												<td>${news.getBrief()}</td>
												<td>${news.getContent()}</td>
												<td>${news.getAuthor()}/ ${news.getDateDB()}</td>
											</tr>
										</c:forEach>
									</c:otherwise>
								</c:choose>
							</tbody>
						</table>
						<div class="text-right">
							<button type="submit" name="command" value="go_to_update_news" class="btn btn-big btn-primary">Update</button>
							<button type="submit" name="command" value="delete_news" onClick="Refresh()" class="btn btn-big btn-primary">Delete</button>
						</div>
					</form>
				</section>
			</main>
		</div>
	</div>
	<%--   --%>
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
</body>

</html>