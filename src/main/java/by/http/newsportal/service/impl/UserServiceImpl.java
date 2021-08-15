package by.http.newsportal.service.impl;

import by.http.newsportal.bean.RegistrationInfo;
import by.http.newsportal.dao.DAOProvider;
import by.http.newsportal.dao.IUserDAO;
import by.http.newsportal.service.IUserService;
import by.http.newsportal.service.ServiceException;

public class UserServiceImpl implements IUserService {
	private static final DAOProvider DAO_PROVIDER = DAOProvider.getInstance();
	private final IUserDAO USER_DAO = DAO_PROVIDER.getUserDAO();

	@Override
	public void registration(RegistrationInfo registrationInfo) throws ServiceException {
//		try {
//			USER_DAO.add(registrationInfo);
//		} catch (ServiceException e) {
//			throw new ServiceException(e.getMessage(), e);
//		}

	}

}
