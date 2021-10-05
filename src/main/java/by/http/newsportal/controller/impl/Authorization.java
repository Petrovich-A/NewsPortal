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
		String role = request.getParameter("role");
		String login = request.getParameter("login");
		String remember = request.getParameter("remember");
		HttpSession session = request.getSession(true);
		User user = new User(role, login);

		try {
			user = I_USER_SERVICE.authorization(role, login);
			session.setAttribute("user", user);
			System.out.println("Authorization user: " + user);
			response.sendRedirect("Controller?command=go_to_LogIn_Info_Page.jsp");

		} catch (ServiceException e) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher(PATH);
			requestDispatcher.forward(request, response);
			e.printStackTrace();
			request.getSession(true).setAttribute("url", PATH);
		}
	}

}
