package nugget_2;
import java.util.ArrayList;
import java.util.HashSet;

public class Combo {
	public static String[] combinations(String input){
		String stemp="";
		ArrayList<String> arr=new ArrayList<String>();
		char[] charArr;
		for(int i=0;i<input.length();i++){
			for(int j=0;j<input.length();j++){
				charArr=input.toCharArray();
				char temp=charArr[i];
				charArr[i]=charArr[j];
				charArr[j]=temp;
				arr.add(new String(charArr));
			}
		}
		for(String s:arr)
			stemp+=s+",";
		
		return stemp.split(",");
	}

	public static void main(String[] args) {
		for(String str:combinations("123"))
			System.out.println(str);

	}

}
