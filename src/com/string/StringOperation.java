package com.string;

public class StringOperation {

	public static void main(String[] args) {
		//string variable initialization
		String string_var1="string function program";
		String string_var2="string function";

		// Commonly used String function
		System.out.println("String operation are:");
		// Getting character at specific position
		System.out.println(string_var1.charAt(5));

		//getting unicode character at specific function
		System.out.println(string_var1.codePointAt(3));
		//Getting the no. of uni code character b/w given index
		System.out.println(string_var1.codePointCount(0,5));
		//Getting the no. of uni code character before given index
		System.out.println(string_var1.codePointBefore(2));

		//String Comparison
		System.out.println("/n String Comparision");
		System.out.println(string_var1.compareTo(string_var2));
		//comparing by ignoring case
		System.out.println(string_var1.compareToIgnoreCase(string_var2));

		//String Concatenation
		System.out.println(string_var1.concat(string_var2));
		//check if string contains other string
		System.out.println(string_var1.contains(string_var2));
		//check whether the string ends with specific character
		System.out.println(string_var1.endsWith("gram"));
		//check if two string are equal
		System.out.println(string_var1.equals(string_var2));
		//ignoring case
		System.out.println(string_var1.equalsIgnoreCase(string_var2));
		//hash code of string
		//formula: s[0]*31^(n-1) + s[1]*31^(n-2)+.......s[n-1]
		System.out.println(string_var2.hashCode());
		//position of 1st occurrence of specific character
		System.out.println(string_var1.indexOf("program"));
		// check if the string is empty
		System.out.println(string_var1.isEmpty());

		//last occurrence of specific character
		System.out.println("/nLast Occurrence/n");
		System.out.println(string_var1.lastIndexOf("function"));

		//length of string
		System.out.println(string_var1.length());

		//replace
		System.out.println(string_var1.replace("function", "operation"));

		//verifies if string starts with 
		System.out.println(string_var1.startsWith("string"));

		//upper and lower case
		System.out.println(string_var1.toUpperCase());
		String str1="UPPER";
		System.out.println(str1.toLowerCase());

		//trim
		String str2="  Hello World   ";
		System.out.println(str2);
		System.out.println(str2.trim());

		//StringBuilder
		System.out.println("\n");
		System.out.println("Creating StringBuilder");
		StringBuilder sb1=new StringBuilder("Happy");
		sb1.append("Learning");
		System.out.println(sb1);

		System.out.println(sb1.delete(0, 1));

		System.out.println(sb1.insert(1, "Welcome"));

		System.out.println(sb1.reverse());

		//conversion	
		System.out.println("\n");
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");

		String str = "Hello"; 

		// conversion from String object to StringBuffer 
		StringBuffer sbr = new StringBuffer(str); 
		sbr.reverse(); 
		System.out.println("String to StringBuffer");
		System.out.println(sbr); 

		// conversion from String object to StringBuilder 
		StringBuilder sbl = new StringBuilder(str); 
		sbl.append("world"); 
		System.out.println("String to StringBuilder");
		System.out.println(sbl);           

	}

}
