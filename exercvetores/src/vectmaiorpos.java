import java.util.Locale;
import java.util.Scanner;

public class vectmaiorpos {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double [n];
		double maior;
		int posmaior;
		
		for (int i =0; i<n; i++) {
			System.out.println("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		for (int i = 0; i<n; i++) {
			
		}
		
		maior = vect[0];
		posmaior = 0;
		
		for (int i = 0; i<n; i++) {
			if (vect[i] > maior) {
				maior = vect[i];
				posmaior = i;
			}
		}
		
		System.out.printf("MAIOR VALOR = %.1f/n", maior);
		System.out.printf("POSICAO DO MAIOR VALOR = ", posmaior);
		
		
		sc.close();
	}

}
