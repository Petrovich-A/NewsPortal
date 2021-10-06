package by.http.newsportal.service;

import by.http.newsportal.bean.RegistrationInfo;
import by.http.newsportal.bean.User;

public interface IUserService {

	public void registration(RegistrationInfo registrationInfo) throws ServiceException;

	public User authorization(User user) throws ServiceException;

	public boolean validation(RegistrationInfo registrationInfo) throws ServiceException;

}
