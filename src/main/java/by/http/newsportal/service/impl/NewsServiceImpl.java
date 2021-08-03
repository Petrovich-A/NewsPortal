package by.http.newsportal.service.impl;

import by.http.newsportal.bean.News;
import by.http.newsportal.dao.DAOException;
import by.http.newsportal.service.INewsService;
import by.http.newsportal.service.ServiceException;

public class NewsServiceImpl implements INewsService {

	@Override
	public void add(News news) throws ServiceException{
		
		try {
			
			throw new DAOException(); //stub
	
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public void update(News news)throws ServiceException{
		
		try {
			
			throw new DAOException(); //stub
	
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}

}
