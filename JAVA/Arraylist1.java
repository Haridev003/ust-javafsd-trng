package com.ust2;

import java.util.List;
import java.util.ArrayList;

/**
 * The type Main 10.
 */
class Main_10{
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.println("List:"+numbers);
		int number= numbers.get(2);
		System.out.println("accessed element:"+numbers);
		int removedNumber = numbers.remove(1);
		System.out.println("Removed element:"+removedNumber);
		
	}
}

