package com.ust;
import java.util.Scanner;

class Input {

	public static void main (String args[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter float:");
		float myFloat = input.nextFloat();
		System.out.println("float entered="+ myFloat);
		System.out.print("Enter Double:");
		double myDouble = input.nextDouble();
		System.out.println("float entered="+ myDouble);
		System.out.print("Enter String:");
		String myString = input.next();
		System.out.println("Texted entered="+ myDouble);
		
		
		
		
	}
}
