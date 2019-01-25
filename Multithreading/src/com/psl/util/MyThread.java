package com.psl.util;

public class MyThread extends Thread {
	
	
	public MyThread(String name) {
		super(name);
	}
	
	
	@Override
	public void run() {
		for(int i=0;i<5;i++){

			System.out.println(String.format("%d %s",i,getName()));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
