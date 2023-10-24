package com.innerclass;

public class InnerClass2 {
	private String msg ="This is inner class second example ";
	void display(){  
		class Inner{  
			void msg(){
				System.out.println(msg);
			}  
		}  
		Inner i=new Inner();  
		i.msg();
	}

	public static void main(String[] args) {
		InnerClass2  obj=new InnerClass2();  
		obj.display();  
	}
}


