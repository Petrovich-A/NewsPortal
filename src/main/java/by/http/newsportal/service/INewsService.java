package by.http.newsportal.service;

import java.util.List;

import by.http.newsportal.bean.News;

public interface INewsService {
	public List<News> getListNews() throws ServiceException;

	public void create(News news) throws ServiceException;

	public News read(int id) throws ServiceException;

	public void update(News news, int id) throws ServiceException;

	public void delete(int id) throws ServiceException;

}