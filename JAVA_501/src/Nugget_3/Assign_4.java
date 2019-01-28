package Nugget_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Assign_4 {

	public static void main(String[] args) {

		
		Assign_4 obj=new Assign_4();
		System.out.println(obj.countWords("emp.txt"));

	}

	public int countWords(String filePath) {
		File f=new File(filePath);
		int count=0;
		try(BufferedReader br=new BufferedReader(new FileReader(f))){
			String line;
			while((line=br.readLine())!=null)
				count+=line.split(" ").length;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return count;
	}




}
