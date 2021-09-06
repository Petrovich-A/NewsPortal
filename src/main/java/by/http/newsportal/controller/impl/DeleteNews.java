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

public class DeleteNews implements ICommand {
	private static final ServiceProvider SERVICE_PROVIDER = ServiceProvider.getInstance();
	private static final INewsService I_NEWS_SERVICE = SERVICE_PROVIDER.getNewsService();
	final static String PATH = "/WEB-INF/jsp/main.jsp";

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}