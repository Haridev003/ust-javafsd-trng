package com.ust2;

class ThrowsExcep{
	static void fun() throws IllegalAccessException{
		System.out.println("inside fun().");
		throw new IllegalAccessException("demo");
	}
	public static void  main(String args[]) {
		try {
			fun();
		}
		catch(IllegalAccessException e) {
			System.out.println("Caught in main");
		}
	}

}
