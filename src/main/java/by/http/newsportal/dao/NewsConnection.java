package by.http.newsportal.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import by.http.newsportal.bean.News;
import by.http.newsportal.service.ServiceException;

public class NewsConnection implements INewsDAO{
	
	private Connection con;
		
	public Connection getCon() {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/mynews?allowPublicKeyRetrieval=true&useSSL=false","root", "sW!gv&H.6M^u");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}

	@Override
	public void add(News news) throws ServiceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<News> read() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
