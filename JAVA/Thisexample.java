package com.ust;

public class Thisexample {
	static int x=1;
	private int y=3;
	public void method1(int x)
	{
		Thisexample t = new Thisexample();
		this.x=2;
		y=4;
		System.out.println("Test.x:"+Thisexample.x);
		System.out.println("t.x:"+t.x);
		System.out.println("t.y:"+t.y);
		System.out.println("y:"+y);
		
	}
	public static void main(String args[]) {
		Thisexample t= new Thisexample();
		t.method1(5);
	}
}
