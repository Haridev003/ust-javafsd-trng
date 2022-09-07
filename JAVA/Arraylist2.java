package com.ust2;
import java.util.ArrayList;
import java.util.Iterator;


class Main_23{
	public static  void main(String[] ags) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(2);
		System.out.println("Arraylist:"+numbers);
		Iterator<Integer>iterate= numbers.iterator();
		int number = iterate.next();
		System.out.println("Accessed Element:"+number);
		iterate.remove();
		System.out.println("Removed element:"+number);
		System.out.println("Updataed ArrayList:");
		while(iterate.hasNext()) {
			iterate.forEachRemaining((value)->System.out.print(value+""));
		}
		
		
	}
}
