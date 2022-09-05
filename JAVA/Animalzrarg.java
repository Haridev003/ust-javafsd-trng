package com.ust2;

 class Animal3 {
	 Animal3(){
		 System.out.println("Iam an animal");
	 }

}
 class Dog3  extends  Animal3{
	 Dog3(){
		 super();
		 System.out.println("I am a dog");
	 }
 }
class Main10{
	public static void main(String args[]) {
		Dog3 dog1 = new Dog3();
	
	}
}