package by.http.newsportal.dao.imp;

import java.time.LocalDate;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class NewsRepos {
	
	public void addNews() throws Exception{
		  Class.forName("org.gjt.mm.mysql.Driver");
		  
		  Connection connection = null;
		  connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/newsPortalDB?allowPublicKeyRetrieval=true&useSSL=false",
				  "root", "sW!gv&H.6M^u");
		  
	      String sql = "INSERT INTO newstable(title, brief, content, date) VALUES(?,?,?,?)";
	      PreparedStatement preparedStatement = connection.prepareStatement(sql);

	      preparedStatement.setString(1, "!!!����� ������ �� ������������");
	      preparedStatement.setString(2, "!!!��� �� ��� ��������");
	      preparedStatement.setString(3, "��� ���");
	      preparedStatement.setDate(4, Date.valueOf(LocalDate.now()));

	      preparedStatement.executeUpdate();
	   	      
	}
	
}
