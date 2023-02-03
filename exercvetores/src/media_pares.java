import java.util.Locale;
import java.util.Scanner;

public class media_pares {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double[] vec = new double [n];
		int npares = 0;
		
		for (int i=0; i<n; i++) {
			System.out.println("Digite um número: ");
			vec[i] = sc.nextDouble();
		}
		
		double sum = 0;
		for (int i=0; i<n; i++) {
			if (vec[i] % 2 == 0) {
				sum += vec[i];
				npares++;
			}
		}
		
		double med = sum / npares;
		
		if (npares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			 System.out.printf("MEDIA DOS PARES = %.1f\n", med);
		}
		
		sc.close();
	}
	

}
