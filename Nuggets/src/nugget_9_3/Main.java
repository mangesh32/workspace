package nugget_9_3;

import java.util.Scanner;
import java.util.Vector;

public class Main {
	
	static Vector<Name> vector=new Vector<Name>();
	
	public static void main(String[] args) {
		inf : while(true){
			showUI();
			Scanner in=new Scanner(System.in);
			switch(in.next()){
			case "1":{
				System.out.println("\nFirstName : ");
				String fname=in.next();
				System.out.println("\nSurName : ");
				String lname=in.next();
				Name name=new Name(fname,lname);
				vector.add(name);
				break;			
			}
			case "2":{
				System.out.println("");
				displayNames();
				break;
			}
			case "3":{
				break inf;
			}
			default:{
				System.out.println("\nIncorrect Option.");
			}
			
			}
		}
		
		

	}
	
	static void showUI(){
		System.out.println("\n-----------------------------------------------------------");
		System.out.println("OPTIONS :-->");
		System.out.println(String.format("%10s"," ")+"1. accept first name and surname");
		System.out.println(String.format("%10s"," ")+"2. display complete name.");
		System.out.println(String.format("%10s"," ")+"3. exit");
		System.out.println("-----------------------------------------------------------");
		System.out.print("Your Choice: ");
	}

	static void displayNames(){
		for(Name name: vector){
			System.out.println(name.getFirstName()+" "+name.getSurname());
		}
	}
}
