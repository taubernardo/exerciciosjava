package estruturas_rep;

import java.util.Scanner;

public class preferencia_abastecimento {
	
	public static void main(String[] args) {
		
		System.out.println("QUAL A SUA PREFERÊNCIA: ");
		System.out.println("Digite 1. p/ Alcool");
		System.out.println("Digite 2. p/ Gasolina");
		System.out.println("Digite 3. p/ Diesel");
		System.out.println("Digite 4. p/ sair");
		
		Scanner sc = new Scanner(System.in);
		
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		
		int cod = sc.nextInt();
		
		while (cod != 4) {
			
			switch (cod) {
			case 1:
				alcool += 1;
				break;
			case 2:
				gasolina += 1;
				break;
			case 3:
				diesel += 1;
				break;
			}
				
			
			
			cod = sc.nextInt();
			
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d%n", alcool);
		System.out.printf("Gasolina: %d%n", gasolina);
		System.out.printf("Diesel: %d%n", diesel);
			
			sc.close();
		
		
	}

}