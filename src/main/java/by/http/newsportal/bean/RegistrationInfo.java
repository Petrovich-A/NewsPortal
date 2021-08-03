package by.http.newsportal.bean;

import jakarta.servlet.http.HttpServletRequest;

public class RegistrationInfo {
	public char[] logIn;
    public char[] password;
    public String eMail;
    public String country;
    public String[] language;
    public String comment;

	public RegistrationInfo(char[] logIn, char[] password, String eMail, String country, String[] language,
			String comment) {
		super();
		this.logIn = logIn;
		this.password = password;
		this.eMail = eMail;
		this.country = country;
		this.language = language;
		this.comment = comment;
	}

	public char[] getLogIn() {
		return logIn;
	}

	public void setLogIn(char[] logIn) {
		this.logIn = logIn;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String[] getLanguage() {
		return language;
	}

	public void setLanguage(String[] language) {
		this.language = language;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void getRequest(HttpServletRequest request) {
//	logIn = request.getParameter(logIn);
//	password = request.getParameter(password);
	eMail = request.getParameter("eMail");
	country = request.getParameter("country");
		for (String languageStr : language) {
			languageStr = request.getParameter("language");
		}
	comment = request.getParameter("comment");
	}
	
}
