package by.http.newsportal.controller.impl;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;

import by.http.newsportal.bean.RegistrationInfo;
import by.http.newsportal.controller.ICommand;
import by.http.newsportal.service.IUserService;
import by.http.newsportal.service.ServiceException;
import by.http.newsportal.service.ServiceProvider;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Registration implements ICommand {
	private static final ServiceProvider SERVICE_PROVIDER = ServiceProvider.getInstance();
	private static final IUserService I_USER_SERVICE = SERVICE_PROVIDER.getUserService();

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = null;
		String role = null;
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String eMail = request.getParameter("eMail");
		String gender = request.getParameter("gender");
		String country = request.getParameter("country");
		String language = request.getParameter("language");
		String hobby = request.getParameter("hobby");
		Date date = Date.valueOf(LocalDate.now());
		RegistrationInfo registrationInfo = null;

		role = name.equals("admin") ? "ADMINISTRATOR" : "AUTHORIZED_USER";
		registrationInfo = new RegistrationInfo(role, name, password, eMail, gender, country, language, hobby, date);
		System.out.println("Registration registrationInfo: " + registrationInfo);

		try {
			I_USER_SERVICE.registration(registrationInfo);
			path = "/WEB-INF/jsp/registrationInfoPage.jsp";
			request.setAttribute("message", "Please log in");
			request.getSession(true).setAttribute("url", path);
			response.sendRedirect("Controller?command=go_to_authorization_info_page");

		} catch (ServiceException e) {
			e.printStackTrace();
			path = "/WEB-INF/jsp/registrationInfoPage.jsp";
			request.getSession(true).setAttribute("url", path);
			response.sendRedirect("Controller?command=go_to_registration_page");
		}
	}

}
