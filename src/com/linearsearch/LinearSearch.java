package com.linearsearch;

public class LinearSearch {
	
	static int linearSearch(int[] arr,int target) {
		if(arr.length==0) {
			return -1;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
			  return i;
			}
		
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {12,13,17,28,36,72};
		System.out.println(linearSearch(arr, 17));
	}

}