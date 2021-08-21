package by.http.newsportal.dao.imp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class newsPortalConnection implements AutoCloseable {
	private static final String BD_URL_NEWS = "jdbc:mysql://127.0.0.1/newsPortal?allowPublicKeyRetrieval=true&useSSL=false";
	private static final String BD_USER_NAME = "root";
	private static final String BD_PASSWORD = "sW!gv&H.6M^u";
	private Connection newsPortalConnection;

	public Connection getNewsConnection() throws SQLException, ClassNotFoundException {
		Class.forName("org.gjt.mm.mysql.Driver");
		newsPortalConnection = DriverManager.getConnection(BD_URL_NEWS, BD_USER_NAME, BD_PASSWORD);
		System.out.println("Connection OK");
		return newsPortalConnection;
	}

	@Override
	public void close() throws Exception {
		newsPortalConnection.close();
	}
}