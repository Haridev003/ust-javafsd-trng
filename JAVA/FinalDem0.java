package com.ust2;


class FinalClass {
  public final void display() {
	  System.out.println("this is afinal method");
  }
}
class   Main14 extends FinalClass{
	public final void display() {
		System.out.println("the final method  is overriden");
	}
	public  static void main(String args[]) {
		Main12 obj =new Main12();
		obj.display();
	}
}