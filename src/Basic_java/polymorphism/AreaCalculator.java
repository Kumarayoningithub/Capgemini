package polymorphism;

public class AreaCalculator {
	public static double CalculateArea(double side) {
		return side*side;
	}
	
	public static double CalculateArea(double length, double breadth) {
		return length*breadth;
	}
	
	public static float CalculateArea(float radius) {
		
		return (3.14f*radius)*radius;
	}
	
	
	
	

}
