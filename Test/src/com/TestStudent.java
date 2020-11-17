package com;
import java.util.*;

public class TestStudent {
	
	    public static void main (String [ ] args) {

	    	Scanner sc= new Scanner(System.in);
	         System.out.println("Enter the fullname of the student: ");
	         String studentName = sc.nextLine();
	         System.out.println("Enter the GPA of the student: ");
	         double gpa=sc.nextDouble();
	         Student s1=new Student();
	         Student obj=new Student(studentName,gpa);
	         System.out.println(obj);
	         obj.setGpa(4.4);
	         System.out.println("Updated GPA of the student is " +obj.getGpa());
	            }

	    
	}


