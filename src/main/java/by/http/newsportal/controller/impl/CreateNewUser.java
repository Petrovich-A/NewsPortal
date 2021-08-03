package by.http.newsportal.controller.impl;

import java.io.IOException;

import by.http.newsportal.controller.ICommand;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CreateNewUser implements ICommand{
	final static String PATH = "/WEB-INF/jsp/RegistrationInfoPage.jsp";  

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(PATH);
		requestDispatcher.forward(request, response);
		
		request.getSession(true).setAttribute("url", PATH);
		
//		request.getParameter();
		
		//validation
		//User user
		//console writer
		//go to jsp - go to error
		
	}

}
