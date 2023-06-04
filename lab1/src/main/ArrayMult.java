package main;

public class ArrayMult {
	
	public int[] mult(int[] array1, int[] array2) {
		int[] longArray = array1;
		int[] smallArray = array2;
		
		if (array2.length > array1.length) {
			smallArray = array1;
			longArray = array2;
		}
		
		int[] outArray = new int[longArray.length];
		
		for (int i = 0; i < longArray.length; i++) {
			
			if (i < smallArray.length) {
				outArray[i] = array1[i] * array2[i];
			}
			else if (i > smallArray.length) {
				outArray[i] = longArray[i];
			}
		}
	return outArray;
}

//	public static void main (String[] args){
//		int[] testArray1 = {1,2,3,4};
//		int[] testArray2 = {5,6,7};
//		mult(testArray1, testArray2);
//}
	}