package com.TopsAssignments4;

import java.util.HashMap;

public class HashMapExample 
{

	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(1, "Dhoni");
		hm.put(2, "Meet");
		hm.put(3, "Parin");
		hm.put(4, "Pajji");
		hm.put(5, "SP");
		System.out.println("HashMap Elements : "+hm);
		
		int size =hm.size();
		System.out.println("Size of HashMap : "+size);


	}

}
