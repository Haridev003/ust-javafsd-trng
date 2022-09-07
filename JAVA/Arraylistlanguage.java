package com.ust2;

import java.util.ArrayList;
 
class Main_15{
	public static void main(String ags[]) {
		
		ArrayList<String>language= new ArrayList<>();
		language.add("Java");
		language.add("Kotlin");
		language.add("C++");
		System.out.println("Arraylist:"+language);
		language.set(2, "Javascript");
		System.out.println("Modifed ArrayList:"+language);
		
	}
}