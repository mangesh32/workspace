package Nugget_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Assign_4 {
	static Map<String,Integer> map=new HashMap<String,Integer>();

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String string;
		while((string=in.next())!="exit")
			System.out.println(process(string));
		
	}

	private static Integer process(String string) {
		Integer count;
		if((count=map.get(string))!=null)
			return count;
		else{
			Set<Character> temp=new HashSet<Character>();
			for(char c:string.toCharArray())temp.add(c);
			Integer size=temp.size();
			map.put(string, size);
			return size;			
		}
		
	}
}
