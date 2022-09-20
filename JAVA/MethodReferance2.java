package Testing;

public class MethodReferance2 {
	
	public static void ThreadStatus() {
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Thread t2 = new Thread(MethodReferance2::ThreadStatus);
		t2.start();
	}

}
