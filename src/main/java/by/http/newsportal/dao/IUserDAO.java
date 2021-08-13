package by.http.newsportal.dao;

import by.http.newsportal.bean.RegistrationInfo;
import by.http.newsportal.service.ServiceException;

public interface IUserDAO {

	public void add(RegistrationInfo registrationInfo) throws ServiceException;

}
