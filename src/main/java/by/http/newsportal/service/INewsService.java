package by.http.newsportal.service;

import java.util.List;

import by.http.newsportal.bean.News;

public interface INewsService {
	public void add(News news) throws ServiceException;
	
	public List<News> getListNews() throws ServiceException;
	
}