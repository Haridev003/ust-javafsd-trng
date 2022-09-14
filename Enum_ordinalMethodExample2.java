package com.ust2;

public class Enum_ordinalMethodExample2 {

	enum Position{
		Reema("Panda"),Himanshu("Bhardwaj"),Geethanjali("Sharma");
		String IName;
		Position(String s){
			IName=s;
		}
		String showPosition() {
			return IName;
		}
	}
	public static void main(String [] args) {
		for(Position pos: Position.values()) {
			int val= pos.ordinal()+1;
			System.out.println("Firstname="+pos+"\nLastname ="+pos.showPosition()+"\nPosition in class ="+val);
			System.out.println();
		}
	}}

