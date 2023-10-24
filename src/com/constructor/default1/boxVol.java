package com.constructor.default1;

import java.util.Scanner;

public class boxVol {
	int l,b,h;
	//default Constructor
	boxVol(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the dimmension: ");
		l=sc.nextInt();
		b=sc.nextInt();
		h=sc.nextInt();
		int vol=l*b*h;
		System.out.println("volume of box: "+vol);
		sc.close();
	}


}
