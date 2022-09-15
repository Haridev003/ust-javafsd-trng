package com.ust2;
enum size2{
	SMALL,MEDIUM,LARGE,EXTRALARGE;
	 
	public String getSize() {
		
		switch(this) {
		case SMALL: return"small";
		case MEDIUM: return"medium";
		case  LARGE: return"large";
		case  EXTRALARGE: return"extralarge";
		default: return null;
		}
	}
	public static void main(String [] args){
		System.out.println("The size of the pizzais "+size2.SMALL.getSize());
		
	}
}
 

