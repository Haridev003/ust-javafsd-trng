package Testing;

import java.util.Optional;

public class Optional3 {

	
public static void main (String args[]) {
	
	
	Optional <Object> objOptional = Optional.ofNullable(null);
	System.out.println(objOptional.isPresent());
	Optional <Object> strOptional = Optional.ofNullable("one");
	System.out.println(strOptional.isPresent());
	
	
	
	
}
	
	
	
	
}
