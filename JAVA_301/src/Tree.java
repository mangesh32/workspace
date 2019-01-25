import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tree {

	public static void main(String[] args) throws IOException {
		File folder=new File("src");
		printContent(folder, 2);
	}

	public static void printContent(File folder,int level){
		System.out.println(String.format("%"+level+"s","->")+folder.getName());
		if(folder.isDirectory())
			for(File file:folder.listFiles())
				printContent(file,level+4);
		
	}
	
}
