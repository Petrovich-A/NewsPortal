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
	private final UserDAOImpl USER_DAO_IMPL = DAO_PROVIDER.getRegistrationInfoDaoImpl();

	@Override
	public void registration(RegistrationInfo registrationInfo) throws ServiceException {
		try {
			USER_DAO_IMPL.registration(registrationInfo);
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}

	@Override
	public User authorization(User userFromUI) throws ServiceException {
//		сравнить объект из базы с логином из юай
		User userFromDB = new User();
		try {
			userFromDB = USER_DAO_IMPL.authorization(userFromUI);
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage(), e);
		}

		if (userFromDB == null) {
			throw new ServiceException("UserServiceImpl: userFromDB isn't found");
		} else if (userFromUI.getLogin().equals(userFromDB.getLogin())) {
			
			System.out.println("equals ok");
		}
		return userFromDB;
	}

	@Override
	public boolean validation(RegistrationInfo registrationInfo) throws ServiceException {
		// TODO Auto-generated method stub
		return false;
	}
}
