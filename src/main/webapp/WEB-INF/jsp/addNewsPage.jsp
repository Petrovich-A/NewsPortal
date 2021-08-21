<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<fmt:message bundle="${loc}" key="local.addNews.page.h1" var="registrationPageH1_text" />
<fmt:message bundle="${loc}" key="local.addNews.page.h2" var="registrationPageH2_text" />
<fmt:message bundle="${loc}" key="local.addNews.page.news.title" var="news_title" />
<fmt:message bundle="${loc}" key="local.addNews.page.news.brief" var="news_brief" />
<fmt:message bundle="${loc}" key="local.addNews.page.news.content" var="news_content" />
<fmt:message bundle="${loc}" key="local.addNews.page.news.author" var="news_author" />
<fmt:message bundle="${loc}" key="local.addNews.page.button.submit" var="submit_button" />
</head>

<body>
	<h1>${registrationPageH1_text}</h1>
	<hr />
	<h2>${registrationPageH2_text}</h2>

	<form action="Controller" method="post">

		<fieldset class="add news">
			<fieldset>
				<label> 
					${news_title} <input type="text" name="title" required="required" maxlength="55">
				</label>
				<label>
					${news_brief} <input type="text" name="brief" required="required" maxlength="60">
				</label>
			</fieldset>

			<fieldset>
				<label>
					${news_content} <input type="text" name="content" required="required" maxlength="200">
				</label>
			</fieldset>
			
			<fieldset>
				<label>
					${news_author} <input type="text" name="author" required="required" maxlength="60">
				</label>
			</fieldset>

			<fieldset>
				<label>
					<input type="hidden" name="command" value="add_news" />
					<button name="button">
						<strong>${submit_button}</strong>
					</button>
				</label>
			</fieldset>

		</fieldset>
	</form>
</body>

</html>