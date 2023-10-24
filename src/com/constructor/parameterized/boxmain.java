package com.constructor.parameterized;

import java.util.Scanner;

public class boxmain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l,b,h;
		System.out.println("enter the dimmension: ");
		l=sc.nextInt();
		b=sc.nextInt();
		h=sc.nextInt();
		box Box=new box(l,b,h);
		sc.close();
	}

}
