package com.coffee;

public class Capacinoo implements CoffeeMachine {
	
	private String cream;
	
	public String getCream() {
		return cream;
	}

	public void setCream(String cream) {
		this.cream = cream;
	}

	@Override
	public void rateOfCoffee() {
		System.out.println("Rate is $2");
		
	}

	@Override
	public void typeOfCoffee() {
		System.out.println("Type is Capacinoo");
		
	}
	
}
