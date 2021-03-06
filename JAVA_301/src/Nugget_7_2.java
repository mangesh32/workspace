

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Nugget_7_2 {

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String input=in.next();
		File file=new File("io.txt");
		
		try(FileWriter fw=new FileWriter(file)){
			fw.write(input);
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		
		try(FileReader fr=new FileReader(file)){
			System.out.println("Size: "+file.length()+" Bytes\n");
			System.out.println("FileContent:");
			while(fr.ready()){
				System.out.print((char) fr.read());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally{
			file.delete();
			System.out.println("\nFile Deleted !");
			in.close();
		}
		
		

	}

}
