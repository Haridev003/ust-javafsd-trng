package com.ust2;

 interface A1 {
	 void funcA();

}
 interface B1 extends A1{
	 void funcB();
 }
class C1 implements B1{
	public void funcA() {
		System.out.println("This FuncA");
	}
	public void funcB() {
		System.out.println("This FuncB");
	}
}

public class Demo{
	public static void main(String args[]) {
		C1 obj = new C1();
		obj.funcA();
		obj.funcB();
	}
}