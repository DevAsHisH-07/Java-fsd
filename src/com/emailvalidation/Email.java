package com.emailvalidation;

public class Email {
	public void emailvaid(String[] emailIds,String searchEmail) {


        // Flag to track if the email was found
        boolean found = false;

        ;
		// Iterate through the array to search for the email
        for (String email : emailIds) {
            if (email.equalsIgnoreCase(searchEmail)) {
                found = true;
                break;
            }
        }

        // Display the result
        if (found) {
            System.out.println("Email ID found: " + searchEmail);
        } else {
            System.out.println("Email ID not found: " + searchEmail);
        }

	}
}
