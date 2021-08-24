package by.http.newsportal.controller.impl;

import java.io.IOException;

import by.http.newsportal.bean.User;
import by.http.newsportal.controller.ICommand;
import by.http.newsportal.service.IUserService;
import by.http.newsportal.service.ServiceProvider;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LogIn implements ICommand {
	final static String PATH = "/WEB-INF/jsp/logInInfoPage.jsp";
	private static final ServiceProvider PROVIDER = ServiceProvider.getInstance();
	private static final IUserService I_USER_SERVICE = PROVIDER.getUserService();

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		System.out.println("name is put " + name);
		String password = request.getParameter("password");
		System.out.println("password is put " + password);
		
	if (name == null || name.equals("") || password == null || password.equals("")) {
	}
	User user = new User(name, password);

//	try {
//			User user = I_USER_SERVICE.registration(registrationInfo); 
//			HttpSession session = request.getSession(true);
//			session.setAttribute("user", user);
//			response.sendRedirect("Controller?command=go_to_LogIn_Info_Page.jsp");
//
//		} catch (ServiceException e) {
//			RequestDispatcher requestDispatcher = request.getRequestDispatcher(PATH);
//			requestDispatcher.forward(request, response);
//			e.printStackTrace();
//			request.getSession(true).setAttribute("url", PATH);
//			request.getSession(true).setAttribute("user", user);
//		}
	}

}
