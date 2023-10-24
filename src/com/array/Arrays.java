package com.array;

public class Arrays {
	public static void main(String[] args) {

		//single-dimensional array
		int arr[]= {120,210,350,456,572,622,790};
		for(int i=0;i<5;i++) {
			System.out.println("Elements of array a: "+arr[i]);
		}


		//multidimensional array
		int[][] multiArr = {
				{4, 2, 8, 9}, 
				{11, 7, 6,2} };

		System.out.println("\nLength of row 1: " + multiArr[0].length);
	}
}
