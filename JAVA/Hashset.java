package com.ust2;

import java.util.HashSet;
class Main_20{
	public static void main(String args[]) {
		HashSet<Integer>evenNumber=new HashSet<>();
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		System.out.println("Hashset:"+evenNumber);
		HashSet<Integer>numbers = new HashSet<>();
		numbers.addAll(evenNumber);
		numbers.add(5);
		System.out.println("new HashSet "+ numbers);
		
		
	}
}

