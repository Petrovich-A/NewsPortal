package by.http.newsportal.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.http.newsportal.bean.News;
import by.http.newsportal.dao.DAOException;
import by.http.newsportal.dao.INewsDAO;

public class NewsDAOImpl implements INewsDAO {
	private final String SQL_ADD = "INSERT INTO news(title, brief, content, author, date) VALUES(?,?,?,?,?)";
	private final String SQL_GET_LIST = "SELECT * FROM news";
	private final String SQL_UPDATE = "UPDATE news SET title = ?, brief = ?, content = ?, author = ?, date = ? WHERE id = ?";
	private final String SQL_DELETE = "DELETE FROM news WHERE idnews = ?";

	@Override
	public void add(News news) throws DAOException {
		try (MyConnectionToDB myConnectionToDB = new MyConnectionToDB();
				Connection connection = myConnectionToDB.getNewsConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(SQL_ADD);) {
			preparedStatement.setString(1, news.getTitle());
			preparedStatement.setString(2, news.getBrief());
			preparedStatement.setString(3, news.getContent());
			preparedStatement.setString(4, news.getAuthor());
			preparedStatement.setDate(5, news.getDate());
			preparedStatement.executeUpdate();
			System.out.println("news is added \n");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	@Override
	public List<News> getListNews() throws DAOException {
		List<News> listNews = new ArrayList<News>();
		try (MyConnectionToDB myConnectionToDB = new MyConnectionToDB();
				Connection connection = myConnectionToDB.getNewsConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(SQL_GET_LIST);) {

			while (resultSet.next()) {
				listNews.add(new News(resultSet.getString(2), resultSet.getString(3), resultSet.getString(5),
						resultSet.getString(6))); // context (4 row)
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
		if (listNews.size() == 0 | listNews == null) {
			System.out.println("listNews is null /n");
			return null;
		} else {
			System.out.println("List of news is avaliable \n");
			return listNews;
		}
	}

	@Override
	public void update(News news) throws DAOException {
		try (MyConnectionToDB myConnectionToDB = new MyConnectionToDB();
				Connection connection = myConnectionToDB.getNewsConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(SQL_UPDATE);) {

			preparedStatement.setString(1, news.getTitle());
			preparedStatement.setString(2, news.getBrief());
			preparedStatement.setString(3, news.getContent());
			preparedStatement.setString(4, news.getAuthor());
			preparedStatement.setDate(5, news.getDate());
			preparedStatement.executeUpdate();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		System.out.println("news is updated \n");

	}

	@Override
	public void delete(News news) throws DAOException {
		try (MyConnectionToDB myConnectionToDB = new MyConnectionToDB();
				Connection connection = myConnectionToDB.getNewsConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(SQL_DELETE);) {
			preparedStatement.setInt(1, news.getId());
			preparedStatement.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		System.out.println("news is deleted \n");
	}
}
