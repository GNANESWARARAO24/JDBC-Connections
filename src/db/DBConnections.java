package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnections {
//	private static final String driver = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/eventmanagement";
	private static final String user = "root";
	private static final String password = "tiger";
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	

}
