package com.TopsAssignments3;

class MyThread1 implements Runnable
{

	@Override
	public void run() {

		System.out.println("Thread is Running...");
	}
	
}

public class Multithreading_UsingRunnableInterface 
{

	public static void main(String[] args) 
	{
		MyThread1 mythread1 = new MyThread1();
		Thread t1 = new Thread(mythread1);
		t1.start();


	}

}
