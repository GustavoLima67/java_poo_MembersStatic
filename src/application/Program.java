package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = circunFerence(radius);
		double v = Volume(radius);
		
		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);
		
		
		sc.close();
	}
	
	public static double circunFerence(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double Volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
	

}
