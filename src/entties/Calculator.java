package entties;

public class Calculator {
	
	public final static double PI = 3.14159;
	
	public static double circuference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * Math.pow(radius, 3) / 3.0;
	}
}
