package by.http.newsportal.dao.imp;

public class DAOProvider {
	private NewsDaoImp newsDaoImp = new NewsDaoImp();

	public NewsDaoImp getNewsDaoImp() {
		return newsDaoImp;
	}
	
}
