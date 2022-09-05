package com.ust2;

interface vehicle {
public abstract	String getcolor();
public abstract	String Emginetype();
public static final	int x=4;
	
	
}

public class  Interfaceexample implements vehicle {
	 public String getcolor() {
		return "blue";
	}
	 public String Emginetype() {
			return "1.5l";
		}
	    
    
}
