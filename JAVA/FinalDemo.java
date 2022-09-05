package com.ust2;

class FinalDemo5 {
  public final void display() {
	  System.out.println("this is afinal method");
  }
}
class   Main12 extends  FinalDemo5{
	public final void display() {
		System.out.println("the final method  is overriden");
	}
	public  static void main(String args[]) {
		Main12 obj =new Main12();
		obj.display();
	}
}
