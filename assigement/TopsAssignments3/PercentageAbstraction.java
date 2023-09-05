package com.TopsAssignments3;

abstract class Marks
{
	public abstract float getPercentage();
}
class StudentA extends Marks
{
	float s1,s2,s3;

	public StudentA(float s1, float s2, float s3) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	@Override
	public float getPercentage() {
		float per = (s1+s2+s3)/3;
		return per;
		
	}
}
class StudentB extends Marks
{
	float s1,s2,s3,s4;
	
	public StudentB(float s1, float s2, float s3, float s4) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
	}

	@Override
	public float getPercentage() {
		// TODO Auto-generated method stub
		return 0;
	}
}
public class PercentageAbstraction 
{

	public static void main(String[] args) 
	{
		StudentA sa = new StudentA(68,67,98);
		System.out.println("Percentage of Student A :"+sa.getPercentage());
		StudentB sb = new StudentB(37 ,70,62,88);
		System.out.println("Percentage of Student A :"+sb.getPercentage());
	}

}
