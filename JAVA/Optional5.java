package Testing;

import java.util.Optional;

public class Optional5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Optional <String> emptyoption = Optional.empty();
		Optional <String> stroption   = Optional.of("one");
		System.out.println(emptyoption.orElseGet(()->"optional null orElseGet"));
		System.out.println(stroption.orElseGet(()->"optional null orElseGet"));
		
		
		
	}

}
