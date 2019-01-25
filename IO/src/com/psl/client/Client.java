package com.psl.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Client {

	public static void main(String[] args) throws IOException {
		File inputFile=new File("C:/Users/Public/Pictures/Sample Pictures/Koala.jpg");
		File outputFile=new File("New-Koala.jpg");
		
	
		try(FileInputStream fi=new FileInputStream(inputFile);
			FileOutputStream fo=new FileOutputStream(outputFile)){
				
			int bytesRead;
			byte[] data=new byte[1024];
			while((bytesRead= fi.read(data))!=-1){
				fo.write(data,0,bytesRead);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		

		Runtime.getRuntime().exec("cmd /c "+outputFile.getAbsolutePath());
	}

}
