package com.ust2;

import java.util.TreeSet;
import java.util.Iterator;
class Main_22{
	public static void main(String args[]) {
		TreeSet<Integer>numbers=new TreeSet<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(6);
		System.out.println("Treeset:"+numbers);
		Iterator<Integer>iterate=numbers.iterator();
		System.out.println("TreeSet using Iterator:");
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
			System.out.println(",");
		}
	}
}