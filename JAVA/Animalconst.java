package com.ust2;
class Animal1 {
public void display() {
	System.out.println("Iam an animal");
}
}
 class Dog1 extends Animal1{
	 public void display() {
		 System.out.println("Iam a  dog");
	 }
	 public void  printMessage() {
		 display();
		 super.display();
		 
	 }
	 
 }
 
 class main8{
	 public static void main(String[] args) {
		 Dog1 dog1  =   new Dog1();
		 dog1.printMessage();
	 }
	 
 }