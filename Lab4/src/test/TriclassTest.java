package test;
import main.Triclass;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TriclassTest {
	private Triclass tri;
	private static int testCounter = 0;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Testing started");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("Testing finished");
	}
	
	@Before
    public void setUp() {
        testCounter++;
        System.out.println("#" + testCounter + " - started");
        tri = new Triclass();
    }

    @After
    public void tearDown() {
        System.out.println("#" + testCounter + " - finished");
    }
	
	@Test
	public final void testScalene() {
		String output = tri.classify(5, 6, 7);
		//System.out.println(output);
		assertEquals(output, "scalene");
	}
	
	//Boundary Testing
	@Test
	public final void testValidLow() {
		String output = tri.classify(5, 5, 1);
		//System.out.println(output);
		assertEquals(output, "isosceles");
	}
	
	@Test
	public final void testValidNormal() {
		String output = tri.classify(5, 5, 5);
		//System.out.println(output);
		assertEquals(output, "equilateral");
	}
	
	@Test
	public final void testValidHigh() {
		String output = tri.classify(5, 5, 10);
		//System.out.println(output);
		assertEquals(output, "isosceles");
	}
	
	@Test
	public final void testInvalidLow() {
		String output = tri.classify(5, 5, 0);
		//System.out.println(output);
		assertEquals(output, "not a triangle");
	}
	
	@Test
	public final void testInvalidHigh() {
		String output = tri.classify(5, 5, 11);
		//System.out.println(output);
		assertEquals(output, "not a triangle");
	}
	@Test
	public final void testInvalidHigh2() {
		String output = tri.classify(2, 2, 10);
		//System.out.println(output);
		assertEquals(output, "not a triangle");
	}
}
