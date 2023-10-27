package com.exceptionhandling;

public class AgeValid {

	public void ageValidation(int age) throws InvalidAge {
		if(age>=18) {
			System.out.println(StringConstantPool.OUTPUT_SUCCESS);
		}
		else {
			//model -2 
			throw new InvalidAge(StringConstantPool.FAILED);
		}
	}
	
}