package com.psl.client;

public interface Driveable {
	
	public static final int variable =100; // by default public,static,final
	
	public default void accelerate()	
	{
		//Default statements only applicable in jre8 using default keyword.
		// A class can ignore the overriding of this default method.
		
	}
	
	
	public void steer();

}
