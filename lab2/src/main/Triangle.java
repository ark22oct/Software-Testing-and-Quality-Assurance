package main;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class Triangle {
	
	public int side1, side2, side3;
	
	public Triangle (int side1, int side2, int side3) {
		
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3; 
	
	if (side1 > side2 + side3 || side2 > side1 + side3 || side3 > side1 + side2 ) {
		System.out.println("Not a triangle (1 side should be shorter than the addition of the other 2 sides)");
		throw new IllegalArgumentException("Not a triangle");
	}
	
	if (side1 <= 0 || side2 <=0 || side3 <=0 ) {
		System.out.println("Should only be positive numbers!");
		throw new IllegalArgumentException("Positive numbers only!");
		}
	
	}
	
	public double calculateArea () {
		//Heron's Formula for area of a triangle
		
		double s = (side1 + side2 + side3) * 0.5;
		System.out.println("\t s=" + s);
		
		double result = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		System.out.println("\t result=" + result);
		
		return result; 
		}

}
