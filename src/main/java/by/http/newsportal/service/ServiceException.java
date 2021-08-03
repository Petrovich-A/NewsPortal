package by.http.newsportal.service;

public class ServiceException extends Exception{
 
	private static final long serialVersionUID = -418937853542597602L;
	
	public ServiceException() {
		super();
	}
	
	public ServiceException(String message) {
		super(message);
	}
	
	public ServiceException(Exception e) {
		super(e);
	}
	
	public ServiceException(String message, Exception e) {
		super(message, e);
	}
	
}
