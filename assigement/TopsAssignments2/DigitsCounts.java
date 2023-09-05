package com.TopsAssignments2;

import java.util.Scanner;

public class DigitsCounts 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		int dc=0;
		System.out.println("Enter the Number  ");
		int num=sc.nextInt();
		
		while(num!=0)
		{
			num=num/10;
			dc++;
		}
		System.out.println("Number of Digits is  "+dc);
	}

}
