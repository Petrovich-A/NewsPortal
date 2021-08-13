package by.http.newsportal.service.impl;

import by.http.newsportal.bean.RegistrationInfo;
import by.http.newsportal.bean.User;
import by.http.newsportal.dao.imp.DAOProvider;
import by.http.newsportal.service.IUserService;
import by.http.newsportal.service.ServiceException;

public class UserServiceImpl implements IUserService {
	private static final DAOProvider DAO_PROVIDER = DAOProvider.getInstance();

	@Override
	public void registration(RegistrationInfo registrationInfo) throws ServiceException {

	}

}
