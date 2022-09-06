package com.ust2;

interface Polygon{
	void getArea();
	default  void getSide() {
		System.out.println("I can  get sides of a polygon");
	}
}
class Rectangle implements Polygon{
	public void getArea(){
		int length=6;
		int breadth=5;
		int area= length*breadth;
		System.out.println("The area of Rectangle is"+area);
		
	}
	public void getSides() {
		System.out.println("i have 4 sides");
	}
	
}
class Square  implements Polygon{
	
	public void getArea() {
		int length =5;
		int area= length*length;
		System.out.println("The area of square is"+ area);
	}
}
class Main_8{
	public static void main(String args[]) {
		Rectangle r1 = new Rectangle();
		r1.getArea();
		r1.getSides();
	}
}