package by.http.newsportal.service;

import by.http.newsportal.service.impl.NewsServiceImpl;
import by.http.newsportal.service.impl.UserServiceImpl;

public class ServiceProvider {
	private static final ServiceProvider INSTANCE = new ServiceProvider();

	private final IUserService userService = new UserServiceImpl();
	private final INewsService newsService = new NewsServiceImpl();
	
	private ServiceProvider() {

	}

	public static ServiceProvider getInstance() {
		return INSTANCE;
	}

	public IUserService getUserService() {
		return userService;
	}

	public INewsService getNewsService() {
		return newsService;
	}

}
