package Testing;
interface Sayable2{
	void say();
}

public class MethodReferance3 {
	
	public static void saySomething() {
		System.out.println("Hello,this is static method ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sayable2  sayable = MethodReferance3::saySomething;
		sayable.say();
		
		
	}

}
