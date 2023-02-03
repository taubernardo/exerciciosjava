import java.util.Locale;
import java.util.Scanner;

public class alturasvect {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		String[] vectname = new String[n];
		double[] vectaltura = new double[n];
		int[] vectidade = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa", i+1);
			System.out.print("Nome: ");
			vectname[i] = sc.next();
			System.out.print("Idade: ");
			vectidade[i] = sc.nextInt();
			System.out.print("Altura: ");
			vectaltura[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for (int i=0; i<n; i++) { 
			soma = soma + vectaltura[i];
		}
		
		double medAlturas = soma / n;
		
		System.out.printf("A altura média %.2f%n", medAlturas);
		
		
		int cont = 0;
		for (int i=0; i<n; i++) { 
			if (vectidade[i] < 16) {
				cont = cont + 1;
			}
		}
		
		double porc = cont * 100.0 / n;
		
		
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porc);
		
		for (int i=0; i<n; i++) { 
			if (vectidade[i] < 16) {
				System.out.println(vectname[i]);
			}
		}
		
		
		
		sc.close();
	}
	

}
