package Testing;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.ust2.Connection1;

public class Test_1 {

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(2,2);
		assertEquals(5,Connection1.calculate(2, 3));
	}
	
	@Test(timeout = 1000)
	@Ignore
	public void test1() {
		assertEquals("abc","Abc");
	}
	@After
	public void after() {
		System.out.println("In after");
	}
	@Before
	public void before() {
		System.out.println("In before class");
		
	}
	@AfterClass
	public void afterclass() {
		System.out.println("In after class");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("In before class");
	}
	
	

}
