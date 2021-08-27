package by.http.newsportal.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnectionToDB implements AutoCloseable {
	private static final String BD_URL_NEWS = "jdbc:mysql://127.0.0.1/newsPortal?allowPublicKeyRetrieval=true&useSSL=false";
	private static final String BD_URL_USERS = "jdbc:mysql://127.0.0.1/usersPortal?allowPublicKeyRetrieval=true&useSSL=false";
	private static final String BD_USER_NAME = "root";
	private static final String BD_PASSWORD = "sW!gv&H.6M^u";
	private Connection newsConnection;
	private Connection usersConnection;

	public Connection getNewsConnection() {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			newsConnection = DriverManager.getConnection(BD_URL_NEWS, BD_USER_NAME, BD_PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connection OK");
		return newsConnection;
	}

	public Connection getUsersConnection() {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			usersConnection = DriverManager.getConnection(BD_URL_USERS, BD_USER_NAME, BD_PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connection OK");
		return newsConnection;
	}

	@Override
	public void close() throws Exception {
		newsConnection.close();
		usersConnection.close();
	}

}