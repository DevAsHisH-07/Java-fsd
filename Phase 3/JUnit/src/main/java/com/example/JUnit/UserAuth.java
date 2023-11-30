package com.example.JUnit;

public class UserAuth {
	public boolean authenticate(String username, String password) {
	 
	      return "admin".equals(username) && "password".equals(password);
	  }
}
