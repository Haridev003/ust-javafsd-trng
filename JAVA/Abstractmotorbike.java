package com.ust2;

abstract class Abstractmotorbike {
	abstract void brake();
	}
class SprotBike extends Abstractmotorbike{
	public void brake() {
		System.out.println("sportbike brake");
	}
}
class MountainBike extends Abstractmotorbike{
	public void brake() {
		System.out.println("mountainbike brake");
	}
}
class Main_3{
	 public static void main(String args) {
		 MountainBike m1 = new MountainBike();
		 m1.brake();
		 SprotBike s1 = new SprotBike();
		 s1.brake();
		 
	 }
}