package com.persistent.app;

import java.util.Random;

public class Advisor {
	private String[] message;
	
	public Advisor(){
		message=new String[]{"Be Healty !!","Please Help Others","Save Trees","Try to do it","Respect Others"};
	}
	
	public String getAdvice(){
		return message[new Random().nextInt(message.length)];
	}

}
