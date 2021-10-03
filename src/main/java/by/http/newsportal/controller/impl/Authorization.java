package by.http.newsportal.controller.impl;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;

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

public class Authorization implements ICommand {
	final static String PATH = "/WEB-INF/jsp/authorizationInfoPage.jsp";
	private static final ServiceProvider PROVIDER = ServiceProvider.getInstance();
	private static final IUserService I_USER_SERVICE = PROVIDER.getUserService();

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String role = request.getParameter("role");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String eMail = request.getParameter("eMail");
		String gender = request.getParameter("gender");
		String country = request.getParameter("country");
		String language = request.getParameter("language");
		String hobby = request.getParameter("hobby");
		Date date = Date.valueOf(LocalDate.now());

		System.out.println("RegistrationInfo from UI [role=" + role + ", name=" + name + ", password=" + password
				+ ", eMail=" + eMail + ", gender=" + gender + ", country=" + country + ", language=" + language
				+ ", hobby=" + hobby + ", date=" + date + "]");

		if (name == null || name.equals("") || password == null || password.equals("")) {
			return;
		}
		RegistrationInfo registrationInfo = new RegistrationInfo(role, name, password, eMail, gender, country, language,
				hobby, date);
		try {
			User user = I_USER_SERVICE.authorization(registrationInfo);
			HttpSession session = request.getSession(true);
			session.setAttribute("user", user);
			session.setAttribute("role", user.getRole().toString());
			response.sendRedirect("Controller?command=go_to_LogIn_Info_Page.jsp");

		} catch (ServiceException e) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher(PATH);
			requestDispatcher.forward(request, response);
			e.printStackTrace();
			request.getSession(true).setAttribute("url", PATH);
		}
	}

}
