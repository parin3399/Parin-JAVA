 package com.TopsAssignments2;

import java.util.Scanner;

public class ExpressionValue 
{

	public static void main(String[] args) 
	{
	System.out.println("Enter the value of n: ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int ExpValue=n+(n*n)+(n*n*n);
	System.out.println("Expression Value(n+nn+nnn) is :"+ExpValue);
	}

}
