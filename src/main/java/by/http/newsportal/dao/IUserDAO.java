package by.http.newsportal.dao;

import by.http.newsportal.bean.RegistrationInfo;
import by.http.newsportal.bean.User;

public interface IUserDAO {
	/**
	 * registration method
	 * 
	 * @param registrationInfo
	 * @throws DAOException
	 */
	public void registration(RegistrationInfo registrationInfo) throws DAOException;

	/**
	 * read method
	 * 
	 * @param registrationInfo
	 * @throws DAOException
	 */
	public User authorization(User user) throws DAOException;

	/**
	 * update method
	 * 
	 * @param registrationInfo
	 * @throws DAOException
	 */
	public void update(RegistrationInfo registrationInfo) throws DAOException;

	/**
	 * delete method
	 * 
	 * @param registrationInfo
	 * @throws DAOException
	 */
	public void delete(RegistrationInfo registrationInfo) throws DAOException;

}
