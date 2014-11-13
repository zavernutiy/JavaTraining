package com.practicalJava.lesson3.oop;

public class NJTax extends Tax {
	
	public double calcTax(){
		if (super.getGrossIncome() < 50000){
			return super.getGrossIncome() * 0.10;
		}
		else {
			return super.getGrossIncome() * 0.13;
		}
	}

}
