package Testing;

public class MethodReferance4 {

	public void printMsg() {
		System.out.println("Hello, this is instance method");
	}
	
	public static void main(String args[]) {
		Thread t2= new Thread(new MethodReferance4()::printMsg);
		t2.start();
		
	}
	
	
}

