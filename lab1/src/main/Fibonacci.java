package main;

public class Fibonacci {
	
	 public static int fibonacci_iterative (int n) {
		
		if (n<=1)
	
			return 1;
			
		return fibonacci_iterative(n-1) + fibonacci_iterative(n-2);

}
}
