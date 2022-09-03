package com.ust;

public class Final1 extends super1 {
 final int x= 5;
 int y;
 
 /**void display() {
	 System.out.println("in final");
 }*/
 
 public static void main( String  args[]) {
	 Final1 s = new Final1();
	 //s.x=7;
	 s.y=8;
	 System.out.println(s.z);
	 System.out.println();
	 s.display();
	 
	 
 }
}


  class super1{
	
	  final int z= 10;
	  final void display() {
		  System.out.println("in display");
	  }
	  
	 void display(int x) {
		 System.out.println("*");
	 }
}
