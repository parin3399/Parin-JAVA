package com.TopsAssignments;

import java.util.Scanner;

public class GreatestNo 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the First no  ");
		int num1= s1.nextInt();
		
		System.out.println("Enter the Second no  ");
		int num2= s1.nextInt();
		
		System.out.println("Enter the Third no  ");
		int num3= s1.nextInt();
		
		int greatest = num1;
		if(num2 > greatest)
		{
			greatest = num2 ;
		}
		if(num3 > greatest)
		{
			greatest = num3 ;
		}
		System.out.println("The greatest no is  "+greatest);
	}

}
