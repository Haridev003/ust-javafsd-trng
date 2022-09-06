package com.ust2;

 interface Language {
void getName(String name );
}
 class ProgrammingLanguage implements Language{
	 
		public void getName(String name) {
			System.out.println("programming language"+name);
		
	 }
 }
 class Main_5 {
	 public static void main(String args[]) {
		 ProgrammingLanguage language = new ProgrammingLanguage();
		 language.getName("Java");
	 }
 }
