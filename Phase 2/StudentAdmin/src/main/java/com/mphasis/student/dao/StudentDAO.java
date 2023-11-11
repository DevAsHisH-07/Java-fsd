package com.mphasis.student.dao;

import java.sql.SQLException;
import java.util.List;

import com.mphasis.student.pojo.Student;

public interface StudentDAO {
	//insert
	public int insert(Student student) throws ClassNotFoundException, SQLException;
	//display
	public List<Student> displayallStudents() throws ClassNotFoundException, SQLException;
	//delete
	public List<Student> deleteStudent(String id) throws ClassNotFoundException, SQLException;
	//update 
	public List<Student> updateStudent(String id,String name) throws ClassNotFoundException, SQLException;
	
}
