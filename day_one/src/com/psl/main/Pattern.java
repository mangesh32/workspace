package com.psl.main;
import java.io.IOException;

public class Pattern {

	public static void main(String[] args) throws IOException {
		
		int r=(System.in.read()-48)/2+1;
		for(int i=1;i<=r;i++){
			String fill="";
			for(int j=1;j<=2*i-1;j++)fill+=(2*i-1);			
			System.out.println(String.format("%"+(r+i-1)+"s",fill));
		}
	
	}

}
