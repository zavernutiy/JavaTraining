package com.practicalJava.lesson3.oop;

public class Tax {
	private double grossIncome;
	private String state;
	private int dependents;
	
	public double calcTax(){
		if (grossIncome < 50000){
			return grossIncome * 0.06;
		}
		else {
			return grossIncome * 0.08;
		}
	}
	
	public double getGrossIncome(){
		return grossIncome;
	}
	
	public void setGrossIncome(double grossIncome){
		this.grossIncome = grossIncome;
	}
	
	public String getState(){
		return state;
	}
	
	public void setState(String state){
		this.state = state;
	}
	
	public int getDependents(){
		return dependents;
	}
	
	public void setDependents(int dependents){
		this.dependents = dependents;
	}

}
