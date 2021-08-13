package by.http.newsportal.bean;

import java.util.Arrays;
import java.util.Objects;

import jakarta.servlet.http.HttpServletRequest;

public class RegistrationInfo {
	public String name;
	public String password;
	public String eMail;
	public String country;
	public String[] language;
	public String hobby;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
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

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public RegistrationInfo(String name, String password, String eMail, String country, String[] language,
			String hobby) {
		super();
		this.name = name;
		this.password = password;
		this.eMail = eMail;
		this.country = country;
		this.language = language;
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "RegistrationInfo [name=" + name + ", password=" + password + ", eMail=" + eMail + ", country=" + country
				+ ", language=" + Arrays.toString(language) + ", hobby=" + hobby + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(language);
		result = prime * result + Objects.hash(country, eMail, hobby, name, password);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegistrationInfo other = (RegistrationInfo) obj;
		return Objects.equals(country, other.country) && Objects.equals(eMail, other.eMail)
				&& Objects.equals(hobby, other.hobby) && Arrays.equals(language, other.language)
				&& Objects.equals(name, other.name) && Objects.equals(password, other.password);
	}

	public void getRequest(HttpServletRequest request) {
		this.name = request.getParameter("name");
		this.password = request.getParameter("password");
		this.eMail = request.getParameter("eMail");
		this.country = request.getParameter("country");
		for (String languageStr : this.language) {
			languageStr = request.getParameter("language");
		}
		this.hobby = request.getParameter("hobby");
	}

}
