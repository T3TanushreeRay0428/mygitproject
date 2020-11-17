package com;

public class Student {
	private String fullName;
	private double gpa;
	
	@Override
	public String toString() {
		return "Student fullname is " + fullName + ", Student gpa is " + gpa ;
	}

	
	public Student()
	{
		this.fullName="Tanushree Ray";
	}
	
	public Student(String fullName, double gpa)
	{
		this.fullName=fullName;
		this.gpa=gpa;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	

}
