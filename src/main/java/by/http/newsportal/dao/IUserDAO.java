package by.http.newsportal.dao;

import by.http.newsportal.bean.RegistrationInfo;

public interface IUserDAO {
	/**
	 * create method
	 * 
	 * @param registrationInfo
	 * @throws DAOException
	 */
	public void add(RegistrationInfo registrationInfo) throws DAOException;

	/**
	 * read method
	 * 
	 * @param registrationInfo
	 * @throws DAOException
	 */
	public void getByID(RegistrationInfo registrationInfo) throws DAOException;

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
	public void remove(RegistrationInfo registrationInfo) throws DAOException;

}
