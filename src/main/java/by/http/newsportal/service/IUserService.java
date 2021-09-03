package by.http.newsportal.service;

import by.http.newsportal.bean.RegistrationInfo;
import by.http.newsportal.bean.User;

public interface IUserService {

	User registration(RegistrationInfo registrationInfo) throws ServiceException;

	User authorization(RegistrationInfo registrationInfo) throws ServiceException;
	
	boolean validation(RegistrationInfo registrationInfo)throws ServiceException;

}
