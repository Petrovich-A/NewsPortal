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

public class Authorization implements ICommand {
	final static String PATH = "/WEB-INF/jsp/authorizationInfoPage.jsp";
	private static final ServiceProvider PROVIDER = ServiceProvider.getInstance();
	private static final IUserService I_USER_SERVICE = PROVIDER.getUserService();

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String role = "ADMINISTRATOR";
		String login = request.getParameter("login");
		String password = request.getParameter("password");
//		String remember = request.getParameter("remember");
		HttpSession session = request.getSession(true);
		User userFromUI = new User(login, password);
		System.out.println("Authorization userFromUI: " + userFromUI);
		session.setAttribute("user", userFromUI);

		try {
			userFromUI = I_USER_SERVICE.authorization(userFromUI);
			request.getSession(true).setAttribute("user", userFromUI);
			System.out.println("userFromUI Authorization " + userFromUI);
			response.sendRedirect("Controller?command=go_to_authorization_info_page");

		} catch (ServiceException e) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher(PATH);
			requestDispatcher.forward(request, response);
			e.printStackTrace();
			request.getSession(true).setAttribute("url", PATH);
		}
	}

}
