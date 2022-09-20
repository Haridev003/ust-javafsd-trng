package Testing;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Spy;

public class Mockito3 {
	@Spy
	List <String> spyList = new ArrayList<>();
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		//List <String> lst = new ArrayList <>();
		when(spyList.size()).thenReturn(5);
		spyList.add("Lisna");
		spyList.add("Glory");
		
		Mockito.verify(spyList).add("Lisna");
		
		//assertThat(spyList);
		
		//assertEquals("Lisna",spyList.get(0));
		
	}

}
