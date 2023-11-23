package com.example;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class StudentDAO {

	private HibernateTemplate temp;

	public void setTemp(HibernateTemplate temp) {
		this.temp = temp;
	}
	
	//insert
	public int insert(Student s) {
		return (int) temp.save(s);
	}
	
	//update and delete -> temp.update , temp.delete 
	
//retrieve 
	public List<Student> getal(){
		return (List<Student>) temp.find("from Student");
	}
	
	
}
