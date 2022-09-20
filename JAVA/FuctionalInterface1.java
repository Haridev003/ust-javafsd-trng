package Testing;

@FunctionalInterface 
interface sayable{
	void say(String msg);
	int hashCode();
	String toString();
	boolean equals(Object obj);
}

public class FuctionalInterface1  implements sayable{
	
	public void say(String msg) {
		System.out.println(msg);
	}
	
	public static void main(String [] args) {
		
		
		FuctionalInterface1 fie = new FuctionalInterface1();
		
		fie.say("Hello there");
		
		
	}
	

}
