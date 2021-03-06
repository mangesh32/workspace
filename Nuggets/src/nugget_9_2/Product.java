package nugget_9_2;

import java.util.HashMap;
import java.util.Scanner;

public class Product {
	private  static HashMap<String,String> map=new HashMap<String , String>(10);
	
	public static void main(String[] args) {
		
		map.put("P001","Maruti800");
		map.put("P002","MarutiZen");
		map.put("P003","MarutiEsteem");
		
		showMap();
		
		Scanner in=new Scanner(System.in);
		System.out.println("Id to find: ");
		System.out.println(find(in.next())?"Found!!":"Not-Found!!");
		
		System.out.println("Id to delete: ");
		delete(in.next());
		
		showMap();
		
	}
	
	static void showMap(){
		for(String k : map.keySet()){
			System.out.println(k+" "+map.get(k));
		}
	}
	
	static void delete (String id){
		map.remove(id);
	}
	
	static boolean find(String id){
		if(map.keySet().contains(id))
			return true;
		return false;
	}
	
	
	
}
