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
<link href="resources/css/templatemo-diagoona-updateNews-page.css" rel="stylesheet">
<title>Update news page</title>
<fmt:setLocale value="${sessionScope.local}" />
<fmt:setBundle basename="properties.local" var="loc" />
<fmt:message bundle="${loc}" key="local.message" var="message" />
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
				<main class="tm-col-right tm-contact-main">
					<!-- Content from BD-->
					<form action="Controller" method="POST">
						<section class="tm-content tm-contact">
							<h2 class="mb-4 tm-content-title">Update news page</h2>
							<table class="table">
								<thead>
									<tr>
										<th>News ID</th>
										<th>Title</th>
										<th>Brief</th>
										<th>Content</th>
										<th>Author</th>
										<th>Date</th>
									</tr>
								</thead>
								<tbody>
									<c:choose>
										<c:when test="${news.getId() == 0}">
											<p class="mb-5">
												<c:out value="No id for news. News isn't avaliable" />
											</p>
										</c:when>
										<c:otherwise>
											<tr>
												<td width="" height="">${news.getId()}</td>
												<td width="" height=""><input name="id" class="form-control" value="${news.getId()}"></td>
												<td width="" height=""><input name="title" class="form-control" value="${news.getTitle()}"></td>
												<td width="" height=""><input name="brief" class="form-control" value="${news.getBrief()}"></td>
												<td width="" height=""><input name="content" class="form-control" value="${news.getContent()}"></td>
												<td width="" height=""><input name="author" class="form-control" value="${news.getAuthor()}"></td>
												<td width="" height=""><input name="date" class="form-control" value="${news.getDate()}"></td>
											</tr>
										</c:otherwise>
									</c:choose>
								</tbody>
							</table>
							<div class="text-right">
								<input type="hidden" name="id" value="${news.getId()}" />
								<input type="hidden" name="command" value="update_news" />
								<button type="submit" class="btn btn-big btn-primary">Update</button>
							</div>
						</section>
					</form>
				</main>
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
	</div>

	<script src="resources/js/jquery-3.4.1.min.js?1"></script>
	<script src="resources/js/bootstrap.min.js?1"></script>
	<script src="resources/js/jquery.backstretch.min.js?1"></script>
	<script src="resources/js/templatemo-script.js?1"></script>

</body>
</html>