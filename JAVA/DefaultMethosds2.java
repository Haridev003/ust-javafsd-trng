package Testing;

interface Sayable5{
	 
	default void say() {
		System.out.println("Hello, this is default method");
	}
	
	void sayMore(String msg);
	
	static void sayLouder(String msg) {
		System.out.println(msg);
	}
}


public class DefaultMethosds2 implements Sayable5 {
	
	public void sayMore(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethosds2 dm = new DefaultMethosds2();
		dm.say();
		dm.sayMore("Work is worship");
		Sayable5.sayLouder("hello..");
	}

}
