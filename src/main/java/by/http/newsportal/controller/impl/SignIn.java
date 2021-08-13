package by.http.newsportal.controller.impl;

import java.io.IOException;

import by.http.newsportal.bean.User;
import by.http.newsportal.controller.ICommand;
import by.http.newsportal.service.IUserService;
import by.http.newsportal.service.ServiceException;
import by.http.newsportal.service.ServiceProvider;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SignIn implements ICommand {
	final static String PATH = "/WEB-INF/jsp/LogInInfoPage.jsp";
	private static final ServiceProvider provider = ServiceProvider.getInstance();
	private static final IUserService userService = provider.getUserService();

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		try {
//			User user = userService.logIn(null, null);
//			HttpSession session = request.getSession(true);
//			session.setAttribute("user", user);
//			response.sendRedirect("Controller?command=go_to_LogIn_Info_Page.jsp");
//
//		} catch (ServiceException e) {
//			RequestDispatcher requestDispatcher = request.getRequestDispatcher(PATH);
//			requestDispatcher.forward(request, response);
//			e.printStackTrace();
//			User user = new User();
//			request.getSession(true).setAttribute("url", PATH);
//			request.getSession(true).setAttribute("user", user);
		}
	}

//}
