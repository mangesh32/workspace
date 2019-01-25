package Nugget_3;

import java.io.File;
import java.io.IOException;

public class Assign_3 {

	public static void main(String[] args) throws IOException {
		System.out.println(searchFile("src", "Assign_3.java"));

	}

	static public boolean searchFile(String path,String filename) throws IOException{
		
		File f=new File(path);		
		if(f.isDirectory())
			for(File fi:f.listFiles())
				return searchFile(fi.toString(), filename);
		else if(f.getName().equals(filename))
			return true;
		return false;
	}
	
}
