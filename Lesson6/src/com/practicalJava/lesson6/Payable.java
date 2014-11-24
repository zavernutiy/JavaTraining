package com.practicalJava.lesson6;

public interface Payable {
	//Variable for max percentage of pay increase
	final int INCREASE_CAP = 20;
	
	boolean increasePay(int percent);

}
