package by.http.newsportal.service.impl;

import by.http.newsportal.bean.RegistrationInfo;
import by.http.newsportal.bean.User;
import by.http.newsportal.dao.DAOException;
import by.http.newsportal.dao.DAOProvider;
import by.http.newsportal.dao.impl.UserDAOImpl;
import by.http.newsportal.service.IUserService;
import by.http.newsportal.service.ServiceException;

public class UserServiceImpl implements IUserService {
	private final DAOProvider DAO_PROVIDER = DAOProvider.getInstance();
	private final UserDAOImpl USER_DAO_IMPL  = DAO_PROVIDER.getRegistrationInfoDaoImpl();

	@Override
	public User registration(RegistrationInfo registrationInfo) throws ServiceException {
		User user = null;
		try {
			USER_DAO_IMPL.registration(registrationInfo);
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage(), e);
		}
		return user;
	}

	@Override
	public User authorization(RegistrationInfo registrationInfo) throws ServiceException {
		User user = null;
		try {
			user = USER_DAO_IMPL.authorization(registrationInfo);
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage(), e);
		}
		if (user == null) {
			throw new ServiceException("User isn't found");
		}
		return user;
	}

	@Override
	public boolean validation(RegistrationInfo registrationInfo) throws ServiceException {
		// TODO Auto-generated method stub
		return false;
	}
}
