package by.http.newsportal.bean;

public class News {
	private String title;
	private String brief;
	
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
	

}
