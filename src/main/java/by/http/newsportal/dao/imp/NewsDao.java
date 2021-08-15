package by.http.newsportal.dao.imp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import by.http.newsportal.bean.News;
import by.http.newsportal.dao.INewsDAO;
import by.http.newsportal.service.ServiceException;

public class NewsDAO implements INewsDAO {

	@Override
	public void add(News news) throws ServiceException {
		try {
			Class.forName("org.gjt.mm.mysql.Driver"); // д.б. один раз
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1/newsPortalDB?allowPublicKeyRetrieval=true&useSSL=false", "root",
					"sW!gv&H.6M^u");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql = "INSERT INTO newstable(title, brief, content, date) VALUES(?,?,?,?)";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, "!!!Падеж свиней на птицефабрике");
			preparedStatement.setString(1, "!!!Падеж свиней на птицефабрике");
			preparedStatement.setString(2, "!!!кто бы мог подумать");
			preparedStatement.setString(3, "бла бла");
			preparedStatement.setDate(4, Date.valueOf(LocalDate.now()));
			preparedStatement.executeUpdate();
			preparedStatement.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<News> read() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

}
