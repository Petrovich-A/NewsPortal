package by.http.newsportal.dao.imp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;

public class NewsRepos {

	public void addNews() throws Exception {
		Class.forName("org.gjt.mm.mysql.Driver"); // д.б. один раз

		Connection connection = null;
		connection = DriverManager.getConnection(
				"jdbc:mysql://127.0.0.1/newsPortalDB?allowPublicKeyRetrieval=true&useSSL=false", "root",
				"sW!gv&H.6M^u");

		String sql = "INSERT INTO newstable(title, brief, content, date) VALUES(?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		preparedStatement.setString(1, "!!!Падеж свиней на птицефабрике");
		preparedStatement.setString(1, "!!!Падеж свиней на птицефабрике");
		preparedStatement.setString(2, "!!!кто бы мог подумать");
		preparedStatement.setString(3, "бла бла");
		preparedStatement.setDate(4, Date.valueOf(LocalDate.now()));

		preparedStatement.executeUpdate();

		preparedStatement.close();
		connection.close();
	}

	public void read() throws Exception {
		Class.forName("org.gjt.mm.mysql.Driver");

		Connection connection = null;
		connection = DriverManager.getConnection(
				"jdbc:mysql://127.0.0.1/newsPortalDB?allowPublicKeyRetrieval=true&useSSL=false", "root",
				"sW!gv&H.6M^u");

		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1) + " " + 
					resultSet.getString(2) + " " + 
					resultSet.getString(3));
		}

		resultSet.close();
		statement.close();
		connection.close();
	}

}
