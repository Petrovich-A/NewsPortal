package by.http.newsportal.controller.impl;

import java.io.IOException;

import by.http.newsportal.bean.RegistrationInfo;
import by.http.newsportal.controller.ICommand;
import by.http.newsportal.service.IUserService;
import by.http.newsportal.service.ServiceException;
import by.http.newsportal.service.ServiceProvider;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegistrationNewUser implements ICommand {
	final static String PATH = "/WEB-INF/jsp/LogInPage.jsp";
	
	private static final ServiceProvider provider = ServiceProvider.getInstance();
	private static final IUserService userService = provider.getUserService();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		if (request.getParameter(PATH) == null) {
			
		}
		RegistrationInfo registrationInfo = new RegistrationInfo(null, null, null, null, null, null);
		try {
			
			userService.registration(registrationInfo);
			request.setAttribute("message", "Please log in");
			response.sendRedirect("Controller?command=logIn&message=Please log in");
			
		} catch (ServiceException e) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher(PATH);
			requestDispatcher.forward(request, response);
			e.printStackTrace();
			
			request.getSession(true).setAttribute("url", PATH);
			
			
//			request.getParameter();
			
			//validation
			//User user
			//console writer
			//go to jsp - go to error
			
		}
		
	}

}
