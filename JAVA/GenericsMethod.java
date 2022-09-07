package com.ust2;

public class GenericsMethod {
 public static <T>boolean isEqual(Genericstype<T>g1,Genericstype<T>g2){
	 return g1.get().equals(g2.get());
	 
 }
 public static void main(String args[]) {
	 Genericstype<String>g1=new Genericstype<>();
	 g1.set("Pankaj");
	 Genericstype<String>g2=new Genericstype<>();
	 g2.set("Pankaj");
	 boolean isEqual=GenericsMethod.<String>isEqual(g1,g2);
	 isEqual = GenericsMethod.isEqual(g1,g2);
	 
	 
 }
}
class Genericstype<T>{
	T obj;
	public T get() {
		return this.obj;
		
	}
	public void set(T obj) {
		this.obj=obj;
		
	}
	
}
