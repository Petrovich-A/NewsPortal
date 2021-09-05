package by.http.newsportal.bean;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class News implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String title;
	private String brief;
	private String content;
	private String author;
	private Date date;
	private String dateDB;

	public News() {
		super();
	}

	public News(Integer id, String title, String brief, String content, String author, Date date) {
		super();
		this.id = id;
		this.title = title;
		this.brief = brief;
		this.content = content;
		this.author = author;
		this.date = date;
	}

	public News(String title, String brief, String content, String author, Date date) {
		super();
		this.title = title;
		this.brief = brief;
		this.content = content;
		this.author = author;
		this.date = date;
	}

	public News(String title, String brief, String content, String author, String dateDB) {
		super();
		this.title = title;
		this.brief = brief;
		this.content = content;
		this.author = author;
		this.dateDB = dateDB;
	}

	public News(String title, String brief, String author, String dateDB) {
		super();
		this.title = title;
		this.brief = brief;
		this.author = author;
		this.dateDB = dateDB;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, brief, content, date, title);
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
		return Objects.equals(author, other.author) && Objects.equals(brief, other.brief)
				&& Objects.equals(content, other.content) && Objects.equals(date, other.date)
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "News [title=" + title + ", brief=" + brief + ", content=" + content + ", author=" + author + ", date="
				+ date + "]";
	}

	public Integer getId() {
		return id;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDateDB() {
		return dateDB;
	}

	public void setDateDB(String dateDB) {
		this.dateDB = dateDB;
	}

}
