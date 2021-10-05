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

public class FiltrRole implements Filter {

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		HttpSession session = ((HttpServletRequest) servletRequest).getSession(true);


		filterChain.doFilter(servletRequest, servletResponse);
	}

}
