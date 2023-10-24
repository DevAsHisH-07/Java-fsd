package com.innerclass;

public class InnerClass1 {
	class InnerClass{
		void display() {
			System.out.println("This is inner class method");
		}
		
	}
	public static void main(String[] args) {
		InnerClass1 obj =new InnerClass1();
		InnerClass1.InnerClass in=  obj.new InnerClass();
		in.display();
	}
}
