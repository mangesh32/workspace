package jdbc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Executable;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) throws IOException, SQLException, ParseException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("src/movies.txt"));
		String line;
		Scanner in=new Scanner(System.in);
		DBops.truncate();
		while((line=br.readLine())!=null){
			String[] detail=line.split(",");
			Movie m=new Movie(detail[1], detail[2]);
			m.newShow(sqlDate((detail[3])));			
		}
		

		loop:while(true){
			showUI();
			switch(in.next()){
			case "1":{
				System.out.println("Enter Movie Name:");
				String name=in.nextLine();
				name=in.nextLine();
				System.out.println("Enter Language:");
				String lang=in.next();
				System.out.println("Enter Show(d/m/yy):");
				Date d=sqlDate(in.next());
				Movie n=new Movie(name, lang);
				n.newShow(d);
				break;				
			}
			case "2":{
				System.out.println("Enter Movie Name:");
				String name=in.nextLine();
				name=in.nextLine();
				System.out.println("Enter Language:");
				String lang=in.next();
				System.out.println("Enter Show(d/m/yy):");
				Date d=sqlDate(in.next());
				System.out.println("Enter New Show(d/m/yy):");
				Date dn=sqlDate(in.next());
				Movie n=new Movie(name, lang);
				n.update(d,dn);
				break;	
			}
			case "3":{
				System.out.println("Enter Movie Name:");
				String name=in.nextLine();
				name=in.nextLine();
				System.out.println("Enter Language:");
				String lang=in.nextLine();
				System.out.println("Enter Show(d/m/yy):");
				Date d=sqlDate(in.next());
				Movie n=new Movie(name, lang);
				n.delete(d);
				break;	
			}
			case "4":{
				System.out.println("Enter Language");
				DBops.displayByLanguage(in.next());
				break;
			}
			case "5":{
				System.out.println("Enter ShowDate(d/m/yy)");
				DBops.displayByShow(sqlDate(in.next()));
				break;
			}
			case "6":{
				System.out.println("BYE BYE");
				Runtime r=Runtime.getRuntime();
				r.exec("cmd /c D:/nagar_palika.mp3");
				break loop;
			}
			default:{
				System.out.println("\n Wrong Choice.");
				break;
			}
			
			}
		}
		
		
		
	}
	public static Date sqlDate(String d) throws ParseException{
		SimpleDateFormat old=new SimpleDateFormat("D/M/y");			
		SimpleDateFormat newformat=new SimpleDateFormat("yyyy-M-D");
		return Date.valueOf(newformat.format(old.parse(d)));
		
	}
	public static void showUI(){
		System.out.println("--------------JDBC OPERATIONS------------");
		System.out.println(String.format("%10s"," ")+"1.Add Movie");
		System.out.println(String.format("%10s"," ")+"2.Update Show");
		System.out.println(String.format("%10s"," ")+"3.Delete Show");
		System.out.println(String.format("%10s"," ")+"4.Display by language");
		System.out.println(String.format("%10s"," ")+"5.Display by show");
		System.out.println(String.format("%10s"," ")+"6.Exit");
		System.out.println("------------------------------------------");
		System.out.println("Your Choice:");
	}

}
