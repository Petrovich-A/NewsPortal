package by.http.newsportal.service.impl;

import by.http.newsportal.bean.News;
import by.http.newsportal.dao.DAOException;
import by.http.newsportal.dao.DAOProvider;
import by.http.newsportal.dao.INewsDAO;
import by.http.newsportal.service.INewsService;
import by.http.newsportal.service.ServiceException;

public class NewsServiceImpl implements INewsService {
	private static final DAOProvider PROVIDER = DAOProvider.getInstance();
	private static final INewsDAO NEWS_DAO = PROVIDER.getNewsDAO();

	@Override
	public void add(News news) throws ServiceException {
		try {
			NEWS_DAO.add(news);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}

}
