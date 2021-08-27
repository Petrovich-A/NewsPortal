package by.http.newsportal.service;

import java.util.List;

import by.http.newsportal.bean.News;

public interface INewsService {
	public void add(News news) throws ServiceException;

	public List<News> getListNews() throws ServiceException;

	public void update(News news) throws ServiceException;

	public void delete(News news) throws ServiceException;

}