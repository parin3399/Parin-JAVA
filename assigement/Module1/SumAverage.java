package com.TopsAssignments;

import java.util.Scanner;

public class SumAverage 
{

	public static void main(String[] args) 	
	{	
		int sum=0;
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a five number  ");
		for (int i=0;i<5;i++)
		{
			int num = s1.nextInt();
			sum = sum+num;
			
		}
		int avg=sum/5;
		System.out.println();
		System.out.println("Sum of five no are  "+sum);
		System.out.println("Average of five no are  "+avg);
	}

}
