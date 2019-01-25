package com.psl.client;

import java.io.Serializable;

/* entity / model / java bean */
public class Car implements Serializable{
	/**
	 * serialVersionUID is the only static member that is written on output stream.
	 */
	private static final long serialVersionUID = -7744370374829722638L;

	/*
	 * data-member
	 * attributes
	 * properties
	 * instance-variables
	 */
	String make,model,color;
	
	/* Containership :-
	 * 				--> Composition
	 * 				--> Aggregation
	 */
	private transient Engine engine; //composition
	
	/*NoArg Constructor,No parameter constructor*/
	public Car(){
		this("","","");	
		
	}
	public Car(String make,String model,String color){
		this.make=make;
		this.model=model;
		this.color=color;
	}
	
	/*
	 * member methods
	 * instance methods
	 * getter methods: accessors
	 * setter methods: mutators
	 */
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	@Override //annotation
	public String toString() {
		return "This is "+this.make+" "+this.model+" "+this.color+".";
	}
	
	
	
}
