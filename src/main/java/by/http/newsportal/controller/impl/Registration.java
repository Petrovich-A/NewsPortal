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
		String path;
		String role = "ADMINISTRATOR";
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String eMail = request.getParameter("eMail");
		String gender = request.getParameter("gender");
		String country = request.getParameter("country");
		String language = request.getParameter("language");
		String hobby = request.getParameter("hobby");
		Date date = Date.valueOf(LocalDate.now());

		System.out.println("RegistrationInfo to BD:\n [role=" + role + ", name=" + name + ", password=" + password + ", eMail=" + eMail
				+ ", gender=" + gender + ", country=" + country + ", language=" + language + ", hobby=" + hobby
				+ ", date=" + date + "]");

		if (name == null || name.equals("") || password == null || password.equals("")
				|| eMail == null || eMail.equals("") || gender == null || gender.equals("")) {
			response.sendRedirect("Controller?command=go_to_registration_page&message=Please regist");
			return;
		}

		RegistrationInfo registrationInfo = new RegistrationInfo(role, name, password, eMail, gender, country, language,
				hobby, date);

		try {
			I_USER_SERVICE.registration(registrationInfo);
			path = "/WEB-INF/jsp/registrationInfoPage.jsp";
			request.setAttribute("message", "Please log in");
			request.getSession(true).setAttribute("url", path);
			System.out.println("Registration in try before sendRedirect");
			response.sendRedirect("Controller?command=go_to_authorization_info_page");

		} catch (ServiceException e) {
			e.printStackTrace();
			path = "/WEB-INF/jsp/registrationInfoPage.jsp";
			request.getSession(true).setAttribute("url", path);
			System.out.println("Registration in catch before sendRedirect");
			response.sendRedirect("Controller?command=go_to_registration_page");
		}
	}
}
