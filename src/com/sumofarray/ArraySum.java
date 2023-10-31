package com.sumofarray;

import java.util.Scanner;

public class ArraySum {
	static int sumOfArrayElement(int[] arr, int left, int right) {
		int sum=0;
		if(left>=0 && right<arr.length) {
			for(int i=left;i<=right;i++) {
				sum += arr[i];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter left index: ");
		int left=sc.nextInt();
		System.out.println("Enter right index: ");
		int right=sc.nextInt();
		int sum=sumOfArrayElement(arr,left,right);
		System.out.println("sum of array between given range is : "+sum);
	}

}