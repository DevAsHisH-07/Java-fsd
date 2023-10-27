package com.oops;

import java.util.Scanner;

class Bank{
	double roi;
	double amount;
	void calculateAmoutWithRoi(double amount) {
		double finalAmpount = amount+(amount/100)*roi;
		System.out.println("Final amount is: "+finalAmpount);
	}
}
class Hdfc extends Bank{
	double amount;
	void calculateAmountWithRoi(double amount) {
		this.amount = amount;
		super.roi=7.5;
		System.out.println("HDFC: ");
		super.calculateAmoutWithRoi(amount);
	}


}
class Icici extends Bank{
	double amount;
	void calculateAmount(double amount) {
		this.amount = amount;
		super.roi=8.5;
		System.out.println("ICICI: ");
		super.calculateAmoutWithRoi(amount);

	}

}

public class InheritanceEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount");
		int amt =sc.nextInt();
		Hdfc hdfc = new Hdfc();
		hdfc.calculateAmountWithRoi(100000);

		Icici icici = new Icici(); 
		icici.calculateAmount(100000);

	}

}