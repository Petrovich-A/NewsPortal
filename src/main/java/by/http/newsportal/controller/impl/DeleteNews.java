package by.http.newsportal.controller.impl;

import java.io.IOException;

import by.http.newsportal.bean.News;
import by.http.newsportal.controller.ICommand;
import by.http.newsportal.service.INewsService;
import by.http.newsportal.service.ServiceProvider;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class DeleteNews implements ICommand {
	private static final ServiceProvider SERVICE_PROVIDER = ServiceProvider.getInstance();
	private static final INewsService I_NEWS_SERVICE = SERVICE_PROVIDER.getNewsService();
	final static String PATH = "/WEB-INF/jsp/manageNewsPage.jsp";

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
//		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("DeleteNews command \n id: " + id);
		
		try {
			I_NEWS_SERVICE.delete(Integer.parseInt(id));
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(PATH);
		HttpSession session = request.getSession(true);
		request.getSession(true).setAttribute("url", PATH);
		requestDispatcher.forward(request, response);
	}
}