package jdbc;

import java.sql.*;

public class Connection {
	private static  String url="jdbc:mysql://localhost:3306/bookshow";
	private static String user="root";
	private static String password="";
	private static java.sql.Connection con;
	
	public static java.sql.Connection getConnection(){
		try {
			if(con==null)
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
