package com.TopsAssignments;

import java.util.Scanner;

public class LeapYear 
{

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a year  ");
		int yr = s1.nextInt();
		
		if(yr%400==0)
		{
			System.out.println(yr+" is Leap Year");
		}
		else if(yr%100==0)
		{
			System.out.println(yr+" is not Leap Year");
		}
		else if(yr%4==0)
		{
			System.out.println(yr+" is Leap Year");
		}

	}

}
