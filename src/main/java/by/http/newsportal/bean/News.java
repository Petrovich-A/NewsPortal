package by.http.newsportal.bean;

import java.sql.Date;
import java.util.Objects;

public class News {
	private String title;
	private String brief;
	private String content;
	private Date date;

	public News(String title, String brief) {
		super();
		this.title = title;
		this.brief = brief;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	@Override
	public String toString() {
		return "News [title=" + title + ", brief=" + brief + ", content=" + content + ", date=" + date + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(brief, content, date, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		News other = (News) obj;
		return Objects.equals(brief, other.brief) && Objects.equals(content, other.content)
				&& Objects.equals(date, other.date) && Objects.equals(title, other.title);
	}

}
