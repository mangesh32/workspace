package com.psl.client;

public enum FuelType {
	PETROL(250),
	DIESEL(1440),
	NATURAL_GAS(2500);
	
	private FuelType(int combustionTempture){
		this.combustionTemprature=combustionTempture;
	}
	
	private int combustionTemprature;

	public int getCombustionTemprature() {
		return combustionTemprature;
	}

	public void setCombustionTemprature(int combustionTemprature) {
		this.combustionTemprature = combustionTemprature;
	}
	
	
}
