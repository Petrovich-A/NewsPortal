package by.http.newsportal.controller.impl;

import java.io.IOException;

import by.http.newsportal.bean.User;
import by.http.newsportal.controller.ICommand;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddNews implements ICommand{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session == null) {
			//redirect go to log in page
			return;
		}
		
		User user = (User) session.getAttribute("user");
		//redirect go to login
		if (user == null) {
			return;
		}
		
		if (!"admibn".equals(user.getRole())) {
			//redirect go to login
			session.removeAttribute("user");
			//log
			return;
			
		}
	}
	

}
