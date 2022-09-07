package com.ust2;

class GenericClass <T extends Number>{
	public void display() {
		System.out.println("This is a bounded typegeneric class");
	}
}
class Main_05{
	public static void main(String[] args) {
		//GenericClass<String>obj=new GenericClass<>();//error
		GenericClass<Integer>obj=new GenericClass<>();
	}
}