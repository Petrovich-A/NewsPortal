package by.http.newsportal.dao;

import java.util.List;

import by.http.newsportal.bean.News;
import by.http.newsportal.service.ServiceException;

public interface INewsDAO {
	public void add(News news) throws ServiceException;

	public List<News> read() throws ServiceException;

}
