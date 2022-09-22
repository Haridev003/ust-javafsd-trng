package Testing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Stream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <String> lines = Arrays.asList("Walnut","Apricot","Almond");
		List <String> result = lines.stream().filter(line->!"Almond".equals(line)).collect(Collectors.toList());
		result.forEach(System.out::println);
		
		
		
		
	}

}
