package com.psl.util;

public class SharedResource {
	private long cycle;
	public SharedResource(long cycle){
		this.cycle=cycle;
	}
	
	
//	public synchronized void startCycle(){
//		while(--cycle>0);
//	}
//	
//	public synchronized long readCurrentValue(){
//		return cycle;
//	}
//	.......................OR.......................
	
	public void startCycle(){
		while(--cycle>0);
	}
	
	public long readCurrentValue(){
		return cycle;
	}
	
	
	
	
}
