package com.exceptionhandling;
//rule 1: class need to extend superclass exception 

public class InvalidAge extends Exception {
	//rule -2 toString to print the exception definition 
	public InvalidAge(String msg) {
		super(msg);
	}


}