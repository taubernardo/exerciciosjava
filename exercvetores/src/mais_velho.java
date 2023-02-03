import java.util.Locale;
import java.util.Scanner;

public class mais_velho {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		String[] a = new String[n];
		int[] b = new int[n];
		int maioridade = b[0];
		int posicaomaior = 0;
		
		for (int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa", i+1);
			System.out.println("\nNome: ");
			a[i] = sc.nextLine();
			System.out.println("\nIdade: ");
			b[i] = sc.nextInt();
		}
		
		for (int i=0; i<n; i++) {
			if (b[i] > maioridade) {
				maioridade = b[i];
				posicaomaior = i;
			}
		}
		
		System.out.printf("PESSOA MAIS VELHA: %s\n", a[posicaomaior]);
		
		
		
		
		sc.close();
	}

}
