package by.http.newsportal.bean;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class RegistrationInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String role;
	public String name;
	public String password;
	public String eMail;
	public String gender;
	public String country;
	public String language;
	public String hobby;
	public Date date;

	public RegistrationInfo(String role, String name, String password, String eMail, String gender, String country,
			String language, String hobby, Date date) {
		super();
		this.role = role;
		this.name = name;
		this.password = password;
		this.eMail = eMail;
		this.gender = gender;
		this.country = country;
		this.language = language;
		this.hobby = hobby;
		this.date = date;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		return Objects.hash(country, date, eMail, gender, hobby, language, name, password, role);
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
		return Objects.equals(country, other.country) && Objects.equals(date, other.date)
				&& Objects.equals(eMail, other.eMail) && Objects.equals(gender, other.gender)
				&& Objects.equals(hobby, other.hobby) && Objects.equals(language, other.language)
				&& Objects.equals(name, other.name) && Objects.equals(password, other.password)
				&& Objects.equals(role, other.role);
	}

	@Override
	public String toString() {
		return "RegistrationInfo [role=" + role + ", name=" + name + ", password=" + password + ", eMail=" + eMail
				+ ", gender=" + gender + ", country=" + country + ", language=" + language + ", hobby=" + hobby
				+ ", date=" + date + "]";
	}

}
