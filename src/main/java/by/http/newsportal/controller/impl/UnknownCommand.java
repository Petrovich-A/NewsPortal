package by.http.newsportal.controller.impl;

import java.io.IOException;

import by.http.newsportal.controller.ICommand;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UnknownCommand implements ICommand {
	final static String PATH = "/WEB-INF/jsp/unknownCommandPage.jsp";

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(PATH);
		requestDispatcher.forward(request, response);
	}
}
