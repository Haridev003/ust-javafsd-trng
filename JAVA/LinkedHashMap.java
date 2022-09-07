package com.ust2;

import java.util.LinkedHashMap;
class Main_18{
	public static void main(String args[]) {
		LinkedHashMap<String,Integer>evenNumbers= new LinkedHashMap<>();
		evenNumbers.put("two", 2);
		evenNumbers.put("four", 4);
		System.out.println("linked hash map1:"+evenNumbers);
		LinkedHashMap<String,Integer>numbers= new LinkedHashMap<>(evenNumbers);
		numbers.put("Three", 3);
		System.out.println("LinkedHashMap2:"+numbers);
		
	}
}

