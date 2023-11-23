package com.example;

public class Airtel implements Sim {
	
	private String signal;
	
	public String getSignal() {
		return signal;
	}

	public void setSignal(String signal) {
		this.signal = signal;
	}

	@Override
	public void typeOfSim() {
		System.out.println("this is an airtel sim");
		
	}

	@Override
	public void dataTypeOfSim() {
		System.out.println(" this supports a 5G data ");
		
	}

}
