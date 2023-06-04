package test;
import static org.junit.Assert.*;

import org.junit.After;

import main.Triangle;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import junit.framework.TestCase;

public class TriangleTest {
	
	Triangle t1;
	Triangle t2;
	Triangle t3;
	

	@Before
	public void init () {
		t1 = new Triangle(3, 4, 5);
		t2 = new Triangle(5, 4, 3);
		t3 = new Triangle(8, 5, 5);
		//t4 = new Triangle(-1, -1, -1);
		//t5 = new Triangle(25,50,100);
	}
	
	@Test
	public void t1Test() {
		assertEquals (6, (int)t1.calculateArea());
	}
	
	@Test
	public void t2Test() {
		assertEquals (6, (int)t2.calculateArea());
	}
	
	@Test
	public void t3Test() {
		assertEquals (12,(int)t3.calculateArea());
	}
	@Test
	public void t1t2SameTest() {
		assertEquals ((int)t1.calculateArea(), (int)t2.calculateArea());
		
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void negativeTest() {
		Triangle t4 = new Triangle (-1,-1,-1);
		//assertEquals (IllegalArgumentException.class, (int)t4.calculateArea());
		
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void sizeTest() {
		Triangle t5 = new Triangle (25,50,100);
		//assertEquals (IllegalArgumentException.class, (int)t5.calculateArea());
	}
	
	//An exception is expected if a user creates a new Triangle (3,4,100) because this
	//is not a triangle, one side (100) is bigger than the addition of the other two sides (3 and 4)
	//Hence violating what it means to be a triangle!! This can be seen below via the testing method
	//sizeTest2()
	
	@Test (expected = IllegalArgumentException.class)
	public void sizeTest2 () {
		Triangle t6 = new Triangle (3,4,100);
		//assertEquals (IllegalArgumentException.class, (int)t6.calculateArea());
		
	}
}
