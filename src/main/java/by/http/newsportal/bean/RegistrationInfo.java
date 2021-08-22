package by.http.newsportal.bean;

import java.util.Arrays;
import java.util.Objects;

public class RegistrationInfo {
	public String name;
	public String password;
	public String eMail;
	public String gender;
	public String country;
	public String[] language;
	public String hobby;

	public RegistrationInfo(String name, String password, String eMail, String gender, String country,
			String[] language, String hobby) {
		super();
		this.name = name;
		this.password = password;
		this.eMail = eMail;
		this.gender = gender;
		this.country = country;
		this.language = language;
		this.hobby = hobby;
	}

	public RegistrationInfo(String name, String password, String eMail, String gender, String country,
			String[] language) {
		super();
		this.name = name;
		this.password = password;
		this.eMail = eMail;
		this.gender = gender;
		this.country = country;
		this.language = language;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(language);
		result = prime * result + Objects.hash(country, eMail, gender, hobby, name, password);
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
				&& Objects.equals(gender, other.gender) && Objects.equals(hobby, other.hobby)
				&& Arrays.equals(language, other.language) && Objects.equals(name, other.name)
				&& Objects.equals(password, other.password);
	}

	@Override
	public String toString() {
		return "RegistrationInfo [name=" + name + ", password=" + password + ", eMail=" + eMail + ", gender=" + gender
				+ ", country=" + country + ", language=" + Arrays.toString(language) + ", hobby=" + hobby + "]";
	}

}
