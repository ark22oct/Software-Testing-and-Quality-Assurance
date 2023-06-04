package test;

import main.Calculation;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import junit.framework.TestCase;
import java.lang.Math;
//import static org.junit.Assert.*;
//import org.junit.Assert;

public class CalculationTest extends TestCase {
	
		private int[] checkArray = {7,8,9};
		
	    private int maxOutput = Calculation.findMax(checkArray);
	    private int expectedMax = 9;
	    
	    private int nTest = 9;
	    private int cubeOutput = Calculation.cube(nTest);

	    @BeforeClass
	    public static void beforeClass() {
	        System.out.println("Before Class");
	    }

	    @Before
	    public static void before() {
	        System.out.println("Before Test");
	    }

	    @After
	    public static void after() {
	        System.out.println("After Test");
	    }

	    @Test
	    public void testFindMaxOpposite() {
	        if (expectedMax != maxOutput) {
	            fail("The expected maximum should always be equivalent to the max output");
	        }
	    }
	    
	    @Test
	    public void testFindMax() {
	        assertEquals(expectedMax, maxOutput);
	        
	    }
	    

	    @Test
	    public void testFindMaxNegative() {
	        int[] inputArray = {-12, -3, -4, -2}; 
	        int maxOutputNegative = Calculation.findMax(inputArray);
	        int expectedMaxNegative = -2;
	        assertEquals(expectedMaxNegative, maxOutputNegative);
	        
	    }
	    
	    @Test
	    public void testCube() {
	        int expectedCube = 729;
	        assertEquals(expectedCube, cubeOutput);    
	    }

	    @Test
	    public void testCubeSquareRoot() {
	        if (nTest != Math.cbrt(cubeOutput)) {
	            fail("n should produce the cube root of the cube output"); }            
	    }     
	    
	    @AfterClass
	    public static void afterClass() {
	        System.out.println("After Class");
	    }

}
