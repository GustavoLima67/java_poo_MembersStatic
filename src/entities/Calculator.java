package entities;

public class Calculator {

	public final double PI = 3.14159;

	public  double circunFerence(double radius) {
		return 2.0 * PI * radius;
	}
	
	public  double Volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
	
}
