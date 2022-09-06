package com.ust2;

abstract  class AbstractAnimal {
	abstract void makesound();
	public void eat() {
		System.out.println("i can eat");
	}

}
class  Dog_1 extends AbstractAnimal{
	public void makesound() {
		System.out.println("brak brak");
	}
}
class Main_2{
	public static void main(String args[]) {
		Dog_1 d1 = new Dog_1();
		d1.makesound();
		d1.eat();
	}
}