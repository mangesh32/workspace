package nugget_2;

import java.util.Scanner;

public class EzeeShop {
	
	
	static String[] initProductNames(){
		String[] arr={"DELL INSPIRON","ACER PREDATOR","ASUS ROG","LENOVO IDEAPAD"};
		return (arr);
	}
	static boolean isPresent(String[] productNames, String keyword){
		for(String str:productNames){
			if(str.contains(keyword)){
				return true;
			}
		}
		return false;		
	}

	public static void main(String[] args) {
		
		String[] productNames=initProductNames();
		String keyword;
		
		System.out.print("Keyword: ");
		Scanner in=new Scanner(System.in);
		keyword=in.nextLine();
		
		if(isPresent(productNames, keyword.toUpperCase()))
			System.out.println("Product Found !!");
		else
			System.out.println("Product Not Found !!!");
		
		in.close();

	}

}
