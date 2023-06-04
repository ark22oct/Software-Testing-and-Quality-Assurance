package main;

public class Triclass {
	
	public static String classify(int X, int Y, int Z) {
		String scaleneString = "scalene";
		String equilateralString = "equilateral";
		String isoscelesString = "isosceles";
		String invalidString = "not a triangle";
		
		System.out.println("Side A = " + X + " Side B = "+ Y + " Side C = " + Z);
		
		if((X + Y) < Z || (X + Z) < Y || (Y + Z) < X) {
			System.out.println("Invalid triangle");
			return invalidString;
		}
		
		if(X <= 0 || X > 10 || Y <= 0 || Y > 10 || Z <= 0 || Z > 10) {
			System.out.println("Invalid triangle");
			return invalidString;
		}
		
		if(X != Y && Y != Z && X != Z) {
			System.out.println("Scalene triangle");
			return scaleneString;
		}
		
		else {
			if(X == Y && Y == Z) {
				System.out.println("Equilateral triangle");
				return equilateralString;
			}
			else
				System.out.println("Isosceles triangle");
				return isoscelesString;
		}

}
}
