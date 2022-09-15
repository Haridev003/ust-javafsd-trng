package com.ust2;



public class Outer1 {

	class Inner1{
		void display() {
			System.out.println("in inner class");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Inner1 i= new Outer1().new Inner1();
      i.display();
	}

}
