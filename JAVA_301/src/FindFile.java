import java.io.File;
import java.util.Scanner;

public class FindFile {
	static boolean flag=false;
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter path:");
		String path=in.next();
		System.out.println("Enter file to be searhed:");
		String file=in.next();
		
		findFile(new File(path), file);
		System.out.println(flag?"Found":"Not-Found");
		
		
	}

	public static void findFile(File folder,String filename){
		if(folder.isDirectory()){
			for(File file:folder.listFiles()){
				findFile(file,filename);
			}
		}
		else
			if(folder.getName().toLowerCase().equals(filename.toLowerCase()))
				flag=true;
	}
}
