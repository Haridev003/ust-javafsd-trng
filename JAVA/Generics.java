package com.ust2;

public class Generics<T> {
	
	T t;
	public T get() {
		return t;
		
	}
	public void set(T t)
	{
		this.t=t;
		
	}
	
	public static void main(String args) {
		
		Generics<Integer> g = new Generics<>();
		g.set(100);
		System.out.println(g.get());
		
		
		
	}

}
