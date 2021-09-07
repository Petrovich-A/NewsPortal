package by.http.newsportal.dao;

import by.http.newsportal.dao.impl.NewsDAOImpl;
import by.http.newsportal.dao.impl.UserDAOImpl;

public class DAOProvider {
	private static final DAOProvider INSTANCE = new DAOProvider();
	private final IUserDAO iUserDAO = new UserDAOImpl();
	private final INewsDAO iNewsDAO = new NewsDAOImpl();
	private final UserDAOImpl registrationInfoDaoImpl = new UserDAOImpl();

	private DAOProvider() {
	}

	public static DAOProvider getInstance() {
		return INSTANCE;
	}

	public UserDAOImpl getRegistrationInfoDaoImpl() {
		return registrationInfoDaoImpl;
	}

	public IUserDAO getUserDAO() {
		return iUserDAO;
	}

	public INewsDAO getNewsDAO() {
		return iNewsDAO;
	}
}
