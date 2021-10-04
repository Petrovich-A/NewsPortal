package by.http.newsportal.controller.impl;

import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import by.http.newsportal.bean.News;
import by.http.newsportal.controller.ICommand;
import by.http.newsportal.service.INewsService;
import by.http.newsportal.service.ServiceProvider;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class UpdateNews implements ICommand {
	private static final ServiceProvider SERVICE_PROVIDER = ServiceProvider.getInstance();
	private static final INewsService I_NEWS_SERVICE = SERVICE_PROVIDER.getNewsService();
	final static String PATH = "/WEB-INF/jsp/viewNewsPage.jsp";

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("id: " + request.getParameter("id"));
		System.out.println("/n title: " + request.getParameter("title"));
		int id = Integer.parseInt(request.getParameter("id"));
		String title = request.getParameter("title");
		String brief = request.getParameter("brief");
		String content = request.getParameter("content");
		String author = request.getParameter("author");
		String date = request.getParameter("date");
		News news = new News(id, title, brief, content, author, date);
		System.out.println("UpdateNews method command \n news: " + news);

		try {
			System.out.println("id");
			I_NEWS_SERVICE.update(news, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(PATH);
		HttpSession session = request.getSession(true);
		request.setAttribute("url", PATH);
		request.setAttribute("newsChoisen", news);
		requestDispatcher.forward(request, response);
	}
}