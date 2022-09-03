package com.ust;

class car {
	String model;
	String color;
	int wheels;
	int seats;
	String GearType;
	void display() {
		System.out.println("In car Class");
	}
	
}

class ciaz  extends car
{
 void display()	{
	 System.out.println(" In ciaz  class");
	 
 }
   void show() {
	   System.out.println(" In show method");
		 
	   
   }
}


public class Ertiga extends car {
	void display()	{
		  System.out.println(" In Ertiga class");
		  super.display();
	 }
public static void main() {
	ciaz c = new ciaz();
	c.display();
	c.show();
	Ertiga e = new Ertiga();
	e.display();
	System.out.println(e.color);

}
}
