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
<title>Registration page</title>

<fmt:setLocale value="${sessionScope.local}" />
<fmt:setBundle basename="properties.local" var="loc" />
<fmt:message bundle="${loc}" key="local.message" var="message" />
<fmt:message bundle="${loc}" key="local.registration.page.h1" var="registrationPageH1_text" />
<fmt:message bundle="${loc}" key="local.registration.page.h2" var="registrationPageH2_text" />
<fmt:message bundle="${loc}" key="local.registration.page.user.name" var="user_name" />
<fmt:message bundle="${loc}" key="local.registration.page.user.password" var="user_password" />
<fmt:message bundle="${loc}" key="local.registration.page.user.email" var="user_email" />
<fmt:message bundle="${loc}" key="local.registration.page.user.gender" var="user_gender" />
<fmt:message bundle="${loc}" key="local.registration.page.user.gender.male" var="user_gender_male" />
<fmt:message bundle="${loc}" key="local.registration.page.user.gender.female" var="user_gender_female" />
<fmt:message bundle="${loc}" key="local.registration.page.user.gender.other" var="user_gender_other" />
<fmt:message bundle="${loc}" key="local.registration.page.user.country" var="user_country" />
<fmt:message bundle="${loc}" key="local.registration.page.user.country.belarus" var="user_country_belarus" />
<fmt:message bundle="${loc}" key="local.registration.page.user.country.russia" var="user_country_russia" />
<fmt:message bundle="${loc}" key="local.registration.page.user.country.ukraine" var="user_country_ukraine" />
<fmt:message bundle="${loc}" key="local.registration.page.user.country.israel" var="user_country_israel" />
<fmt:message bundle="${loc}" key="local.registration.page.user.language" var="user_language" />
<fmt:message bundle="${loc}" key="local.registration.page.user.language.belarus" var="user_language_belarus" />
<fmt:message bundle="${loc}" key="local.registration.page.user.language.rusian" var="user_language_rusian" />
<fmt:message bundle="${loc}" key="local.registration.page.user.language.english" var="user_language_english" />
<fmt:message bundle="${loc}" key="local.registration.page.user.language.german" var="user_language_german" />
<fmt:message bundle="${loc}" key="local.registration.page.user.hobby" var="user_hobby" />
<fmt:message bundle="${loc}" key="local.registration.page.button.submit" var="submit_button" />
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
								<li class="nav-item"><a class="nav-link tm-nav-link" href="Controller?command=go_to_authorization_page">Log in </a></li>
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
						<h2 class="tm-sitename text-uppercase">${registrationPageH1_text}</h2>
						<p class="tm-slogon">${registrationPageH2_text}</p>
						<form id="contact-form" action="Controller" method="POST">
							<div class="form-group mb-1">
								<input type="text" name="name" class="form-control" placeholder="${user_name}" required required pattern="^[a-zA-Z0-9]\\w{5,30}+$" />
								<input type="password" name="password" class="form-control" placeholder="${user_password}" required
									pattern="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,40}+$" />
								<input type="email" name="eMail" class="form-control" placeholder="${user_email}" required pattern="^\S+@\S+\.\S+$" />
							</div>
							<div class="form-group mb-1">
								<p>${user_gender}</p>
								<input type="radio" name="gender" value="male" required="required"> ${user_gender_male}
								<input type="radio" name="gender" value="female"> ${user_gender_female}
								<input type="radio" name="gender" value="other"> ${user_gender_other}

								<p>${user_country}</p>
								<select name="country">
									<option value="Belarus" selected>${user_country_belarus}</option>
									<option value="Russia">${user_country_russia}</option>
									<option value="Ukraine">${user_country_ukraine}</option>
									<option value="Israel">${user_country_israel}</option>
								</select>
							</div>
							<div class="form-group mb-1">
								<p>${user_language}</p>
								<ul>
									<li>${user_language_belarus} <input type="checkbox" name="language" value="Belarusian" /></li>
									<li>${user_language_rusian} <input type="checkbox" name="language" value="Rusian" /></li>
									<li>${user_language_english} <input type="checkbox" name="language" value="English" /></li>
									<li>${user_language_german} <input type="checkbox" name="language" value="German" /></li>
								</ul>
							</div>
							<div class="form-group mb-1">
								<textarea rows="2" name="hobby" class="form-control" placeholder="${user_hobby}..."></textarea>
							</div>
							<div class="text-right">
								<input type="hidden" name="command" value="registration" />
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

		<!-- Diagonal background design -->
		<div class="tm-bg">
			<div class="tm-bg-left"></div>
			<div class="tm-bg-right"></div>
		</div>
	</div>

	<script src="resources/js/jquery-3.4.1.min.js?12"></script>
	<script src="resources/js/bootstrap.min.js?12"></script>
	<script src="resources/js/jquery.backstretch.min.js?12"></script>
	<script src="resources/js/templatemo-script.js?12"></script>
</body>
</html>