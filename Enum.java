package com.ust2;
enum Signal{
	red(5),orange(10),green(15);
	private int x;
	private Signal(int x) {
		this.x=x;
	}
	int getIndex() {
		 return x;
	}



}
public class Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Signal s= Signal.green;
    System.out.println(s.green.getIndex());
    System.out.println(s.name());
    System.out.println(s.valueOf("red"));
	}

}
