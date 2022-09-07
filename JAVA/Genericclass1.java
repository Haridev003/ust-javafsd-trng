package com.ust2;

class Main_03{
	public static void main(String [] args) {
		GenericsClass<Integer>intObj= new GenericsClass<>(5);
		System.out.println("Generic class returns:"+intObj.getData());
		GenericsClass<String>stringObj= new GenericsClass<>("java programming");
		System.out.println("Generic class returns:"+stringObj.getData());
		
	}
}
class GenericsClass <T>
{
	private T data;
	public GenericsClass(T data) {
		this.data=data;
		
	}
	public T getData() {
		return this.data;
	}
}
