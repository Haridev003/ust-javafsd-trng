package Testing;

import java.util.Optional;

public class Optional6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Optional<String> strOptional= Optional.of("ONETWOTHREE");
        Optional<String> srOptional1= strOptional.map(String::toLowerCase);
        srOptional1.ifPresent(System.out::println);
	}

}
