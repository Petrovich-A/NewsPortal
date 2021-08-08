package by.http.newsportal.controller.impl;

import java.io.IOException;

import by.http.newsportal.controller.ICommand;
import by.http.newsportal.dao.imp.NewsRepos;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class GoToRegistration implements ICommand {
	final static String PATH = "/WEB-INF/jsp/RegistrationPage.jsp";

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		NewsRepos newsRepos = new NewsRepos();
		try {
			newsRepos.addNews();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(PATH);
		requestDispatcher.forward(request, response);
		
		HttpSession session = request.getSession(true);
		session.setAttribute("local", request.getParameter("local"));
		
		request.getSession(true).setAttribute("url", PATH);
		
		
	}

}
