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
							<h1 class="tm-sitename text-uppercase">news portal</h1>
							<p class="tm-slogon">java web app</p>
						</div>
					</div>
				</div>
				<div class="tm-col-right">
					<nav class="navbar navbar-expand-lg" id="tm-main-nav">
						
						<div class="collapse navbar-collapse tm-nav" id="navbar-nav">
							<ul class="navbar-nav text-uppercase">
								<li class="nav-item" style="width: 818px;"><a class="nav-link tm-nav-link" href="Controller?command=go_to_main_page">Home </a></li>
							</ul>
						</div>
					</nav>
				</div>
			</div>

			<div class="tm-row">
				<div class="tm-col-left"></div>
				<main class="tm-col-right tm-contact-main">
					<!-- Content from BD-->
					<section class="tm-content tm-contact">
						<h2 class="mb-4 tm-content-title">List of news from BD</h2>
						<p class="mb-85">Place for text</p>

						<table>
							<thead>
								<tr>
									<th></th>
									<th>News ID</th>
									<th>Title</th>
									<th>Title</th>
									<th>content</th>
									<th>author</th>
									<th>date</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${requestScope.lastNews}" var="news">
									<tr>
										<td><input class="tm-content tm-contact" type="radio" name="news_id" value="${news.id}"></td>
										<td>${news.id}</td>
										<td>${news.title}</td>
										<td>${news.brief}</td>
										<td>${news.content}</td>
										<td>${news.author}</td>
										<td>${news.date}</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>


						<form id="contact-form" action="Controller" method="POST">
							<div class="form-group mb-4">
								<input type="text" name="title" class="form-control" placeholder="${news_title}" required="" />
							</div>
							
							<div class="text-right">
								<input type="hidden" name="command" value="add_news" />
								<button type="submit" class="btn btn-big btn-primary">${submit_button}</button>
							</div>

						</form>
					</section>
				</main>
			</div>
		</div>

		<div class="tm-row">
			
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