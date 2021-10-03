package by.http.newsportal.controller.impl;

import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

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
		Timestamp date = Timestamp.valueOf(LocalDateTime.now());
		News news = new News(title, brief, content, author, date);
		try {
			I_NEWS_SERVICE.create(news);

		} catch (ServiceException e) {
			e.printStackTrace();
			// TODO: handle exception новость не создана, на этой же странице, стэк трэйс
		}
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(PATH);
		HttpSession session = request.getSession(true);
		request.getSession(true).setAttribute("url", PATH);
		response.sendRedirect("Controller?command=go_to_main_page");
	}
}