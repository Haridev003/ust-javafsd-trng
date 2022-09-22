package Testing;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		List <String> str = new ArrayList<>();
		
		str.add("abc");
		str.add("xyz");
		str.add("pqr");
		
		Predicate sp= s->s.equals("abc");
		Stream sr =str.stream().filter(sp);
		System.out.println(sr.collect(Collectors.toList()));
		
		
	}

}
