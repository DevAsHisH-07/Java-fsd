package com.example;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDAO {
	private JdbcTemplate temp;

	public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}
	
	
	/*Driver ->connection -> statement ->execute -> close 
	 * 
	 * */
	
	//Driver ->connection[spring.xml]
	
	public int insert(Student sobj) {
		String sql="insert into student values("+sobj.getId()+",'"+sobj.getName()+"','"+sobj.getEmail()+"')";
		//insert update delete 
		return temp.update(sql);
		
	}
	
	public int update(int id,String name) {
		String sql = "update student set sname='"+name+"'where sid="+id;
		return temp.update(sql);
	}

}
