package by.http.newsportal.controller.filter;

import java.io.IOException;

import by.http.newsportal.bean.RoleName;
import by.http.newsportal.bean.User;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@WebFilter(urlPatterns = "/*")

public class FiltrTest implements Filter {

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		HttpSession session = ((HttpServletRequest) servletRequest).getSession();
		User user = (User) session.getAttribute("RoleName");
		if (user != null) {
			RoleName roleName = user.getRole();
			if (roleName == roleName.ADMINISTRATOR) {
				servletRequest.setAttribute("administrator", "administrator");
			}
			if (roleName == roleName.USER) {
				servletRequest.setAttribute("user", "user");
			}
		}
		session.setAttribute("RoleName", new User(RoleName.ADMINISTRATOR, "loginExample"));
		filterChain.doFilter(servletRequest, servletResponse);
	}

}
