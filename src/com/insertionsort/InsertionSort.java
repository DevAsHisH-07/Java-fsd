package com.insertionsort;

import java.util.Arrays;

public class InsertionSort {
	static void insertionSort(int array[]) {
		    int size = array.length;

		    for (int step = 1; step < size; step++) {
		      int key = array[step];
		      int j = step - 1;

		      
		      while (j >= 0 && key < array[j]) {
		        array[j + 1] = array[j];
		        --j;
		      }

		    
		      array[j + 1] = key;
		    }
	}
	public static void main(String[] args) {
		 int arr[] = {11,26,4,120,463,34};
		 insertionSort(arr);
			System.out.println(Arrays.toString(arr));

	}

}