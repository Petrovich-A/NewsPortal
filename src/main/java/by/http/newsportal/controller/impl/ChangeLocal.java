package by.http.newsportal.controller.impl;

import java.io.IOException;
import by.http.newsportal.controller.ICommand;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class ChangeLocal implements ICommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		session.setAttribute("local", request.getParameter("local"));
		
		String path = (String)session.getAttribute("url");
		request.getRequestDispatcher(path).forward(request, response);
	}

}
