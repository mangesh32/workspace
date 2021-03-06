package com.psl.main;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Client {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {


		BankAccount account=new BankAccount("Warren Buffet","34235",2356.53);
		Class<?> cls = account.getClass();
		for(Field f : cls.getDeclaredFields()){
			System.out.println("Field : "+f.getName()+" Type : "+f.getType());
		}
		
		System.out.println("===========================================");
		
		for(Method m : cls.getDeclaredMethods()){
			
		
			System.out.println("------------------------------------------------");
			System.out.println("Name: "+m.getName()+"\nReturnType: "+m.getReturnType());
			
			for(Parameter p:m.getParameters())
				System.out.println("Parameters: "+p);
			
			if(m.getName().contains("get")){
				
				System.out.println(m.invoke(account));
				
			}
			
		}
		
		

	}

}
