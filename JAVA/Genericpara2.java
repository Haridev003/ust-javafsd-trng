package com.ust2;

class Test_1<T>{
	T obj;
	Test_1(T obj){
		this.obj=obj;
		
	}
	public T getObject() {
		return this.obj;
		
	}
}
 class Main_02{
	 public static void main(String[] args) {
		 Test_1<Integer>iObj = new Test_1<Integer>(15);
		 System.out.println(iObj.getObject());
		 Test_1<String>sObj=new Test_1<String> ("GeeksForGeeks");
		 System.out.println(sObj.getObject());
		 iObj=sObj;
	 }
 }