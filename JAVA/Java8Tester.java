package Testing;

public class Java8Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Vehicle vehicle = new Car();
      vehicle.print();
    		  
    		  
	}

}

interface Vehicle{
	
	default void print() {
		System.out.println("I am vehicle");
	}
	
	static void blowHorn() {
		System.out.println("Blowing horn!!! ");
	}
	
}
interface FourWheel{
	default void print() {
		System.out.println("I am a four wheeler");
	}
}

class Car implements Vehicle,FourWheel {
	
	public void print() {
		Vehicle.super.print();
		FourWheel.super.print();
		Vehicle.blowHorn();
		System.out.println("Iam a car !");
	}
}