package by.http.newsportal.dao.conectionPool;

import java.sql.Connection;
import java.util.concurrent.ConcurrentLinkedQueue;


public class ConectionPool {
	private ConcurrentLinkedQueue<Connection> freeConnections = new ConcurrentLinkedQueue<>(); 
	private ConectionPool () {
		
	}
	
	public Connection getConnection() {
		return null;
	}

}
