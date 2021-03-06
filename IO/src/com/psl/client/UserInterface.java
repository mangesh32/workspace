package com.psl.client;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;

public class UserInterface {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Car car=new Car();
		car.setMake("Audi");
		car.setModel("R8 Spyder");
		car.setColor("Black");
		car.setEngine(new Engine(125,1000,FuelType.DIESEL));
		
		Car car1=new Car();
		car1.setMake("BMW");
		car1.setModel("i8");
		car1.setColor("Blue");
		car1.setEngine(new Engine(125,1000,FuelType.PETROL));
		
		Car car2=new Car();
		car2.setMake("Mclaren");
		car2.setModel("P1");
		car2.setColor("matt black");
		car2.setEngine(new Engine(125,1000,FuelType.PETROL));
	
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("car.ser"))){
			
			oos.writeObject(car); // write state of the object to car.ser
			oos.writeObject(car1);
			oos.writeObject(car2);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		
		
		
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("car.ser"))){
			
			Car obj;
			while((obj=(Car) ois.readObject())!=null){
				System.out.println(obj.toString());
			}
			
		}catch(EOFException e){
			
			
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}
