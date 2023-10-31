package com.fourthsmallest;

import java.util.Arrays;
import java.util.Scanner;

public class FourthSmallest {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of elements in the list: ");
    int n = scanner.nextInt();

    System.out.print("Enter the elements of the list: ");
    int[] list = new int[n];
    for (int i = 0; i < n; i++) {
      list[i] = scanner.nextInt();
    }
    // Sort the list
    Arrays.sort(list);

    // Find the fourth smallest element
    int fourthSmallestElement = list[3];

    System.out.println("The fourth smallest element in the list is: " + fourthSmallestElement);
  }
}