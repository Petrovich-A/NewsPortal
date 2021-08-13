package by.http.newsportal.dao.imp;

import by.http.newsportal.dao.INewsDAO;
import by.http.newsportal.dao.IUserDAO;
import by.http.newsportal.service.INewsService;
import by.http.newsportal.service.IUserService;
import by.http.newsportal.service.ServiceProvider;
import by.http.newsportal.service.impl.NewsServiceImpl;
import by.http.newsportal.service.impl.UserServiceImpl;

public class DAOProvider {
	private static final DAOProvider instance = new DAOProvider();

	private final IUserDAO userDAO = new UserDAOImpl();
	private final INewsDAO newsDAO = new NewsDAOImpl();

	private DAOProvider() {

	}

	public static DAOProvider getInstance() {
		return instance;
	}

	public IUserDAO getUserDAO() {
		return userDAO;
	}

	public INewsDAO getNewsDAO() {
		return newsDAO;
	}

}
