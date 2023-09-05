package com.TopsAssignments3;

class PrintNumber
{
	public void printn(int n)
	{
		System.out.println("Integer prints..."+n);
	}
	public void printn(float n)
	{
		System.out.println("Float Type no prints..."+n);
	}
   public void printn(double n)
	{
		System.out.println("Double type number prints..."+n);
	}
   public void printn(long n)
  	{
  		System.out.println("Long type number prints..."+n);
  	}
}

public class PrintAllNumberUsingMethodOverride 
{

	public static void main(String[] args) 
	{

		PrintNumber printNo = new PrintNumber();
		printNo.printn(145);
		printNo.printn(65.54f);
		printNo.printn(124345d);
		printNo.printn(1234545464);
	}
}
