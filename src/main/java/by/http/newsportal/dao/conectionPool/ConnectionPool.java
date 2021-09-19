package by.http.newsportal.dao.conectionPool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class ConnectionPool {
	private static final String BD_URL = "jdbc:mysql://127.0.0.1/newsPortal?allowPublicKeyRetrieval=true&useSSL=false";
	private static final String BD_USER_NAME = "root";
	private static final String BD_PASSWORD = "sW!gv&H.6M^u";

	private ConcurrentLinkedQueue<Connection> freeConnections = new ConcurrentLinkedQueue<>();

	private ConnectionPool() {

	}

	public Connection getConnection() throws ConnectionPoolException {
		Connection connection = null;
		while (connection == null) {
			try {
				connection = freeConnections.poll();
				if (connection != null) {
					if (!connection.isValid(0)) {
						try {
							connection.close();
						} catch (SQLException e) {
						}
						connection = null;
					}
				} else {

				}
			} catch (SQLException e) {
				throw new ConnectionPoolException(e);
			}
		}
		return connection;
	}

	public void freeConnection(Connection connection) {

	}

	private Connection newConnection() throws SQLException {
		return DriverManager.getConnection(BD_URL, BD_USER_NAME, BD_PASSWORD);
	}

	private static ConnectionPool instance = new ConnectionPool();

	public static ConnectionPool getInstance() {
		return instance;
	}

}
