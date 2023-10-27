package com.oops;

public class Encapsulation {
	private int sId;
	private String sName;
	private int cId;
	private String cName;
	private int fId;
	private String fName;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getSname() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getfId() {
		return fId;
	}
	public void setfId(int fId) {
		this.fId = fId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", cId=" + cId + ", cName=" + cName + ", fId=" + fId
				+ ", fName=" + fName + "]";
	}
	
	public static void main(String[] args) {
		Encapsulation s1 = new Encapsulation();
		s1.setsId(1);
		s1.setsName("Devashsish");
	    s1.setcId(101);
	    s1.setcName("java");
	    s1.setfId(11);
	    s1.setfName("karthik");
	    System.out.println(s1);
	    
	    Encapsulation s2 = new Encapsulation();
		s2.setsId(2);
		s2.setsName("Rohan Kumar");
	    s2.setcId(202);
	    s2.setcName("C++");
	    s2.setfId(17);
	    s2.setfName("Rahul");
	    System.out.println(s2);
	    
	    Encapsulation s3 = new Encapsulation();
		s3.setsId(2);
		s3.setsName("Neetu yadav");
	    s3.setcId(303);
	    s3.setcName("Python");
	    s3.setfId(19);
	    s3.setfName("Shivani");
	    System.out.println(s3);
	}

}
