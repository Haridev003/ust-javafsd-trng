package Testing;

interface TestInterface
{
	public void square (int a);
	
	default void show() {
		System.out.println("Default Method Executed");
	}
}



public class TestClass implements TestInterface {
	
	 public void square(int a) {
     	System.out.println(a*a);
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TestClass d = new TestClass();
       d.square(4);
       d.show();
     
	}

}
