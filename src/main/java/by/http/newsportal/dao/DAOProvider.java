package by.http.newsportal.dao;

import by.http.newsportal.dao.imp.NewsDAOImp;
import by.http.newsportal.dao.imp.UserDAOImpl;

public class DAOProvider {
	private static final DAOProvider INSTANCE = new DAOProvider();

	private final IUserDAO userDAO = new UserDAOImpl();
	private final INewsDAO newsDAO = new NewsDAOImp();

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
