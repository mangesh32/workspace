package com.psl.client;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driveVehicle(new Airplane());
		driveVehicle(new Truck());

	}
	
	
	//############################################
	public static void driveVehicle(Driveable d){
		d.accelerate();
		d.steer();
	}

}
