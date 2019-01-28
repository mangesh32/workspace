package Nugget_3;

import java.io.File;
import java.io.IOException;

public class Assign_3 {

	public static void main(String[] args) throws IOException {
	
		
		Assign_3 obj=new Assign_3();
		System.out.println(obj.searchFile("src", "Assign_4.java"));

	}

	public boolean searchFile(String path,String filename) throws IOException{
		boolean ans=false;
		File f=new File(path);
		System.out.println(f.getName());
		if(f.isDirectory())
			for(File fi:f.listFiles())
				ans=ans||searchFile(fi.toString(), filename);
		else if(f.getName().equals(filename))
			return true;
		return ans;
	}
	
}
