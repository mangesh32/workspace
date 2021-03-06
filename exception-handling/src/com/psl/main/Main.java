package com.psl.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		// All Exceptions excluding runtimeExceptions comes under #Checked Exception.
		// Other belongs to # Unchecked Exceptions.
		
		
		/* Try With Resources */
		/* arg must implement auto closable interface */
		System.out.println(calculateSpeed(0, 0));
		try(FileReader fr=new FileReader("some_file.txt")){
			
		}catch(IOException ex){
			
		}finally{
			
		}

	}
	public static void searchProduct(String productCode) throws ProductNotFoundException{
		throw new ProductNotFoundException("Not Found");
	}
	
	/**
	 * 
	 * @param distance
	 * @param time
	 * @return distance/time if both > 0 otherwise give assertion error.
	 */
	private static double calculateSpeed(double distance,double time){
		assert distance > 0 : "Distance must be gretaer than zero.";
		assert time > 0 : "Time must be greater than zero.";
		return distance/time;
	}

}
