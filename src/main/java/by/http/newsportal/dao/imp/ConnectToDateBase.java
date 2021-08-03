package by.http.newsportal.dao.imp;

import java.sql.*;
import java.time.LocalDate;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

public class ConnectToDateBase {
	public static void main(String[] args) throws Exception{
		  Class.forName("org.gjt.mm.mysql.Driver");
		  
		  Connection connection = null;
		  connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/mynews?allowPublicKeyRetrieval=true&useSSL=false","root", "sW!gv&H.6M^u");
	      String sql = "INSERT INTO table1(title, brief, content, date) VALUES(?,?,?,?)";
	      PreparedStatement preparedStatement = connection.prepareStatement(sql);

	      preparedStatement.setString(1, "Падеж свиней на птицефабрике");
	      preparedStatement.setString(2, "кто бы мог подумать");
	      preparedStatement.setString(3, "бла бла");
	      preparedStatement.setDate(4, Date.valueOf(LocalDate.now()));

	      preparedStatement.executeUpdate();
	      System.out.println("!!!");
	      List<Object> list3 = new ArrayList<Object>();
	}
	
}
