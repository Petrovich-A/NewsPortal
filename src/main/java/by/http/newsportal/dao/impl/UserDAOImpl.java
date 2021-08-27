package by.http.newsportal.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import by.http.newsportal.bean.RegistrationInfo;
import by.http.newsportal.bean.User;
import by.http.newsportal.dao.DAOException;
import by.http.newsportal.dao.IUserDAO;

public class UserDAOImpl implements IUserDAO {
	private final String SQL = "INSERT INTO user(name, password, eMail, country, language, hobby) VALUES(?,?,?,?,?,?)";

	@Override
	public void registration(RegistrationInfo registrationInfo) throws DAOException {
		try (MyConnectionToDB myConnectionToDB = new MyConnectionToDB();
				Connection connection = myConnectionToDB.getUsersConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(SQL);) {

			preparedStatement.setDate(0, null);
			preparedStatement.setString(1, registrationInfo.getName());
			preparedStatement.setString(2, registrationInfo.getPassword());
			preparedStatement.setString(3, registrationInfo.geteMail());
			preparedStatement.setString(4, String.join(",", registrationInfo.getCountry()));
			preparedStatement.setString(5, String.join(",", registrationInfo.getLanguage()));
			preparedStatement.setString(6, registrationInfo.getHobby());
			preparedStatement.setDate(7, Date.valueOf(LocalDate.now()));
			preparedStatement.executeUpdate();

			System.out.println("user is added");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	@Override
	public void update(RegistrationInfo registrationInfo) throws DAOException {
		// TODO Auto-generated method stub

	}

	@Override
	public User authorization(RegistrationInfo registrationInfo) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(RegistrationInfo registrationInfo) throws DAOException {
		// TODO Auto-generated method stub

	}

}
