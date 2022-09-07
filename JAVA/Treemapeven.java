package com.ust2;

import java.util.TreeMap;
class Main_19{
	public static void main(String args[]) {
		TreeMap<String,Integer>evenNumbers = new TreeMap<>();
		evenNumbers.put("two",2);
		evenNumbers.put("four",4);
		evenNumbers.putIfAbsent("six", 6);
		System.out.println("Treemap of even numbers:"+evenNumbers);
		TreeMap<String,Integer>numbers = new TreeMap<>();
		numbers.put("one", 1);
		numbers.putAll(evenNumbers);
		System.out.println("treemap of numbers:"+numbers);
	}
}
