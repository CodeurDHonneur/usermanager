package bj.highfive.usermanager.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class UserDAO {
	
//	private String jdbcURL = "jdbc:mysql://locla"

	public UserDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected Connection getConnection() {
		Connection connection = null;
		return connection;
		
		try {
			Class.forName(com.mysql.jdbc.Driver);
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb", "root", "");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
