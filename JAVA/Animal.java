package com.ust2;

 class Animal {
public void display() {
	System.out.println("Iam an animal");
}
}
 class Dog extends Animal{
	 public void display() {
		 System.out.println("Iam a  dog");
	 }
	 public void  printMessage() {
		 display();
		 
	 }
	 
 }
 
 class main7{
	 public static void main(String[] args) {
		 Dog dog1  =   new Dog();
		 dog1.printMessage();
	 }
	 
 }
