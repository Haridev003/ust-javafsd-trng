package com.ust;

public class Overloading {
	
	int add(int a ,int b) {
		 
		return a+b;
	}
	
	float add(int a ,float b) {
		 
		return a+b;
	}
	float add(float a ,float b) {
		 
		return a+b;
	}
	
	int add(int a , int b,int c) {
		 
		return a+b+c;
	}
	
	public static void main(String args[]) {
		Overloading o =new Overloading();
		System.out.println(o.add(3.5f, 4.5f));
		System.out.println(o.add(3,4));
		System.out.println(o.add(3,4,5));
		
	}

}
