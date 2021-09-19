package by.http.newsportal.controller.impl;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;

import by.http.newsportal.bean.News;
import by.http.newsportal.controller.ICommand;
import by.http.newsportal.service.INewsService;
import by.http.newsportal.service.ServiceException;
import by.http.newsportal.service.ServiceProvider;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddNews implements ICommand {
	private static final ServiceProvider SERVICE_PROVIDER = ServiceProvider.getInstance();
	private static final INewsService I_NEWS_SERVICE = SERVICE_PROVIDER.getNewsService();
	final static String PATH = "/WEB-INF/jsp/main.jsp";

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String brief = request.getParameter("brief");
		String content = request.getParameter("content");
		String author = request.getParameter("author");
		Date date = Date.valueOf(LocalDate.now());

		News news = new News(title, brief, content, author, date);
		System.out.println("News from UI: \n [title=" + title + ", brief=" + brief + ", content=" + content + ", author="
				+ author + ", date=" + date + "]");
		try {
			I_NEWS_SERVICE.add(news);

		} catch (ServiceException e) {
			e.printStackTrace();
			// TODO: handle exception ������� �� �������, �� ���� �� ��������, ���� �����
		}
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(PATH);
		HttpSession session = request.getSession(true);
		request.getSession(true).setAttribute("url", PATH);
		requestDispatcher.forward(request, response);
	}
}