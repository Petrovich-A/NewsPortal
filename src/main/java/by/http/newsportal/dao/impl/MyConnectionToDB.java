package by.http.newsportal.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnectionToDB implements AutoCloseable {
	private static final String BD_URL = "jdbc:mysql://127.0.0.1/newsPortal?allowPublicKeyRetrieval=true&useSSL=false";
	private static final String BD_USER_NAME = "root";
	private static final String BD_PASSWORD = "sW!gv&H.6M^u";
	private Connection newsConnection;

	public Connection getNewsConnection() {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			newsConnection = DriverManager.getConnection(BD_URL, BD_USER_NAME, BD_PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("MyConnectionToDB: \n Connection OK");
		return newsConnection;
	}

	@Override
	public void close() throws Exception {
		newsConnection.close();
	}

}