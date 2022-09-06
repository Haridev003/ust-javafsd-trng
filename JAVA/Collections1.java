package com.ust2;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Collections1 {
 public static void main(String args[]) {
	 
	 List lst = new ArrayList();
	 lst.add("abc");
	 lst.add(123);
	 lst.add(true);
	 lst.add(3.4);
	 //for(Object o: lst)
	 //System.out.println(o+"\n");
	 
	 
	 Iterator itr= lst.iterator();
	  while(itr.hasNext()) {
		  Object o=itr.next();
		  if(o instanceof String ) 
			  System.out.println(o.toString().toUpperCase());
		  else
		  System.out.println(o);
		 // if(itr.next() instanceof String ) 
			 // System.out.println("**"+itr.next().toString().toUpperCase());
	  }
	 
	 
	 
 }
}
