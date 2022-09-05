package com.ust2;

class Main18{
	public static void main(String args[]) {
		String str1="Learn java";
		int  result;
		result=str1.indexOf('j');
		System.out.println(result);
		
		result=str1.indexOf('a');
		System.out.println(result);
		
		result=str1.indexOf('J');
		System.out.println(result);
		
		result=str1.indexOf("ava");
		System.out.println(result);
		result=str1.indexOf("java");
		System.out.println(result);
		result=str1.indexOf(" ");
		System.out.println(result);
		
		
		
	}
}
