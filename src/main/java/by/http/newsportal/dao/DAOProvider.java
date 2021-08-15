package by.http.newsportal.dao;

import by.http.newsportal.dao.imp.NewsDAO;
import by.http.newsportal.dao.imp.UserDAO;

public class DAOProvider {
	private static final DAOProvider INSTANCE = new DAOProvider();

	private final IUserDAO userDAO = new UserDAO();
	private final INewsDAO newsDAO = new NewsDAO();

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
