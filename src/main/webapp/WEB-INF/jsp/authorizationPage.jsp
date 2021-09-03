<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/templatemo-diagoona-authoriz.css" rel="stylesheet">
<title>Log in</title>

<fmt:setLocale value="${sessionScope.local}" />
<fmt:setBundle basename="properties.local" var="loc" />
<fmt:message bundle="${loc}" key="local.message" var="message" />
<fmt:message bundle="${loc}" key="local.login.page.h1" var="LoginPageH1_text" />
<fmt:message bundle="${loc}" key="local.login.page.h2" var="LoginPageH2_text" />
<fmt:message bundle="${loc}" key="local.login.page.user.name" var="user_name" />
<fmt:message bundle="${loc}" key="local.login.page.user.password" var="user_password" />
<fmt:message bundle="${loc}" key="local.login.button.submit" var="submit_button" />
<fmt:message bundle="${loc}" key="local.login.page.checkbox.remember" var="remember_checkbox" />
</head>

<body>

	<div class="tm-container">
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
							<li class="nav-item"><a class="nav-link tm-nav-link" href="Controller?command=go_to_main_page">Home </a></li>
						</ul>
					</div>
				</nav>
			</div>
		</div>
	</div>

	<div class="tm-row">
		<div class="tm-col-left"></div>
		<main class="tm-col-right tm-contact-main">
			<!-- Content -->
			<section class="tm-content tm-contact">
				<h2 class="mb-4 tm-content-title">${LoginPageH1_text}</h2>
				<p class="mb-85">${LoginPageH2_text}</p>
				<form id="contact-form" action="Controller" method="post">
					<div class="form-group mb-4">
						<input type="text" name="name" class="form-control" placeholder="${user_name}" required="required" />
					</div>
					<div class="form-group mb-4">
						<input type="password" name="password" class="form-control" placeholder="${user_password}" required="required" />
					</div>
					<br>
					<div class="form-group mb-4">
						${remember_checkbox}
						<input type="checkbox" name="remember" value="rememberMe">
					</div>
					<div class="text-right">
						<input type="hidden" name="command" value="authorization" />
						<button type="submit" class="btn btn-big btn-primary">${submit_button}</button>
					</div>
				</form>
			</section>
		</main>
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