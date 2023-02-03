package application;

import java.util.Locale;
import java.util.Scanner;

import util.Converter;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double dollars = sc.nextDouble();
		
		double result = Converter.dollarToReal(dollars, dollarPrice);
		
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		
		sc.close();
		
	}

}
