package com.stack;

import java.util.Scanner;

public class Stack {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of a stack ");
		int size=sc.nextInt();
		int stack[]=new int[size];
		int top =-1;
		System.out.println("stack Operations ");
		while(true) {
			System.out.println();
			System.out.println("enter the choice 1. push 2.pop 3.display 4. exit ");
			int ch = sc.nextInt();
			switch(ch) {
			case 1: if(top==size-1) {
				System.out.println("Stack is full");
			}
			else {
				System.out.println("Enter the ele to enter");
				int key=sc.nextInt();
				top++;
				stack[top]=key;
			}
			break;
			case 2: if(top==-1) {
				System.out.println("Stack empty");
			}
			else {
				System.out.println("Element deleted is : "+stack[top]);
				top-=1;
			}
			break;
			case 3: if(top==-1) {
				System.out.println("stack is empty ");
			}
			else {
				for(int i=top;i>=0;i--) {
					System.out.print(stack[i]+"-->");
				}
			}
			break;	
			case 4:System.exit(0);
			break;
			default:System.out.println("check ur choice ");
			break;
			}
		}

	}

}


