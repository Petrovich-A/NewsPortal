package by.http.newsportal.service;

import by.http.newsportal.bean.RegistrationInfo;
import by.http.newsportal.bean.User;

public interface IUserService {
	
	void registration(RegistrationInfo registrationInfo)throws ServiceException;
	User logIn (char[] logIn, char[] password)throws ServiceException;

}
