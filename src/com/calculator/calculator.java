package com.calculator;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Arithmetic Calculator");
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();
		
        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Quit");
            System.out.print("Enter your choice (1/2/3/4/5): ");
            
            int choice = sc.nextInt();
            
            if (choice == 5) {
                System.out.println("Closing.....Closed");
                break;
            }
            

            
            double result = 0;
            
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero!");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    continue;
            }
            
            System.out.println("Result: " + result+"\n");
        }
        
	}

}
