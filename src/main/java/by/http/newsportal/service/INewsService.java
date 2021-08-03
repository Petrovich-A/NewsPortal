package by.http.newsportal.service;

import by.http.newsportal.bean.News;

public interface INewsService {
	public void add(News news)throws ServiceException;
	
	public void update(News news) throws ServiceException;

}
