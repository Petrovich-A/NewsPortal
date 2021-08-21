package by.http.newsportal.controller.impl;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;

import by.http.newsportal.bean.News;
import by.http.newsportal.controller.ICommand;
import by.http.newsportal.service.INewsService;
import by.http.newsportal.service.ServiceException;
import by.http.newsportal.service.ServiceProvider;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddNews implements ICommand {
	private static final ServiceProvider SERVICE_PROVIDER = ServiceProvider.getInstance();
	private static final INewsService I_NEWS_SERVICE = SERVICE_PROVIDER.getNewsService();

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		System.out.println("title is put " + title);
		String brief = request.getParameter("brief");
		System.out.println("brief is put " + brief);
		String content = request.getParameter("content");
		System.out.println("content is put " + content);
		String author = request.getParameter("author");
		System.out.println("author is put " + author);
		Date date = Date.valueOf(LocalDate.now());
		System.out.println("news is added");

		News news = new News(title, brief, content, author, date);
		
		try {
			I_NEWS_SERVICE.add(news);

		} catch (ServiceException e) {
			// TODO: handle exception новость не создана, на этой же странице, стэк трэйс
		}

	}
}