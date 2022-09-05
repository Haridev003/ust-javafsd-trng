package com.ust2;

 class Animal2 {
	 protected String  type="Animal";

}
 class Dog2 extends Animal2{
	 public String type="mamal";
	 public void    printType() {
		 System.out.println("iam a"+type);
		 System.out.println("iam a"+super.type);
	 }
	 
 }

 class Main9{
	 public static void main(String args[])
	 {
		 Dog2 dog1=  new Dog2();
		 dog1.printType();
	 }
 }