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
		ps.setString(0, this.name);
		ps.setString(1,this.language);
		ps.setDate(2, date);
		ps.executeUpdate();		
	}

	public void update(Date date) throws SQLException{
		java.sql.Connection con=Connection.getConnection();
		PreparedStatement ps=con.prepareStatement("update showdetails set `show`=? where movie=?");
		ps.setDate(0, date);
		ps.setString(1,this.name);
		ps.executeUpdate();	
		
	}
	public void delete(Date date) throws SQLException{
		java.sql.Connection con=Connection.getConnection();
		PreparedStatement ps=con.prepareStatement("delete from showdetails where movie=? and language=? and `show`=?");
		ps.setString(0, this.name);
		ps.setString(1,this.language);
		ps.setDate(2, date);
		ps.executeUpdate();	
	}

}
