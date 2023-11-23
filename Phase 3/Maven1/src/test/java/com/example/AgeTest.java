package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class AgeTest {

	@Test
	public void test1() {
		AgeValidator validobj = new AgeValidator();
		String acutal=validobj.agevalidate(18);
		String expect="right to vote";
		assertEquals(expect,acutal);
	}
	
	@Test
	public void test2() {
		AgeValidator validobj=new AgeValidator();
		String actual=validobj.agevalidate(8);
		String expect="not eligible to vote";
		assertEquals(expect, actual);
	}


}
