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
	private final String SQL_GET_LIST = "SELECT * FROM news";
	private final String SQL_CREATE = "INSERT INTO news(title, brief, content, author, date) VALUES(?,?,?,?,?)";
	private final String SQL_DELETE = "DELETE FROM news WHERE idnews = ?";
	private final String SQL_UPDATE = "UPDATE news SET title = ?, brief = ?, content = ?, author = ?, date = ? WHERE idnews = ?";
	private final String SQL_READ = "SELECT * FROM news WHERE idnews = ?";

	@Override
	public void create(News news) throws DAOException {
		try (MyConnectionToDB myConnectionToDB = new MyConnectionToDB();
				Connection connection = myConnectionToDB.getNewsConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(SQL_CREATE);) {
			preparedStatement.setString(1, news.getTitle());
			preparedStatement.setString(2, news.getBrief());
			preparedStatement.setString(3, news.getContent());
			preparedStatement.setString(4, news.getAuthor());
			preparedStatement.setTimestamp(5, news.getDate());
			System.out.println("NewsDAOImpl news is created \n");
			preparedStatement.executeUpdate();

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
				listNews.add(new News(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
						resultSet.getString(4), resultSet.getString(5), resultSet.getString(6))); // context (4 row)
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} catch (Exception e2) {
			e2.printStackTrace();
		}

		if (listNews.size() == 0 | listNews == null) {
			System.out.println("NewsDAOImpl listNews is null \n");
			return null;
		} else {
			System.out.println("NewsDAOImpl listNews is avaliable \n");
			return listNews;
		}
	}

	@Override
	public void delete(int id) throws DAOException {
		try (MyConnectionToDB myConnectionToDB = new MyConnectionToDB();
				Connection connection = myConnectionToDB.getNewsConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(SQL_DELETE);) {
			preparedStatement.setInt(1, id);
			System.out.println("NewsDAOImpl Id is avaliable \n id: " + id);
			preparedStatement.executeUpdate();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	@Override
	public void update(News news, int id) throws DAOException {
		try (MyConnectionToDB myConnectionToDB = new MyConnectionToDB();
				Connection connection = myConnectionToDB.getNewsConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(SQL_UPDATE);) {
			preparedStatement.setString(1, news.getTitle());
			preparedStatement.setString(2, news.getBrief());
			preparedStatement.setString(3, news.getContent());
			preparedStatement.setString(4, news.getAuthor());
			preparedStatement.setTimestamp(5, news.getDate());
			preparedStatement.setInt(6, news.getId());
			System.out.println("NewsDAOImpl news is updated \n");
			preparedStatement.executeUpdate();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	@Override
	public News read(int id) throws DAOException {
		News news = new News();
		try (MyConnectionToDB myConnectionToDB = new MyConnectionToDB();
				Connection connection = myConnectionToDB.getNewsConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(SQL_READ);) {
			preparedStatement.setInt(1, id);
			System.out.println("NewsDAOImpl, read id: " + id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				news.setId(resultSet.getInt(1));
				news.setTitle(resultSet.getString(2));
				news.setBrief(resultSet.getString(3));
				news.setContent(resultSet.getString(4));
				news.setAuthor(resultSet.getString(5));
				news.setDateDB(resultSet.getString(6));
			}
			System.out.println("NewsDAOImpl News from DB is avaliable \n read method: \n" + news.toString());

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return news;
	}

}
