package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		System.out.println("Enter rectangle width and height: ");
		rect.a = sc.nextDouble();
		rect.b = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("PERIMETER = %.2f%n", rect.perimetro());
		System.out.printf("AREA = %.2f%n", rect.diagonal());
		
		sc.close();
		
		
	}

}
