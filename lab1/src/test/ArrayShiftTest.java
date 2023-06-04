package test;

import main.ArrayShift;

import static org.junit.Assert.*;

//import org.junit.Assert;

import junit.framework.TestCase;

import org.junit.Test;

public class ArrayShiftTest extends TestCase {
    
	private ArrayShift as;
    private int[] inArray = {4,6,0,3,4,5,4,4,6,2};
    
    public final void setUp() {
    	as = new ArrayShift(); 
      }
    
    @Test
    public final void testShiftOneEquals() {
        int[] outArray = ArrayShift.shiftOne(inArray);
        int[] expectedArray = {-1,4,6,0,3,4,5,4,4,6};
  
        assertArrayEquals(expectedArray, outArray);
    }
    @Test
    public final void testShiftTwoIndex() {
    	int[] outArray = ArrayShift.shiftOne(inArray);
    	int[] inArray = {4,6,0,3,4,5,4,4,6,2};
    	
    	if (outArray[0] == inArray[0]){
    		fail("The first element of outArray should always be -1 whereas the inArray can only be positive");
    	}
    }
    
    @Test
    public final void testShiftThreeLength() {
    	int[] outArray = ArrayShift.shiftOne(inArray);
    	int[] inArray = {4,6,0,3,4,5,4,4,6,2};
    	
    	if (outArray.length != inArray.length) {
    		fail("The length of the output array does not match with the original array");
    	}
    }
    
    @Test
    public final void testShiftFourIndex2() {
    	int[] outArray = ArrayShift.shiftOne(inArray);
    	int[] inArray = {4,6,0,3,4,5,4,4,6,2};
    	if (inArray[0] != outArray[1]) {
    		fail("The second index of the outArray should equal the first index of the inArray");
    	}
    }
}



