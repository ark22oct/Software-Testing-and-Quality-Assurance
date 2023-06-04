package main;

   public class Calculation {
	   
	public static int findMax(int arr[]){
		/*if we left it as int max = 0 then it would simply compare 0 always to the arr[] and not traverse through
		 * the array and compare each index value to determine the actual max*/
		int max = arr[0];
		
		for (int i=1; i < arr.length; i++){
			
			if (max < arr[i])
				
				max=arr[i]; 
			}
		
		return max;}
	
	
	public static int cube(int n){
		
		return n*n*n; 
		
		}
		
   }
