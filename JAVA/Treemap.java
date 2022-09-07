package com.ust2;

import java.util.Map;
import java.util.TreeMap;
class Main_17{
	public static void main(String args[]) {
		Map<String,Integer>values = new TreeMap<>();
		values.put("Second", 2);
		values.put("First", 1);
		System.out.println("Map using TreeMap:"+values);
		values.put("First", 11);
		values.put("Second", 22);
		System.out.println("Map using TreeMap:"+values);
		int removedValue= values.remove("First");
		System.out.println("Removed value:"+removedValue);
		
	}
}