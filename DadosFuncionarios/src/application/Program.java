package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcs;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		Funcs func = new Funcs();
		System.out.println("Name:");
		func.name = sc.nextLine();
		System.out.println("Gross Salary: ");
		func.salarioBruto = sc.nextDouble();
		System.out.println("Tax: ");
		func.taxa = sc.nextDouble();
		
		System.out.printf("%s", func.name, "$ %d", func.SalarioLiq());
		
		System.out.println("Which percentage to increase salary? ");
		double porcentagem = sc.nextDouble();
		func.aumentoSalario(porcentagem);
		
		System.out.printf("Update data: " +func);
		
		
		
		
		
		
		
		sc.close();
	}

}
