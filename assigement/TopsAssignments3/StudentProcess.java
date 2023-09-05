package com.TopsAssignments3;

import java.util.Scanner;

public class StudentProcess 
{
	 
	 
	 
	public static void main(String[] args) 
	{
			Scanner scanner =new Scanner(System.in);
	        
	        // Student Inquiry Form
	        System.out.println("Welcome to Student Registration!");
	        System.out.print("Enter your name: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter your age: ");
	        int age = scanner.nextInt();
	        scanner.nextLine(); // Consume newline character
	        
	        // Student Registration
	        System.out.print("Enter your email: ");
	        String email = scanner.nextLine();
	        System.out.print("Enter your course: ");
	        String course = scanner.nextLine();
	        System.out.print("Enter your months: ");
	        int semester = scanner.nextInt();
	        scanner.nextLine(); // Consume newline character
	        
	        
	        
	        // Certificate Generation
	       
	        
	        int months=scanner.nextInt();
	        if(months >= 4)
	        {
	        	System.out.println("Certificate generated successfully!");
	        	 System.out.println("Generating certificate...");
	 	        System.out.println("-------------------------------");
	 	        System.out.println("Name: " + name);
	 	        System.out.println("Age: " + age);
	 	        System.out.println("Email: " + email);
	 	        System.out.println("Course: " + course);
	 	        System.out.println("Semester: " + semester);
	 	        System.out.println("Months: " );
	 	        System.out.println("-------------------------------");
	        	
	        }
	        else
	        {
	        	System.out.println("Certificate not generated ");
	        }
	    }
	
	}


