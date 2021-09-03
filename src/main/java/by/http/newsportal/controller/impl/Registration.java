package by.http.newsportal.controller.impl;

import java.io.IOException;

import by.http.newsportal.bean.RegistrationInfo;
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

public class Registration implements ICommand {
	private static final ServiceProvider SERVICE_PROVIDER = ServiceProvider.getInstance();
	private static final IUserService I_USER_SERVICE = SERVICE_PROVIDER.getUserService();
	private String path = "";
	private static final String PATH_SESSION = "";

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String eMail = request.getParameter("eMail");
		String gender = request.getParameter("gender");
		String country = request.getParameter("country");
		String[] language = request.getParameterValues("language");
		String hobby = request.getParameter("hobby");
		System.out.println("name is put " + name);
		System.out.println("password is put " + password);
		System.out.println("eMail is put " + eMail);
		System.out.println("gender is put " + gender);
		System.out.println("country is put " + country);
		System.out.println("language is put " + language);
		System.out.println("hobby is put " + hobby);

		if (name == null || name.equals("") || password == null || password.equals("")) {
			path = "/WEB-INF/jsp/authorizationPage.jsp";
			response.sendRedirect("Controller?command=go_to_registration_page&message=Please regist");
			return;
		}

		RegistrationInfo registrationInfo = new RegistrationInfo(name, password, eMail, gender, country, language,
				hobby);

		try {
			User user = I_USER_SERVICE.registration(registrationInfo);
			HttpSession session = request.getSession(true);
			session.setAttribute("user", user);
			request.getSession(true).setAttribute(PATH_SESSION, path);
			request.setAttribute("message", "Please log in");
			response.sendRedirect("Controller?command=go_to_registration_info_page");

		} catch (ServiceException e) {
			path = "/WEB-INF/jsp/registrationInfoPagejsp";
			RequestDispatcher requestDispatcher = request.getRequestDispatcher(path);
			HttpSession session = request.getSession(true);
			request.getSession(true).setAttribute("url", path);
			e.printStackTrace();
			response.sendRedirect("Controller?command=go_to_registration_page&message=Please regist");
			// go to jsp - go to error
		}
	}
}
