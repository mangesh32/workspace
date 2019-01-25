package com.learn2drive.model;

import com.learn2drive.util.FuelType;

public class Main {

	public static Vehicle[] readCSV(String[] data){
		Vehicle[] answer=new Vehicle[data.length];
		int i=0;
		for(String s:data){
			String[] arr=s.split(",");
			Vehicle v= new Vehicle(arr[0],Double.parseDouble(arr[1]),arr[2],FuelType.valueOf(arr[3].toUpperCase()));
			answer[i++]=v;
		}
		return answer;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str={"MH-31-3656,124578.00,Dominar,Natural_gas",
				"MH-49-6768,36568.00,Activa,Petrol",
				"MH-20-5676,376895,BMW-GS,Diesel"};
		
		for(Vehicle i:readCSV(str)){
			System.out.println("RegNo : "+i.getRegistrationNumber());
			System.out.println("Price : "+i.getPrice());
			System.out.println("Name : "+i.getName());
			System.out.println("Fuel : "+i.getFuelType());
			System.out.println();
		}
		
		
		
				
		
	}

}
