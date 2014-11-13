package com.practicalJava.lesson4;

public class TestTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double grossIncome;
		String state;
		int dependents;
		
		grossIncome = 50000;
		dependents = 2;
		state = "NY";
		
		Tax t = new Tax(grossIncome, state, dependents);
		
		double yourTax = t.calcTax();
		Tax.dollarToEuro(yourTax);
		
		Tax t2 = new Tax(65000, "TX", 4);
		double hisTax = t2.calcTax();
		Tax.dollarToEuro(hisTax);
		
	}

}
