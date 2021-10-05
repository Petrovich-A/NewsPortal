package by.http.newsportal.controller.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

public class GoToViewNewsPage implements ICommand {
	private static final ServiceProvider SERVICE_PROVIDER = ServiceProvider.getInstance();
	private static final INewsService I_NEWS_SERVICE = SERVICE_PROVIDER.getNewsService();
	final static String PATH = "/WEB-INF/jsp/viewNewsPage.jsp";

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<News> listNews = new ArrayList<News>();
		try {
			listNews = I_NEWS_SERVICE.getListNews();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		int id = Integer.parseInt(request.getParameter("id"));
		News newsChoisen = new News();
		for (News news : listNews) {
			if (news.getId() == id) {
				newsChoisen.setTitle(news.getTitle()); 
				newsChoisen.setBrief(news.getBrief());
				newsChoisen.setContent(news.getContent());
				newsChoisen.setAuthor(news.getAuthor());
				newsChoisen.setDateDB(news.getDateDB());
			}
		}
		System.out.println("newsChoisen: " + newsChoisen.toString());
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(PATH);
		HttpSession session = request.getSession(true);
		session.setAttribute("newsChoisen", newsChoisen);
		request.setAttribute("url", PATH);
		requestDispatcher.forward(request, response);
	}

}
