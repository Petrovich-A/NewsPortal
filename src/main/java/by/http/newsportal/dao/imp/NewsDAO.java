package by.http.newsportal.dao.imp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import by.http.newsportal.bean.News;
import by.http.newsportal.dao.DAOException;
import by.http.newsportal.dao.INewsDAO;

public class NewsDAO implements INewsDAO {
	private final String SQL = "INSERT INTO news(title, brief, content, author, date) VALUES(?,?,?,?,?)";

	@Override
	public void add(News news) throws DAOException {
		try (newsPortalConnection newsPortalConnection = new newsPortalConnection();
				Connection connection = newsPortalConnection.getNewsConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(SQL);) {
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
	public ArrayList<News> getListNews() throws DAOException {
		String sql = "SELECT * FROM newstable";
		ArrayList<News> newsList = new ArrayList<News>();
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