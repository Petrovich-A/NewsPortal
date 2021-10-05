package by.http.newsportal.bean;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String role;
	public String login;

	public User() {
		super();
	}

	public User(String role, String login) {
		super();
		this.role = role;
		this.login = login;
	}

	@Override
	public int hashCode() {
		return Objects.hash(login, role);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(login, other.login) && role == other.role;
	}

	@Override
	public String toString() {
		return "User [role=" + role + ", login=" + login + "]";
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

}
