<%@ page language="java" 
		contentType="text/html; charset=UTF-8"
    	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<link href="resources/css/style.css" rel="stylesheet">
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

<h1>${registrationPageH1_text}</h1>
<hr />
<h2>${registrationPageH2_text}</h2>

<fieldset class="logIn-info">
	
	<fieldset>
		<label>
			${user_name}
			<input type="text" name="name" value="">
		</label>
		
		<label>
			${user_password}
			<input type="password" name="password" value="">
		</label>
		
		<label>
			${user_email}
			<input type="email" name="email-address" value="">
		</label>
	</fieldset>
	
	<fieldset>
		<label>
			${user_gender}
			<input type="radio" name="gender" value="male" >${user_gender_male}
			<input type="radio" name="gender" value="female">${user_gender_female}
			<input type="radio" name="gender" value="other" >${user_gender_other}
		</label>
	</fieldset>

	<fieldset>
		<label>
			${user_country}
			<select name="country"> 
				<option value="Belarus" selected> ${user_country_belarus}</option>
				<option value="Russia"> ${user_country_russia}</option>
				<option value="Ukraine"> ${user_country_ukraine}</option>
				<option value="Israel"> ${user_country_israel}</option>
			</select>
		</label>
	</fieldset>
		

		<label>
			${user_language}
			<input type="checkbox" name="language" value="Belarusian" checked /> ${user_language_belarus}
			<input type="checkbox" name="language" value="Rusian" checked /> ${user_language_rusian}
			<input type="checkbox" name="language" value="English" checked /> ${user_language_english}
			<input type="checkbox" name="language" value="German" checked /> ${user_language_german}
		</label>
		
	<fieldset>
		<label>
			<textarea name="comment" value="hobby" > ${user_comment}</textarea>
		</label>
		
		<label>
			<form action="Controller" method="post">
				<input type="hidden" name="command" value="registration_new_user" />
				<button button name="button"> <strong>${submit_button}</strong> </button>
			</form>
		</label>
	</fieldset>
		
</form>

</body>
</html>