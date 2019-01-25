package com.psl.client;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Properties p=new Properties();
		try {
			p.load(new FileReader(new File("configurations.properties")));
			for(Object i:p.keySet()){
				System.out.println(i+" : "+p.get(i));
			}
			
			Scanner scanFile=new Scanner(new File("abc.csv"));
			while(scanFile.hasNext()){
				String line=scanFile.next();
				Scanner token=new Scanner(line);
				token.useDelimiter(",");
				while(token.hasNext()){
					String value=token.next();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
