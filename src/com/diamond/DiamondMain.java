package com.diamond;

public class DiamondMain implements FirstInterface, SecondInterface {
	 public void display() {
	        // Calling the default show() methods from both interfaces
	        FirstInterface.super.display();
	        SecondInterface.super.display();
	    }
	public static void main(String[] args) {
		DiamondMain diamondObj = new DiamondMain();
		diamondObj.display();
		
	}

}