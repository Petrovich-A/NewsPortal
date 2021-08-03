package by.http.newsportal.service.impl;

import by.http.newsportal.bean.RegistrationInfo;
import by.http.newsportal.bean.User;
import by.http.newsportal.service.IUserService;
import by.http.newsportal.service.ServiceException;

public class UserServiceImpl implements IUserService{

	@Override
	public void registration(RegistrationInfo registrationInfo) throws ServiceException {
		
//		try {
//			
//			throw new DAOException(); //stub
//	
//		} catch (DAOException e) {
//			throw new ServiceException(e);
//		}
		
	}

	@Override
	public User logIn(char[] logIn, char[] password) throws ServiceException {
		return new User(logIn, password);
		
	}
	
}
