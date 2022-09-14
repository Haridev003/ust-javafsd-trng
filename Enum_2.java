package com.ust2;
enum Size1{
	SMALL,MEDIUM,LARGE,EXTRALARGE;
}
class Test01{
	Size1 pizzaSize;
	public Test01(Size1 pizzaSize) {
		this.pizzaSize=pizzaSize;
	}
	public void orderPizza() {
		switch(pizzaSize) {
		case SMALL: System.out.println("I ordered a small pizza");
		               break;
		case MEDIUM : System.out.println("I ordered a medium pizza");
                       break;               
		default:
			System.out.println("I don't know which one order");
			break;
		}
	}
}
public class Enum_2 {
 public static void main(String [] args) {
	 Test01 t1 = new Test01(Size1.MEDIUM);
	 t1.orderPizza();
 }
}
