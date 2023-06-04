package main;

public class ArrayShift {
	
	public static int[] shiftOne(int[] inArray){
		
		for(int i = inArray.length-1; i > 0; i--) {
            inArray[i] = inArray[i-1];
        }
        
        inArray[0] = -1;
        
        for(int i = 0; i <inArray.length; i++) {
            System.out.print(inArray[i] + " ");
        }
        return inArray;
	}
	
    public static void main (String[] args){
    	int [] arr = {4,5,6,7};
    	shiftOne(arr);
    }

}
