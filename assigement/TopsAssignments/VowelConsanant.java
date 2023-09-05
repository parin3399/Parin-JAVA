package com.TopsAssignments;

import java.util.Scanner;

public class VowelConsanant 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any Character  ");
		String st=sc.next();
		char c=st.charAt(0);
		if(st.length()>1)
		{
			System.out.println("Error  length is more than one character ");
			
		}
		else if(c=='a' || c=='A' || c=='e' || c=='E' ||c=='i' || c=='I' ||c=='o' || c=='O' ||c=='u' || c=='U')
		{
			System.out.println(" Character is Vowel   ");
		}
		else
		{
			System.out.println(" Character is Consonant   ");
		}
	}

}
