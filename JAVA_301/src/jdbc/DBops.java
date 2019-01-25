package jdbc;

import java.sql.*;

import com.mysql.jdbc.ResultSet;

public class DBops {
	public static void truncate() throws SQLException{
		java.sql.Connection con=Connection.getConnection();
		PreparedStatement ps=con.prepareStatement("truncate showdetails ");
		ps.executeUpdate();	
		ps.close();
		con.close();
	}
	
	public static void displayByShow(Date date) throws SQLException{
		java.sql.Connection con=Connection.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from showdetails where showtime=?");
		ps.setDate(1, date);
		java.sql.ResultSet rs=ps.executeQuery();
		
		System.out.println(decLine());		
		System.out.println(String.format("| %-25s","Movie")+" "+
				String.format("| %-15s","Language")+" "+
				String.format("| %-10s","Show")+" "+
				"|"
				);
		System.out.println(decLine());
		while(rs.next()){
			System.out.println(String.format("| %-25s",rs.getString(2))+" "+
					String.format("| %-15s",rs.getString(3))+" "+
					String.format("| %-10s",rs.getString(4))+" "+
					"|"
					);
		}
		System.out.println(decLine());
		ps.close();
		rs.close();
		con.close();
		
	}
	
	public static void displayByLanguage(String language) throws SQLException{
		java.sql.Connection con=Connection.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from showdetails where language=?");
		ps.setString(1, language);
		java.sql.ResultSet rs=ps.executeQuery();
		
		System.out.println(decLine());		
		System.out.println(String.format("| %-25s","Movie")+" "+
				String.format("| %-15s","Language")+" "+
				String.format("| %-10s","Show")+" "+
				"|"
				);
		System.out.println(decLine());
		while(rs.next()){
			System.out.println(String.format("| %-25s",rs.getString(2))+" "+
					String.format("| %-15s",rs.getString(3))+" "+
					String.format("| %-10s",rs.getString(4))+" "+
					"|"
					);
		}
		System.out.println(decLine());
		ps.close();
		rs.close();
		con.close();
		
	}
	static String decLine(){
		String s="";
		s+='+';
		for(int i=0;i<27;i++)s+='-';
		s+='+';
		for(int i=0;i<17;i++)s+='-';
		s+='+';
		for(int i=0;i<12;i++)s+='-';
		s+='+';
		return s;
	}

}
