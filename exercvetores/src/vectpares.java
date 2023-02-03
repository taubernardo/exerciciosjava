import java.util.Locale;
import java.util.Scanner;

public class vectpares {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		int qtpares = 0;
		
		for (int i = 0; i<n; i++) {
			System.out.println("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS PARES: ");
		
		for (int i = 0; i<n; i++) {
			if (vect[i] % 2 == 0) {
				System.out.printf("%d ", vect[i]);
				qtpares++;
			}
		}
		System.out.println();
		System.out.printf("QUANTIDADE DE PARES: %d%n", qtpares);
		
		
		
		
		sc.close();
		
	}
}
