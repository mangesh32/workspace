
package com.learn2drive.client;

import com.learn2drive.model.Car;
import com.learn2drive.model.SUV;
import com.learn2drive.model.Sedan;
import com.learn2drive.util.FuelType;

import static java.lang.Math.sqrt;

public class Client {
	public void m(){
		// No access to default members of parent class 'car' because it does not belong to the same package.
	}

	public static void main(String[] args) {
		Car xuv,baleno;
		
		sqrt(23); // No need to specify class name because of 'static import of sqrt method'.
		
		
		xuv=new Car();
		xuv.setMake("Mahindra");
		xuv.setModel("XUV 700");
		xuv.setColor("Dark Brown");
		
		System.out.println(xuv.toString());
		
		System.out.println(xuv.getMake());
		System.out.println(xuv.getModel());
		System.out.println(xuv.getColor());
		
		baleno=new Car("Maruti","Baleno RS","Blue");
		
		SUV rexton=new SUV("ABC","Rexton","black",true);
	
		
		Sedan ciaz=new Sedan();
		ciaz.setColor("Red");
		ciaz.setMake("Maruti");
		ciaz.setModel("ciaz zxi");
		ciaz.setCovertible(false);
		
		carManager(xuv); 	//car
		carManager(baleno); //car
		carManager(rexton); //SUV
		carManager(ciaz);	//Sedan :super class reference to sub-class object.
		
		
		FuelType f=FuelType.NATURAL_GAS;
		
		switch(f){
		case DIESEL:
			break;
		case NATURAL_GAS:
			break;
		case PETROL:
			break;
		default:
			break;
		
		}
		
		/*
		 * String to Enum using valueOf function.
		 * Enum values must be of block letter.
		 * 
		 * */
		
		for(FuelType ft: FuelType.values()){
			System.out.println(ft);
			System.out.println(ft.getCombustionTemprature());
		}
		

	}
	public static void carManager(Car car){
		System.out.println(car.toString());
	}
	
}
