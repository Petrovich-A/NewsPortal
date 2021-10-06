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
	private final String SQL_REGISTRATION = "INSERT INTO user(role, name, password, eMail, gender, country, language, hobby, date) VALUES(?,?,?,?,?,?,?,?,?)";
	private final String SQL_AUTHORIZATION = "SELECT * FROM user WHERE login= ? AND password = ?";

	@Override
	public void registration(RegistrationInfo registrationInfo) throws DAOException {
		try (MyConnectionToDB myConnectionToDB = new MyConnectionToDB();
				Connection connection = myConnectionToDB.getNewsConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(SQL_REGISTRATION);) {
			preparedStatement.setString(1, registrationInfo.getRole());
			preparedStatement.setString(2, registrationInfo.getName());
			preparedStatement.setString(3, registrationInfo.getPassword());
			preparedStatement.setString(4, registrationInfo.geteMail());
			preparedStatement.setString(5, registrationInfo.getGender());
			preparedStatement.setString(6, registrationInfo.getCountry());
			preparedStatement.setString(7, String.join(", ", registrationInfo.getLanguage()));
			preparedStatement.setString(8, registrationInfo.getHobby());
			preparedStatement.setDate(9, Date.valueOf(LocalDate.now()));
			preparedStatement.executeUpdate();
			System.out.println("user is added to DB");

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
	public User authorization(User userFromDB) throws DAOException {
//		User userFromDB = new User();
		try (MyConnectionToDB myConnectionToDB = new MyConnectionToDB();
				Connection connection = myConnectionToDB.getNewsConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(SQL_AUTHORIZATION);) {
			preparedStatement.setString(1, userFromDB.getRole());
			preparedStatement.setString(2, userFromDB.getLogin());
			preparedStatement.setString(3, userFromDB.getPassword());
			preparedStatement.executeUpdate();
			System.out.println("user is added to DB");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return userFromDB;
	}

	@Override
	public void delete(RegistrationInfo registrationInfo) throws DAOException {
		// TODO Auto-generated method stub

	}

}
