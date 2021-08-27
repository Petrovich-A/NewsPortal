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
	public void add(News news) throws DAOException;

	/**
	 * read
	 * 
	 * @return
	 * @throws DAOException
	 */
	public List<News> getListNews() throws DAOException;

	/**
	 * update
	 * 
	 * @param news
	 * @throws ServiceException
	 */
	public void update(News news) throws DAOException;

	/**
	 * delete
	 * 
	 * @param news
	 * @throws ServiceException
	 */
	public void delete(News news) throws DAOException;
}
