package com.practicalJava.lesson4;

public class Tax {
	// class member variables
	double grossIncome;
	String state;
	int dependents;
	static int customerCounter;
	
	//Constructor with 3 arguments
	Tax (double grossIncome, String state, int dependents){
		this.grossIncome = grossIncome;
		this.state = state;
		this.dependents = dependents;
		customerCounter++;
		
		System.out.println("Preparing the tax data for customer #" + customerCounter);
	}
	
	//Method for calculating taxes
	double calcTax(){
		return (grossIncome*0.33 - dependents*100);
	}
	
	//Utility function to convert the tax value from dollars to euro
	static void dollarToEuro(double dollar){
		double euro = dollar*1.25;
		System.out.println("This is tax in euro: " + euro);
	}

}
