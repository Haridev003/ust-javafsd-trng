package Testing;

import java.util.ArrayList;
import java.util.List;

public class Foreach2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> gamesList = new ArrayList <String>();
		
		gamesList.add("Football");
		gamesList.add("Cricket");
		gamesList.add("Chess");
		gamesList.add("Hockey");
		
		System.out.println("----- Itreating by passing lambda expression------");
		gamesList.forEach(System.out::println);

}
}
