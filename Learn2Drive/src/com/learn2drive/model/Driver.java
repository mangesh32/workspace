package com.learn2drive.model;

public class Driver {
	private String name;
	private License license;
	private Car[] cars; //Containership : -->Aggregation
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public License getLicense() {
		return license;
	}

	public void setLicense(License license) {
		this.license = license;
	}

	public Car[] getCars() {
		return cars;
	}

	public void setCars(Car[] cars) {
		this.cars = cars;
	}
	
}
