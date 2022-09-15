package com.ust2;
 abstract class Animal_1{
	 abstract void sound();
	 
 }
public class NamelessClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Animal_1 a = new Animal_1() {
        void sound() {
        	System.out.println("Animal sound");
        }
        };
        
        a.sound();
	}

}
