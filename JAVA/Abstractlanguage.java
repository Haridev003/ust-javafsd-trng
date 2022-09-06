package com.ust2;

abstract class Abstractlanguage {
public void display() {
	System.out.println("This is Java programming");
 }
}
class Main_1 extends Abstractlanguage{
	public static void main(String args[]) {
		Main_1 obj = new Main_1();
		obj.display();
	}
}
