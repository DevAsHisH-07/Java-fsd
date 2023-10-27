package com.exceptionhandling;

public class TryCatch {
	

		public static void main(String[] args) {
			try {
			int a=50/0;  //exception object
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Closing Program...");
		}

	


}