<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<link href="resources/css/style.css" rel="stylesheet">
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
	<h1>${registrationPageH1_text}</h1>
	<hr />
	<h2>${registrationPageH2_text}</h2>

	<form action="Controller" method="post">

		<fieldset class="add news">
			<label> ${news_title} <input type="text" name="title" required="required" maxlength="55">
			</label>
			
			<label><textarea name="brief" required="required" rows="10" cols="60" maxlength="800"
					onfocus="if(this.value==this.defaultValue)this.value='';"
					onblur="if(this.value=='')this.value=this.defaultValue;"> ${news_brief} </textarea> 
			</label>
			
			<br>
			<label> <textarea name="content" required="required" rows="20" cols="60" maxlength="10_000"
					onfocus="if(this.value==this.defaultValue)this.value='';"
					onblur="if(this.value=='')this.value=this.defaultValue;"> ${news_content} </textarea>
			</label>
			
			<br>
			<label> ${news_author} <input type="text" name="author" required="required" maxlength="60">
			</label>

		</fieldset>

		<label> <input type="hidden" name="command" value="add_news" />
			<button name="button">
				<strong>${submit_button}</strong>
			</button>
		</label>

	</form>
</body>

</html>