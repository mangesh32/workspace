import java.io.File;
import java.io.FileReader;
import java.util.Scanner;


public class Nugget_7_3 {

	public static void main(String[] args) {
		String line="";
		String keyword;
		try(FileReader fr=new FileReader("src/test.txt")) {			
			while(fr.ready()){
				line+=(char)fr.read();				
			}			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		System.out.print("keyword : ");
		Scanner in=new Scanner(System.in);
		keyword=in.next();
		System.out.println("\nOccurance : "+check(line.trim(),keyword.trim()));
		
	
	}
	
	static int check(String sentence,String word){
		int count=0;
		for(String s:sentence.split(" ")){
			if(s.equals(word))
				count++;
		}
		return count;
		
	}
}
