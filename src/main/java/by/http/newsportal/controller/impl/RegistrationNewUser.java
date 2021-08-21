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

	private static final String PATH = "/WEB-INF/jsp/logInPage.jsp";
	private static final String PATH_SESSION = "";
	private static final ServiceProvider PROVIDER = ServiceProvider.getInstance();
	private static final IUserService USER_SERVICE = PROVIDER.getUserService();
	private static final RegistrationNewUser INSTANCE = new RegistrationNewUser();

	public static RegistrationNewUser getInstance() {
		return INSTANCE;
	}

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter(PATH) == null) {
		}
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String emailAddress = request.getParameter("email-address");
		String[] country = request.getParameterValues("country");
		String[] language = request.getParameterValues("language");
		String hobby = request.getParameter("hobby");

		if (name == null) {
			response.sendRedirect("Controller?command=RegistrationNewUser&message=Please regist");
		}

		RegistrationInfo registrationInfo = new RegistrationInfo(name, password, emailAddress, country, language,
				hobby);

		if (registrationInfo == null) {
			response.sendRedirect("Controller?command=RegistrationNewUser&message=Please !!");
		}

		try {

			USER_SERVICE.registration(registrationInfo);
			request.getSession(true).setAttribute(PATH_SESSION, PATH);
			request.setAttribute("message", "Please log in");
			response.sendRedirect("Controller?command=logIn&message=Please log in");

		} catch (ServiceException e) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher(PATH);
			request.getSession(true).setAttribute("url", PATH);
			requestDispatcher.forward(request, response);
			e.printStackTrace();

			// console writer
			// go to jsp - go to error

		}
	}
}
