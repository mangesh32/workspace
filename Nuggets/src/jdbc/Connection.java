package jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
	private static  String url="jdbc:mysql://localhost:3306/bookshow";
	private static String user="root";
	private static String password="root";
	private static java.sql.Connection con;
	
	public static java.sql.Connection getConnection(){
		try {
			if(con==null)
			con=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println(e);
		}
		return con;
	}
}
