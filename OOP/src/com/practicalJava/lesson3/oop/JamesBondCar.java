package com.practicalJava.lesson3.oop;

public class JamesBondCar extends Car {
	private int currentSubmergeDepth;
	private boolean isGunOnBoard = true;
	final String MANUFACTURER = "Aston Martin";
	
	public void submerge(){
		currentSubmergeDepth = 50;
		//some code goes here
	}
	
	void surface(){
		//some code goes here
	}

}
