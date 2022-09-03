package com.ust;
class Fruit{};
class Vechicle{};

public class InstanceofDemo {
	public static void main(String args[]) {
		Fruit pineapple = new Fruit();
		Vechicle truck = new Vechicle();
		System.out.println("pinaaple is a fruit"+(pineapple instanceof Fruit));
		System.out.println("truck  is a vechicle"+(truck instanceof Vechicle));
		
	}

}
