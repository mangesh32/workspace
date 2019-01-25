package nugget_2;

import java.util.Scanner;

public class Availability {
	static int findPosition(int num,int[] nos){
		for(int i=0;i<nos.length;i++)
			if(nos[i]==num)
				return i;		
		return -1;
	}

	public static void main(String[] args) {
		int[] nos={1,2,3,4,5,6,7,8,9,10};
		Scanner in=new Scanner(System.in);
		int i;
		if((i=findPosition(in.nextInt(), nos))!= -1)
			System.out.println("Found at index : "+i);
		else
			System.out.println("Not-Found !!");
		in.close();
	}

}
