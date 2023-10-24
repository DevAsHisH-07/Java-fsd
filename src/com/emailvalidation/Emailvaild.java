package com.emailvalidation;

import java.util.Scanner;

public class Emailvaild {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        // Define the maximum number of email IDs the user can enter
        System.out.print("Enter the number of email IDs you want to store: ");
        int numEmails = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        String[] emailIds = new String[numEmails];

        // Allow the user to enter email IDs
        for (int i = 0; i < numEmails; i++) {
            System.out.print("Enter email ID " + (i + 1) + ": ");
            emailIds[i] = sc.nextLine();
        }
		
		System.out.print("Enter an email ID to search: ");
        String searchEmail = sc.nextLine();
        Email email=new Email();
        email.emailvaid(emailIds, searchEmail);
        
        sc.close();
        
    }
}

