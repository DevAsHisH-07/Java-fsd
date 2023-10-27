package com.exceptionhandling;

import java.util.Scanner;

public class AgeMain {

	public static void main(String[] args) throws InvalidAge {
		Scanner sc= new Scanner(System.in);
		AgeValid ageobj=new AgeValid();
		System.out.println("Enter the Age: ");
		int age = sc.nextInt();
		ageobj.ageValidation(age);
		
	}

}
