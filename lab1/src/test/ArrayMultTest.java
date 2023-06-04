package test;

import main.ArrayMult;

import static org.junit.Assert.*;

//import org.junit.Assert;

import junit.framework.TestCase;

import org.junit.Test;

public class ArrayMultTest extends TestCase {
	
    private ArrayMult am;
    private int[] checkArray1 = {4, 6, 0, 3};
    private int[] checkArray2 = {6, 0, 3, 4};

    public void setUp()  {
        am = new ArrayMult();
    }

    @Test
    public void testMult() {
        
        int [] mult1 = am.mult(checkArray1, checkArray2);
        int [] mult2 = am.mult(checkArray2, checkArray1);
        int[] expectedArray = {24, 0, 0, 12};
        		
        assertArrayEquals(expectedArray, mult1);
        assertArrayEquals(expectedArray, mult2);       
    }
    
    @Test
    public void testMultLength() {
    	
    	int[] checkArray1 = {4, 6, 0, 3, 4, 5};
    	int[] checkArray2 = {4, 6, 0, 3};
    	
    	int[] mult1 = am.mult(checkArray1, checkArray2);
    	int[] mult2 = am.mult(checkArray2,  checkArray1);
    	
    	assertEquals(checkArray1.length, mult1.length);
        assertEquals(checkArray1.length, mult2.length);  
        
    	assertEquals(checkArray1[checkArray1.length-1], mult1[mult1.length-1]);   
     
    }


}
