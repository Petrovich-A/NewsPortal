<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<link href="resources/css/logIn.css" rel="stylesheet">
<link href="resources/css/style.css" rel="stylesheet">
<title>Log in</title>
<fmt:setLocale value="${sessionScope.local}" />
<fmt:setBundle basename="properties.local" var="loc" />
<fmt:message bundle="${loc}" key="local.message" var="message" />
<fmt:message bundle="${loc}" key="local.login.page.h1"	var="LoginPageH1_text" />
<fmt:message bundle="${loc}" key="local.login.page.h2"	var="LoginPageH2_text" />
<fmt:message bundle="${loc}" key="local.login.page.user.name" var="user_name" />
<fmt:message bundle="${loc}" key="local.login.page.user.password" var="user_password" />
<fmt:message bundle="${loc}" key="local.login.button.submit" var="submit_button" />
<fmt:message bundle="${loc}" key="local.login.page.checkbox.remember" var="remember_checkbox" />
</head>

<body>
<h1>
	<b>${LoginPageH1_text}</b>
</h1>
<hr />
<h2>${LoginPageH2_text}</h2>
<br />

<font color="red" size="10"> <%
	String mes = (String) request.getParameter("message");
		if (mes != null) {
	out.print(mes);
	}
%>
</font>

<form action="Controller" method="post">

	<fieldset class="logIn-info">
		<label>
			${user_name} <input type="text" required="required" name="username">
		</label>
		<label>
			${user_password} <input type="password"	required="required" name="password">
		</label>
	</fieldset>

	<fieldset class="logIn-action">
		<label>
			<input class="btn" type="submit" name="submit" value="${submit_button}"> 
			<input type="checkbox" name="remember" value="rememberMe"> ${remember_checkbox}
			<input type="hidden" name="command" value=logInInfo />
		</label>
	</fieldset>
</form>
</body>

</html>