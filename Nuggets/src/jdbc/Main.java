package jdbc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) throws IOException, SQLException, ParseException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("src/movies.txt"));
		String line;
		System.out.println(Connection.getConnection());
//		while((line=br.readLine())!=null){
//			String[] detail=line.split(",");
//			Movie m=new Movie(detail[1], detail[2]);
//			SimpleDateFormat old=new SimpleDateFormat("D/M/yyyy");
//			Date d=(Date) old.parse(detail[3]);
//			m.newShow(d);			
//		}
		
		
	}

}
