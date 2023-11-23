package com.example;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		Student s=ac.getBean(Student.class);
		StudentDAO dao=ac.getBean(StudentDAO.class);
		Scanner sc=new Scanner(System.in);
//		System.out.println("enter student id value ");
//		s.setId(sc.nextInt());
//		System.out.println("enter student name value ");
//		s.setName(sc.next());
//		System.out.println("enter student email value");
//		s.setEmail(sc.next());
//		if(dao.insert(s)>0) {
//			System.out.println("inserted the record into the student table ");
//		}
//		else {
//			System.out.println("insertion failed ");
//		}
		
		System.out.println("enter the id to update");
		int id = sc.nextInt();
		System.out.println("enter the updated name");
		String name=sc.next();
		dao.update(id, name);
		System.out.println("Updated successfully");

	}

}
