import java.util.Locale;
import java.util.Scanner;

public class leitor_peca {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int cod1 = sc.nextInt();
		int peca1 = sc.nextInt();
		double valorpeca1 = sc.nextDouble();
		
		int cod2 = sc.nextInt();
		int peca2 = sc.nextInt();
		double valorpeca2 = sc.nextDouble();
		
		
		
		double total = valorpeca1 * peca1 + peca2 * valorpeca2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
			sc.close();
		
	}

}
