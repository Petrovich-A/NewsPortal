package by.http.newsportal.bean;

import java.util.Arrays;

public class User {
	public String role;
    public char[] logIn;
    public char[] password;
    public String eMail;
    public String country;
    public String[] language;
    public String comment;
	
    public User(String role, char[] logIn, char[] password, String eMail, String country, String[] language,
			String comment) {
		super();
		this.role = role;
		this.logIn = logIn;
		this.password = password;
		this.eMail = eMail;
		this.country = country;
		this.language = language;
		this.comment = comment;
	}

	public User(char[] logIn, char[] password) {
		super();
		this.logIn = logIn;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [role=" + role + ", logIn=" + Arrays.toString(logIn) + ", password=" + Arrays.toString(password)
				+ ", eMail=" + eMail + ", country=" + country + ", language=" + Arrays.toString(language) + ", comment="
				+ comment + "]";
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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
    
}
