package com.ust2;

class Main_04{
	public static void main(String args[]) {
		DemoClass demo = new DemoClass();
		demo.<String>genericsMethod("java programming");
		demo.<Integer>genericsMethod(25);
		
	}
}
class DemoClass{
	public <T> void genericsMethod(T data) {
		System.out.println("Generics Method:");
		System.out.println("Data Passed :"+data);
	}
}