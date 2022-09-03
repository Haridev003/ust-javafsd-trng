package com.ust;
class A{};
class B extends A{};

public class InstanceofDemo2 {
   public static void main(String args[]) {
	   B objOfClassB = new B();
	   System.out.println("objofclassB is an instance"+(objOfClassB));
	   System.out.println("objofclassB is an instance of the parent class A"+(objOfClassB instanceof A));
   }
}
