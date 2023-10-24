package com.constructor.parameterized;

public class box {
	//parameterized constructor
	box(int l, int b, int h){
		int vol= l*b*h;
		System.out.println("volume of box: "+vol);
	}
}