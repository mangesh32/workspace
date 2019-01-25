package com.persistent.app;

public class Greeter {
	private String name;

	public Greeter(String name) {
		super();
		this.name = name;
	}
	
	public String sayHello(){
		return "Hello, "+this.name+"!";
	}
	
	public String sayGoodBye(){
		return "Good Bye, "+this.name+"!";
	}
	

}
