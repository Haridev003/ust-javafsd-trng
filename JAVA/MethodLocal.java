package com.ust2;

public class MethodLocal {
	void display() {
		int x= 5;
		
		class MethodInner{
			
			void display1() {
				System.out.println("In method inner");
			}
		}
		MethodInner i= new MethodInner();
		i.display1();
	}//method ends

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MethodLocal m1 = new MethodLocal();
      m1.display();
      System.out.println("calling outter class");
	}

}
