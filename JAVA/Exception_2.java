package com.ust2;

public class Exception_2 {
	public static void main(String args[]) {
		try {
			int divideByZero=5/0;
			System.out.println("Rest of cod in try block");
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException =>"+e.getMessage());
		}
	
    finally {
    	System.out.println("This is the finally block");
    }
	}
}
