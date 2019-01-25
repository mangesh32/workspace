import java.util.ArrayList;
import java.util.Scanner;


public class Nugget_9_1 {
	static ArrayList<String> arr= new ArrayList<String>();

	public static void main(String[] args) {
		
		String[] names={"aman","aman1","aman2","aman3"};
		for(String s:names){
			arr.add(s);
		}
		
		Scanner in = new Scanner(System.in);
		System.out.println("toFind:");
		System.out.println(find(in.next())?"Found!!":"Not-Found!!");
		

	}
	
	static boolean find(String name){
		if(arr.contains(name))
			return true;
		return false;
	}

}
