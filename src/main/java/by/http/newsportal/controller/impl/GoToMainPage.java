package by.http.newsportal.controller.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.http.newsportal.bean.News;
import by.http.newsportal.controller.ICommand;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GoToMainPage implements ICommand{

	final static String PATH = "/WEB-INF/jsp/main.jsp";

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		List<News> news = new ArrayList<News>();
		news.add(new News("t1", "b1 b1 b1 b1"));
		news.add(new News("t2", "b2 b2 b2 b2"));
		
		request.setAttribute("news", news);
		request.getSession(true).setAttribute("url", PATH);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(PATH);
		requestDispatcher.forward(request, response);
	}

}