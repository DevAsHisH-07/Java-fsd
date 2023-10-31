package com.arrayrotation;

import java.util.Arrays;

public class ArrayRotation {
    public static void rightRotateBy5(int[] arr) {
        int n = arr.length;
        int k = 5; // Number of steps to rotate      
        int[] temp = new int[k];
       
        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }
      
        for (int i = n - 1; i >= k; i--) {
            arr[i] = arr[i - k];
        }

        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6};      
        System.out.println("Original Array: " + Arrays.toString(arr));
        rightRotateBy5(arr);
        System.out.println("Array after right rotation by 5 steps: " + Arrays.toString(arr));
    }
}
