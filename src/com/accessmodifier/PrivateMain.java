package com.accessmodifier;

public class PrivateMain {

	public static void main(String[] args) {
		PrivateAccess priAccessSpecifier = new PrivateAccess();
		System.out.println("calling show method of PrivateAccessSpecifier class");
		// this is not access outside the class because it is private method
		//		priAccessSpecifier.show();

	}

}


