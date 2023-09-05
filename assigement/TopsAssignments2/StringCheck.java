package com.TopsAssignments2;

public class StringCheck 
{

	public static void main(String[] args)
	{
		String str1 = "ROYALS ROY is favorite car";
		String str2 = "GMC is also my favorite car";
		String str3 = "BLACK CLASS";
		
		System.out.println("ROYALS ROY is favorite car. BLACK CLASS  :"+str1.startsWith(str3));
		System.out.println("GMC is also my favorite car.Start with BLACK CLASS  :"+str2.startsWith(str3));

	}

}
