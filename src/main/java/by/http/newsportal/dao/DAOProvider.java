package by.http.newsportal.dao;

import by.http.newsportal.dao.impl.NewsDAOImpl;
import by.http.newsportal.dao.impl.UserDAOImpl;

public class DAOProvider {
	private static final DAOProvider INSTANCE = new DAOProvider();

	private final IUserDAO userDAO = new UserDAOImpl();
	private final INewsDAO newsDAO = new NewsDAOImpl();

	private DAOProvider() {

	}

	public static DAOProvider getInstance() {
		return INSTANCE;
	}

	public IUserDAO getUserDAO() {
		return userDAO;
	}

	public INewsDAO getNewsDAO() {
		return newsDAO;
	}

}
