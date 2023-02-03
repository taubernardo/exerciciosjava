import java.util.Locale;
import java.util.Scanner;

public class abaixo_da_media {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double[] vec = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Digite um numero: ");
			vec[i] = sc.nextDouble();
		}
		
		double sum = 0;
		
		for (int i=0; i<n; i++) {
			sum += vec[i];
		}
		
		double med = sum / n;
		
		System.out.printf("MEDIA DO VETOR = %.3f%n", med);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		
		for (int i=0; i<n; i++) {
			if (vec[i] < med) {
				System.out.printf("%.1f%n", vec[i]);
			}
		}
		
		
		sc.close();
	}
	

}
