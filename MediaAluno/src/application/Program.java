package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Notas;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Notas nota = new Notas();
		nota.name = sc.nextLine();
		nota.a = sc.nextDouble();
		nota.b = sc.nextDouble();
		nota.c = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", nota.Final());
		
		if (nota.Final() < 60.00) {
			System.out.println("FAILED");
			System.out.printf("Missing %.2f%n Points", nota.faltaPonto());
		} else {
			System.out.println("PASS");
		}
		
		
		sc.close();
		
	}

}
