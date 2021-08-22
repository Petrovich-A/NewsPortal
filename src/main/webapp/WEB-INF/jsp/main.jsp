<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/style.css" rel="stylesheet">
<title>My News main</title>

<fmt:setLocale value="${sessionScope.local}" />
<fmt:setBundle basename="properties.local" var="loc" />
<fmt:message bundle="${loc}" key="local.message" var="message" />
<fmt:message bundle="${loc}" key="local.loc.button.name.ru" var="ru_button" />
<fmt:message bundle="${loc}" key="local.loc.button.name.en" var="en_button" />
<fmt:message bundle="${loc}" key="local.main.button.registration" var="registration_button" />
<fmt:message bundle="${loc}" key="local.main.button.login" var="login_button" />
<fmt:message bundle="${loc}" key="local.main.button.addNews" var="addNews_button" />

</head>

<form action="Controller" method="post">
	<input type="hidden" name="command" value="change_local" />
	<input type="hidden" name="local" value="en" />
	<input type="submit" value="${en_button}" />
</form>

<form action="Controller" method="post">
	<input type="hidden" name="command" value="change_local" />
	<input type="hidden" name="local" value="ru" />
	<input type="submit" value="${ru_button}" />
</form>

<br />

<form action="Controller" method="post">
	<input type="hidden" name="command" value="go_to_add_news_page" />
	<input type="hidden" name="local" value="Add news" />
	<input type="submit" value="${addNews_button}" />
	<br />
</form>

<p>
	<img src="resources/logo.png">
</p>

<body>
<form action="Controller" method="post">
	<input type="hidden" name="command" value="go_to_registration_page" />
	<input type="hidden" name="local" value="Registration" />
	<input type="submit" value="${registration_button}" />
	<br />
</form>

<form action="Controller" method="post">
	<input type="hidden" name="command" value="go_to_log_in_page" />
	<input type="hidden" name="local" value="Log in" />
	<input type="submit" value="${login_button}" />
	<br />
</form>

</body>
</html>