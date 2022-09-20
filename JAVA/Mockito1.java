package Testing;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class Mockito1 {

	@Test
	public void test() {
	//	fail("Not yet implemented");
	   System.out.println("in test method");
	   List <String> mocklist = mock(List.class);
	   when (mocklist.size()).thenReturn(5);
	   assertTrue(mocklist.size()==7);
	   System.out.println("end of the test method");
		
	}

}
