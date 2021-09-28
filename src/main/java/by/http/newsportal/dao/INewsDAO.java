package by.http.newsportal.dao;

import java.util.List;

import by.http.newsportal.bean.News;
import by.http.newsportal.service.ServiceException;

public interface INewsDAO {

	/**
	 * create
	 * 
	 * @param news
	 * @throws ServiceException
	 */
	public void create(News news) throws DAOException;

	/**
	 * getListNews
	 * 
	 * @return List<News>
	 * @throws DAOException
	 */
	public List<News> getListNews() throws DAOException;

	/**
	 * read
	 * 
	 * @return
	 * @throws DAOException
	 */
	public News read(int chosenId) throws DAOException;

	/**
	 * update
	 * 
	 * @param news
	 * @throws ServiceException
	 */
	public void update(News news, int id) throws DAOException;

	/**
	 * delete
	 * 
	 * @param news
	 * @return
	 * @throws ServiceException
	 */
	public void delete(int id) throws DAOException;

}
