package by.http.newsportal.dao.imp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Statement;

import by.http.newsportal.bean.News;
import by.http.newsportal.dao.DAOException;
import by.http.newsportal.dao.INewsDAO;

public class NewsDAOImp implements INewsDAO {
	private final String SQL_ADD_NEWS = "INSERT INTO news(title, brief, content, author, date) VALUES(?,?,?,?,?)";
	private final String SQL_GET_LIST = "SELECT * FROM news";

	@Override
	public void add(News news) throws DAOException {
		try (MyConnectionToDB newsPortalConnection = new MyConnectionToDB();
				Connection connection = newsPortalConnection.getNewsConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(SQL_ADD_NEWS);) {
			preparedStatement.setString(1, news.getTitle());
			preparedStatement.setString(2, news.getBrief());
			preparedStatement.setString(3, news.getContent());
			preparedStatement.setString(4, news.getAuthor());
			preparedStatement.setDate(5, news.getDate());
			preparedStatement.executeUpdate();
			System.out.println("news is added");
		} catch (ClassNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public List<News> getListNews() throws DAOException {
		List<News> newsList = new ArrayList<News>();
		try (MyConnectionToDB myConnectionToDB = new MyConnectionToDB();
				Connection connection = myConnectionToDB.getNewsConnection();
//				Statement statement = connection.createStatement());
				)

		{
//			String title = preparedStatement.getTitle(title));
//			preparedStatement.executeUpdate();
//			newsList.add(new News(title, brief, content, author, date));
			System.out.println("get list of news");
		} catch (ClassNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return newsList;

	}

	@Override
	public void update(News news) throws DAOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(News news) throws DAOException {
		// TODO Auto-generated method stub

	}
}