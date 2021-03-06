package com.psl.util;

import java.util.Random;

public class CommonResource {
	private int[] numbers;
	private boolean available;
	private Random random;
	
	public CommonResource() {
		super();
		numbers=new int[50];
		available=true;
		random=new Random();
	}
	
	public synchronized void getLock() throws InterruptedException {//wait can be only called from sync method or sync block.
		if(available==false)
			wait(); // the thread which called this method will be blocked.
			/*
			 *  The thread releases ownership of this monitor
			 *  and waits until another thread notifies threads waiting on this object's monitor
			 *  to wake up either through a call to the notify method or the notifyAll method.
			 */
		available=false;
	}
	
	public synchronized void releaseLock(){//This should also be synchronized because it contains notifyAll method. 
		available=true;
		notifyAll(); // used to notify all thread that the resource is now available.
		
	}
	
	public int getSize(){
		return numbers.length;
		
	}
	
	public int generateNumber(){
		int num;
		do{
			num=random.nextInt();
		}while(num<0 || num>0x3e8);
		return num;
	}
	
	public int getNumber(int index){
		return numbers[index];
	}
	
	public void setNumber(int index,int value){
		numbers[index]=value;
	}
	
	
}
