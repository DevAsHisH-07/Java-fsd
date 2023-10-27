package com.oops;

public class CalculatorImpl extends Calculator{

	@Override
	public void sum(int value1, int value2) {
		System.out.println("sum of the numbers are :"+(value1+value2));
		
	}

	@Override
	public void sub(int value1, int value2) {
		System.out.println("sub of the numbers are :"+(value1-value2));
		
	}
	
}
