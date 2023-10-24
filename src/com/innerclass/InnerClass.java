package com.innerclass;

public class InnerClass {
	public static void main(String[] args) {
		InnerClass3 in = new InnerClass3() {

			public void show() {
				System.out.println("This is abstract inner class example");
			}
		};
		in.show();

	}
}
