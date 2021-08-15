package by.http.newsportal.dao.imp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import by.http.newsportal.bean.RegistrationInfo;
import by.http.newsportal.dao.IUserDAO;
import by.http.newsportal.service.ServiceException;

public class UserDAO implements IUserDAO {
	
	@Override
	public void add(RegistrationInfo registrationInfo) throws ServiceException {
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

		String sql = "INSERT INTO userstable(role, logIn, password, eMail, country, language, hobby) VALUES(?,?,?,?,?,?,?)";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setDate(0, null);
			preparedStatement.setString(1, registrationInfo.getName());
			preparedStatement.setString(1, registrationInfo.getPassword());
			preparedStatement.setDate(4, Date.valueOf(LocalDate.now()));
			preparedStatement.executeUpdate();
			preparedStatement.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
