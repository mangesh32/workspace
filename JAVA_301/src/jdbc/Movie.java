package jdbc;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Movie {
	private String name;
	private String language;
	

	public Movie(String name,String language) {
		super();
		this.language=language;
		this.name = name;
	}
	
	public void newShow(Date date) throws SQLException{
		java.sql.Connection con=Connection.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into showdetails values(0,?,?,?)");
		ps.setString(1, this.name);
		ps.setString(2,this.language);
		ps.setDate(3, date);
		System.out.println(ps.executeUpdate()==1?"Added Successfully":"Failed!!");	
		ps.close();
		con.close();
		
	}

	public void update(Date date,Date newdate) throws SQLException{
		java.sql.Connection con=Connection.getConnection();
		PreparedStatement ps=con.prepareStatement("update showdetails set `showtime`=? where movie=? and language=? and `showtime`=?");
		ps.setDate(1, newdate);
		ps.setString(2, this.name);
		ps.setString(3,this.language);
		ps.setDate(4, date);
		System.out.println(ps.executeUpdate()==1?"Updated Successfully":"No record found!");	
		ps.close();
		con.close();
		
	}
	public void delete(Date date) throws SQLException{
		java.sql.Connection con=Connection.getConnection();
		PreparedStatement ps=con.prepareStatement("delete from showdetails where movie=? and language=? and `showtime`=?");
		ps.setString(1, this.name);
		ps.setString(2,this.language);
		ps.setDate(3, date);
		System.out.println(ps.executeUpdate()==1?"Deleted Successfully":"No record found!");
		ps.close();
		con.close();

	}
	

}
